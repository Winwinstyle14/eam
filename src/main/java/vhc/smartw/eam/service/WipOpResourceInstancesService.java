package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.dto.PnLocationsAllDto;
import vhc.smartw.eam.dto.WipOpResourceInstancesDto;
import vhc.smartw.eam.dto.WipRequirementOperationsDto;
import vhc.smartw.eam.entity.PnLocationsAll;
import vhc.smartw.eam.entity.WipOpResourceInstances;
import vhc.smartw.eam.entity.WipRequirementOperations;
import vhc.smartw.eam.repository.WipOpResourceInstancesRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class WipOpResourceInstancesService {
    @Autowired
    ModelMapper modelMapper;
    @Autowired
    WipOpResourceInstancesRepository wipOpResourceInstancesRepository;

    //list
    public List<WipOpResourceInstancesDto>list(){
        List<WipOpResourceInstances>fillAll = this.wipOpResourceInstancesRepository.findAll();
        List<WipOpResourceInstancesDto>fillDto = fillAll.stream().map(per ->this.modelMapper.map(per,WipOpResourceInstancesDto.class))
                .collect(Collectors.toList());
        return fillDto;
    }

    //add
    /*public Optional<WipOpResourceInstancesDto>saveOrUpdate(WipOpResourceInstancesDto wipOpResourceInstancesDto){
        try {
            Optional<WipOpResourceInstances> WipOpResourceInstances = wipOpResourceInstancesRepository
                    .findByCheckUnique(wipOpResourceInstancesDto.getOperationSeqNum(),
                            wipOpResourceInstancesDto.getResourceSeqNum(),
                            wipOpResourceInstancesDto.getInstanceId(),
                            wipOpResourceInstancesDto.getSerialNumber());
            if (WipOpResourceInstances.isPresent()){
                WipOpResourceInstances updateWipOpResourceInstances = WipOpResourceInstances.get();
                modelMapper.map(wipOpResourceInstancesDto,updateWipOpResourceInstances);
                return Optional.of(modelMapper.map(wipOpResourceInstancesRepository.save(updateWipOpResourceInstances), WipOpResourceInstancesDto.class));
            }else {
                WipOpResourceInstances newWipOpResourceInstances = modelMapper.map(wipOpResourceInstancesDto,WipOpResourceInstances.class);
                return Optional.of(modelMapper.map(wipOpResourceInstancesRepository.save(newWipOpResourceInstances), WipOpResourceInstancesDto.class));
            }
        }catch (Exception e){
            log.error("Can't update WipOpResourceInstances: {}", e);
        }
        return Optional.empty();
    }*/


}
