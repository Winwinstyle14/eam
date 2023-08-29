package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.dto.PerQualificationTypesDto;
import vhc.smartw.eam.dto.WipOpResourceInstancesDto;
import vhc.smartw.eam.dto.WipOperationResourcesDto;
import vhc.smartw.eam.dto.WipRequirementOperationsDto;
import vhc.smartw.eam.entity.PerQualificationTypes;
import vhc.smartw.eam.entity.WipOpResourceInstances;
import vhc.smartw.eam.entity.WipOperationResources;
import vhc.smartw.eam.entity.WipRequirementOperations;
import vhc.smartw.eam.repository.WipOperationResourcesRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class WipOperationResourcesService {
    @Autowired
    WipOperationResourcesRepository wipOperationResourcesRepository;

    @Autowired
    ModelMapper modelMapper;

    public List<WipOperationResourcesDto>list(){
        List<WipOperationResources>fillAll = this.wipOperationResourcesRepository.findAll();
        List<WipOperationResourcesDto>fillDto = fillAll.stream().map(per ->this.modelMapper.map(per,WipOperationResourcesDto.class))
                .collect(Collectors.toList());
        return fillDto;
    }

    //add
    /*public Optional<WipOperationResourcesDto>saveOrUpdate(WipOperationResourcesDto wipOperationResourcesDto){
        try {
            Optional<WipOperationResources>wipOperationResources  = wipOperationResourcesRepository
                    .findByCheckUnique(wipOperationResourcesDto.getWipEntityId(),
                            wipOperationResourcesDto.getOrganizationId(),
                            wipOperationResourcesDto.getRepetitiveScheduleId());
            if (wipOperationResources.isPresent()){
                WipOperationResources updateOperationResources = wipOperationResources.get();
                modelMapper.map(wipOperationResourcesDto,updateOperationResources);
                return Optional.of(modelMapper.map(wipOperationResourcesRepository.save(updateOperationResources), WipOperationResourcesDto.class));
            }else {
                WipOperationResources newWipOperationResources = modelMapper.map(wipOperationResourcesDto,WipOperationResources.class);
                return Optional.of(modelMapper.map(wipOperationResourcesRepository.save(newWipOperationResources), WipOperationResourcesDto.class));
            }
        }catch (Exception e){
            log.error("Can't update wipOperationResources: {}", e);
        }
        return Optional.empty();
    }*/


}
