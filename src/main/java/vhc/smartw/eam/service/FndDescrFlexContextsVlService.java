package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.config.FndDescrFlexContextsVlId;
import vhc.smartw.eam.config.MtlEamAssetActivitiesId;
import vhc.smartw.eam.dto.FndDescrFlexContextsVlDto;
import vhc.smartw.eam.dto.MtlEamAssetActivitiesDto;
import vhc.smartw.eam.dtoFlat.FndDescrFlexContextsVlDtoFlat;
import vhc.smartw.eam.dtoFlat.MtlEamAssetActivitiesDtoFlat;
import vhc.smartw.eam.entity.FndDescrFlexContextsVl;
import vhc.smartw.eam.entity.MtlEamAssetActivities;
import vhc.smartw.eam.repository.FndDescrFlexContextsVlRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class FndDescrFlexContextsVlService {
    @Autowired
    FndDescrFlexContextsVlRepository  fndDescrFlexContextsVlRepository;

    @Autowired
    ModelMapper modelMapper;

    //list
    public List<FndDescrFlexContextsVl>list(){
        return fndDescrFlexContextsVlRepository.findAll();
    }
    //add
    public Optional<FndDescrFlexContextsVlDto> save(FndDescrFlexContextsVlDtoFlat fndDescrFlexContextsVlDtoFlat){
        try {
            var fndDescrFlexContextsVlDto = modelMapper.map(fndDescrFlexContextsVlDtoFlat,FndDescrFlexContextsVlDto.class);
            var fndDescrFlexContextsVlId = FndDescrFlexContextsVlId.builder()
                    .applicationId(fndDescrFlexContextsVlDtoFlat.getApplicationId())
                    .descriptiveFlexContextCode(fndDescrFlexContextsVlDtoFlat.getDescriptiveFlexContextCode())
                    .descriptiveFlexfieldName(fndDescrFlexContextsVlDtoFlat.getDescriptiveFlexfieldName())
                    .build();
            fndDescrFlexContextsVlDto.setFndDescrFlexContextsVlId(fndDescrFlexContextsVlId);

            var fndDescrFlexContextsVl = modelMapper.map(fndDescrFlexContextsVlDto, FndDescrFlexContextsVl.class);

            fndDescrFlexContextsVl = fndDescrFlexContextsVlRepository.save(fndDescrFlexContextsVl);

            return Optional.of(modelMapper.map(fndDescrFlexContextsVl, FndDescrFlexContextsVlDto.class));
        }catch (Exception e){
            log.error("Can't update fndDescrFlexContextsVl: {}", e);
        }
        return Optional.empty();
    }
}
