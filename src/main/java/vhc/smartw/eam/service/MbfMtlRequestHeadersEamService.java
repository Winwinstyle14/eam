package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import vhc.smartw.eam.dto.*;
import vhc.smartw.eam.entity.MbfMtlRequestHeadersEam;
import vhc.smartw.eam.entity.MbfMtlRequestLinesEam;
import vhc.smartw.eam.repository.MbfMtlRequestHeadersEamRepository;
import vhc.smartw.eam.repository.MbfMtlRequestLinesEamRepository;
import vhc.smartw.eam.utils.StringTool;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class MbfMtlRequestHeadersEamService {
    @Autowired
    MbfMtlRequestHeadersEamRepository mbfMtlRequestHeadersEamRepository;
    @Autowired
    ModelMapper modelMapper;
    @Autowired
    MbfMtlRequestLinesEamRepository mbfMtlRequestLinesEamRepository;
    @Autowired
    EamAPIService eamService;

    //list
    public List<MbfMtlRequestHeadersEamDto>list(){
        List<MbfMtlRequestHeadersEam>listAll = mbfMtlRequestHeadersEamRepository.findAll();
        List<MbfMtlRequestHeadersEamDto>dtoAll = listAll.stream().map(mbf -> this.modelMapper.map(mbf, MbfMtlRequestHeadersEamDto.class))
                .collect(Collectors.toList());
        return dtoAll;
    }

    public Optional<MbfMtlRequestHeadersEamDto> getById(long id){
        final var mbfMtlRequestHeadersEamOptional = mbfMtlRequestHeadersEamRepository.findById(id);

        return mbfMtlRequestHeadersEamOptional.map(
                headersEam -> modelMapper.map(headersEam, MbfMtlRequestHeadersEamDto.class)
        );
    }

    public MessageResponse save(MbfMtlRequestHeadersEamDto mbfMtlRequestHeadersEamDto){
        try{
            if(!StringUtils.hasText(mbfMtlRequestHeadersEamDto.getRequestNumber())){
                mbfMtlRequestHeadersEamDto.setRequestNumber(StringTool.generateRequestNumber(mbfMtlRequestHeadersEamDto.getTransactionTypeId()));
            }

            final var mbfMtlRequestHeadersEamNew= modelMapper.map(mbfMtlRequestHeadersEamDto, MbfMtlRequestHeadersEam.class);

            final var mbfMtlRequestHeadersEamOptional = mbfMtlRequestHeadersEamRepository
                    .findByOrganizationIdAndRequestNumber(mbfMtlRequestHeadersEamDto.getOrganizationId(), mbfMtlRequestHeadersEamDto.getRequestNumber());

            //Save header
            if(mbfMtlRequestHeadersEamOptional.isPresent()){
                final var headersEam= mbfMtlRequestHeadersEamOptional.get();
                mbfMtlRequestHeadersEamNew.setId(headersEam.getId());
            }else{
                mbfMtlRequestHeadersEamNew.setId(null);
            }
            final var mbfMtlRequestHeadersEam = mbfMtlRequestHeadersEamRepository.save(mbfMtlRequestHeadersEamNew);

            //Save lines
            if(mbfMtlRequestHeadersEamDto.getLines() != null){
                final var mbfMtlRequestLinesEamDtos= mbfMtlRequestHeadersEamDto.getLines();
                var mbfMtlRequestLinesEamCollect = new ArrayList<MbfMtlRequestLinesEam>();
                for(var line : mbfMtlRequestLinesEamDtos){
                    final var mbfMtlRequestLinesEamNew= modelMapper.map(line, MbfMtlRequestLinesEam.class);

                    final var mbfMtlRequestLinesEamOptional = mbfMtlRequestLinesEamRepository
                            .findByHeaderIdAndLineNumber(mbfMtlRequestHeadersEam.getId(), mbfMtlRequestLinesEamNew.getLineNumber());

                    mbfMtlRequestLinesEamNew.setHeaderId(mbfMtlRequestHeadersEam.getId());

                    if(mbfMtlRequestLinesEamOptional.isPresent()){
                        final var mbfMtlRequestLinesEam = mbfMtlRequestLinesEamOptional.get();
                        mbfMtlRequestLinesEamNew.setId(mbfMtlRequestLinesEam.getId());
                    }else{
                        mbfMtlRequestLinesEamNew.setId(null);
                    }

                    mbfMtlRequestLinesEamCollect.add(mbfMtlRequestLinesEamNew);
                }

                mbfMtlRequestLinesEamRepository.saveAll(mbfMtlRequestLinesEamCollect);
            }

            //Call API xuat/nhap sang EAM
            var xuatNhapDtoOptional = generateXuatNhapDto(mbfMtlRequestHeadersEamDto);
            if(xuatNhapDtoOptional.isPresent()){
                final var xuatNhapDtoNew = xuatNhapDtoOptional.get();

                final var xuatNhapKhoResponse = eamService.xuatNhapKho(xuatNhapDtoNew);

                /* Trả về lỗi nếu call api thất bại*/
                if(xuatNhapKhoResponse.getErrorCode().equals("1")){
                    return xuatNhapKhoResponse;
                }
            }

            return MessageResponse.builder()
                    .errorCode("0")
                    .errorMessage("Tạo phiếu thành công.")
                    .build();
        }catch (Exception e){
            log.error("Can't save mbfMtlRequestHeadersEam: ", e);

            return MessageResponse.builder()
                    .errorCode("1")
                    .errorMessage(e.getMessage())
                    .build();
        }
    }

    private Optional<XuatNhapDto> generateXuatNhapDto(MbfMtlRequestHeadersEamDto mbfMtlRequestHeadersEamDto){
        try {
            var xuatNhapDtoNew = new XuatNhapDto();

            BeanUtils.copyProperties(mbfMtlRequestHeadersEamDto, xuatNhapDtoNew, "lines");

            final var mbfMtlRequestLinesEamDtoCollection= mbfMtlRequestHeadersEamDto.getLines();

            var linesEamDtoList= new ArrayList<XuatNhapDto.MbfMtlRequestLinesEamDto>();

            for(var line : mbfMtlRequestLinesEamDtoCollection){
                var mbfMtlRequestLinesEamDtoNew = new XuatNhapDto.MbfMtlRequestLinesEamDto();

                BeanUtils.copyProperties(line, mbfMtlRequestLinesEamDtoNew);

                linesEamDtoList.add(mbfMtlRequestLinesEamDtoNew);
            }
            xuatNhapDtoNew.setLines(linesEamDtoList);

            return Optional.of(xuatNhapDtoNew);
        }catch (Exception e){
            log.error(""+e);
        }

        return Optional.empty();
    }

}
