package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.config.FndDescrFlexColUsageVlId;
import vhc.smartw.eam.config.FndDescrFlexContextsVlId;
import vhc.smartw.eam.dto.FndDescrFlexColUsageVlDto;
import vhc.smartw.eam.dto.FndDescrFlexContextsVlDto;
import vhc.smartw.eam.dtoFlat.FndDescrFlexColUsageVlDtoFlat;
import vhc.smartw.eam.dtoFlat.FndDescrFlexContextsVlDtoFlat;
import vhc.smartw.eam.entity.FndDescrFlexColUsageVl;
import vhc.smartw.eam.entity.FndDescrFlexContextsVl;
import vhc.smartw.eam.repository.FndDescrFlexColUsageVlRepository;


import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class FndDescrFlexColUsageVlService {
    @Autowired
    FndDescrFlexColUsageVlRepository fndDescrFlexColUsageVlRepository;
    @Autowired
    ModelMapper modelMapper;

    //list
    public List<FndDescrFlexColUsageVl>list(){
        return fndDescrFlexColUsageVlRepository.findAll();
    }
    //add
    public Optional<FndDescrFlexColUsageVlDto> save(FndDescrFlexColUsageVlDtoFlat fndDescrFlexColUsageVlDtoFlat){
        try {
            var fndDescrFlexColUsageVlDto = modelMapper.map(fndDescrFlexColUsageVlDtoFlat,FndDescrFlexColUsageVlDto.class);
            var fndDescrFlexColUsageVlId = FndDescrFlexColUsageVlId.builder()
                    .applicationId(fndDescrFlexColUsageVlDtoFlat.getApplicationId())
                    .descriptiveFlexContextCode(fndDescrFlexColUsageVlDtoFlat.getDescriptiveFlexContextCode())
                    .descriptiveFlexfieldName(fndDescrFlexColUsageVlDtoFlat.getDescriptiveFlexfieldName())
                    .applicationColumnName(fndDescrFlexColUsageVlDtoFlat.getApplicationColumnName())
                    .build();
            fndDescrFlexColUsageVlDto.setFndDescrFlexColUsageVlId(fndDescrFlexColUsageVlId);

            var fndDescrFlexColUsageVl = modelMapper.map(fndDescrFlexColUsageVlDto, FndDescrFlexColUsageVl.class);

            fndDescrFlexColUsageVl = fndDescrFlexColUsageVlRepository.save(fndDescrFlexColUsageVl);

            return Optional.of(modelMapper.map(fndDescrFlexColUsageVl, FndDescrFlexColUsageVlDto.class));
        }catch (Exception e){
            log.error("Can't update fndDescrFlexColUsageVl: {}", e);
        }
        return Optional.empty();
    }
}
