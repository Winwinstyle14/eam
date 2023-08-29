package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.dto.MbfMtlRequestHeadersEamDto;
import vhc.smartw.eam.dto.MbfMtlRequestLinesEamDto;
import vhc.smartw.eam.dto.MfgLookupsDto;
import vhc.smartw.eam.entity.MbfMtlRequestHeadersEam;
import vhc.smartw.eam.entity.MbfMtlRequestLinesEam;
import vhc.smartw.eam.entity.MfgLookups;
import vhc.smartw.eam.repository.MbfMtlRequestLinesEamRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class MbfMtlRequestLinesEamService {
    @Autowired
    MbfMtlRequestLinesEamRepository mbfMtlRequestLinesEamRepository;
    @Autowired
    ModelMapper modelMapper;

    //list
    public List<MbfMtlRequestLinesEamDto>list(){
        List<MbfMtlRequestLinesEam>listAll = mbfMtlRequestLinesEamRepository.findAll();
        List<MbfMtlRequestLinesEamDto>dtoList = listAll.stream().map(mbf ->this.modelMapper.map(mbf,MbfMtlRequestLinesEamDto.class))
                .collect(Collectors.toList());
        return dtoList;
    }
    //add
    public Optional<MbfMtlRequestLinesEamDto> saveOrUpdate(MbfMtlRequestLinesEamDto mbfMtlRequestLinesEamDto){
        try{
            Optional<MbfMtlRequestLinesEam> mbfMtlRequestLinesEam1 = mbfMtlRequestLinesEamRepository
                    .findByHeaderIdAndLineNumber(mbfMtlRequestLinesEamDto.getHeaderId(),mbfMtlRequestLinesEamDto.getLineNumber());

            if (mbfMtlRequestLinesEam1.isPresent()){
                MbfMtlRequestLinesEam mbfMtlRequestLinesEam = mbfMtlRequestLinesEam1.get();
                modelMapper.map(mbfMtlRequestLinesEamDto, mbfMtlRequestLinesEam);
                return Optional.of(modelMapper.map(mbfMtlRequestLinesEamRepository.save(mbfMtlRequestLinesEam), MbfMtlRequestLinesEamDto.class));
            }else {
                MbfMtlRequestLinesEam newMbfMtlRequestLinesEam = modelMapper.map(mbfMtlRequestLinesEamDto,MbfMtlRequestLinesEam.class);
                return Optional.of(modelMapper.map(mbfMtlRequestLinesEamRepository.save(newMbfMtlRequestLinesEam), MbfMtlRequestLinesEamDto.class));
            }
        }catch (Exception e){
            log.error("Can't update mbfMtlRequestLinesEam: {}", e);
        }
        return Optional.empty();
    }

}
