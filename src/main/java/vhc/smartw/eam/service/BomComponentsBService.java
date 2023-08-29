package vhc.smartw.eam.service;

import jakarta.validation.Valid;
import jakarta.validation.Validation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.config.BomComponentsBId;
import vhc.smartw.eam.dto.BomComponentsBDto;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dtoFlat.BomComponentsBDtoFlat;
import vhc.smartw.eam.entity.BomComponentsB;
import vhc.smartw.eam.repository.BomComponentsBRepository;

import java.util.List;

@Service
@Slf4j
public class BomComponentsBService {
    @Autowired
    BomComponentsBRepository bomComponentsBRepository;

    @Autowired
    ModelMapper modelMapper;

    //list
    public List<BomComponentsB>list(){
        return bomComponentsBRepository.findAll();
    }
    //add
    public MessageResponse save(BomComponentsBDtoFlat bomComponentsBDtoFlat){
        try {
            var bomComponentsBDto = modelMapper.map(bomComponentsBDtoFlat, BomComponentsBDto.class);

            var bomComponentsBId = BomComponentsBId.builder()
                    .operationSeqNum(bomComponentsBDtoFlat.getOperationSeqNum())
                    .billSequenceId(bomComponentsBDtoFlat.getBillSequenceId())
                    .build();
            bomComponentsBDto.setBomComponentsBId(bomComponentsBId);

            var bomComponents = modelMapper.map(bomComponentsBDto, BomComponentsB.class);

             bomComponentsBRepository.save(bomComponents);

            return MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }catch (Exception e){
            log.error("Can't update bomComponents: ", e);
            return MessageResponse.builder()
                    .errorMessage("Thực hiện không thành công .")
                    .errorCode("1")
                    .result("")
                    .build();
        }
    }
}
