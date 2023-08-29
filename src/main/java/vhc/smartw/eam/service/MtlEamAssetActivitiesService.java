package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.config.MtlAssetAttrValuesId;
import vhc.smartw.eam.config.MtlEamAssetActivitiesId;
import vhc.smartw.eam.dto.MtlEamAssetActivitiesDto;
import vhc.smartw.eam.dto.MtlEamAssetAttrValuesDto;
import vhc.smartw.eam.dtoFlat.MtlEamAssetActivitiesDtoFlat;
import vhc.smartw.eam.dtoFlat.MtlEamAssetAttrValuesDtoFlat;
import vhc.smartw.eam.entity.MtlEamAssetActivities;
import vhc.smartw.eam.entity.MtlEamAssetAttrValues;
import vhc.smartw.eam.repository.MtlEamAssetActivitiesRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class MtlEamAssetActivitiesService {
    @Autowired
    MtlEamAssetActivitiesRepository mtlEamAssetActivitiesRepository;
    @Autowired
    ModelMapper modelMapper;
    //list
    public List<MtlEamAssetActivities>list(){
        return mtlEamAssetActivitiesRepository.findAll();
    }
    //add
    public Optional<MtlEamAssetActivitiesDto> save(MtlEamAssetActivitiesDtoFlat mtlEamAssetActivitiesDtoFlat){
        try {
            var mtlEamAssetActivitiesDto = modelMapper.map(mtlEamAssetActivitiesDtoFlat,MtlEamAssetActivitiesDto.class);

            var mtlEamAssetActivitiesId = MtlEamAssetActivitiesId.builder()
                    .activityAssociationId(mtlEamAssetActivitiesDtoFlat.getActivityAssociationId())
                    .assetActivityId(mtlEamAssetActivitiesDtoFlat.getAssetActivityId())
                    .maintenanceObjectType(mtlEamAssetActivitiesDtoFlat.getMaintenanceObjectType())
                    .maintenanceObjectId(mtlEamAssetActivitiesDtoFlat.getMaintenanceObjectId())
                    .build();
            mtlEamAssetActivitiesDto.setMtlEamAssetActivitiesId(mtlEamAssetActivitiesId);

            var mtlEamAssetActivities = modelMapper.map(mtlEamAssetActivitiesDto, MtlEamAssetActivities.class);

            mtlEamAssetActivities = mtlEamAssetActivitiesRepository.save(mtlEamAssetActivities);

            return Optional.of(modelMapper.map(mtlEamAssetActivities, MtlEamAssetActivitiesDto.class));
        }catch (Exception e){
            log.error("Can't update mtlEamAssetActivities: {}", e);
        }
        return Optional.empty();
    }

}
