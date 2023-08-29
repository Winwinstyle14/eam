package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.config.PerRatingLevelsId;
import vhc.smartw.eam.dto.PerRatingLevelsDto;
import vhc.smartw.eam.dto.PnLocationsAllDto;
import vhc.smartw.eam.dto.WipRequirementOperationsDto;
import vhc.smartw.eam.dtoFlat.PerRatingLevelsDtoFlat;
import vhc.smartw.eam.entity.PerRatingLevels;
import vhc.smartw.eam.entity.PnLocationsAll;
import vhc.smartw.eam.entity.WipRequirementOperations;
import vhc.smartw.eam.repository.WipRequirementOperationsRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class WipRequirementOperationsService {
    @Autowired
    WipRequirementOperationsRepository wipRequirementOperationsRepository;
    @Autowired
    ModelMapper modelMapper;
    //list
    public List<WipRequirementOperationsDto>list(){
        List<WipRequirementOperations>fillAll = this.wipRequirementOperationsRepository.findAll();
        List<WipRequirementOperationsDto>fillDto = fillAll.stream().map(per ->this.modelMapper.map(per,WipRequirementOperationsDto.class))
                .collect(Collectors.toList());
        return fillDto;

    }
    //add
    /*public Optional<WipRequirementOperationsDto>saveOrUpdate(WipRequirementOperationsDto wipRequirementOperationsDto){
        try {
            Optional<WipRequirementOperations> wipRequirementOperations1 = wipRequirementOperationsRepository
                    .findByCheckUnique(
                            wipRequirementOperationsDto.getOrganizationId(),
                            wipRequirementOperationsDto.getOperationSeqNum(),
                            wipRequirementOperationsDto.getRepetitiveScheduleId()
                    );
            if (wipRequirementOperations1.isPresent()){
                WipRequirementOperations wipRequirementOperations = wipRequirementOperations1.get();
                modelMapper.map(wipRequirementOperationsDto,wipRequirementOperations);
                return Optional.of(modelMapper.map(wipRequirementOperationsRepository.save(wipRequirementOperations), WipRequirementOperationsDto.class));
            }else {
                WipRequirementOperations newRequirementOperations = modelMapper.map(wipRequirementOperationsDto,WipRequirementOperations.class);
                return Optional.of(modelMapper.map(wipRequirementOperationsRepository.save(newRequirementOperations), WipRequirementOperationsDto.class));
            }
        }catch (Exception e){
            log.error("Can't update wipRequirementOperations: {}", e);
        }
        return Optional.empty();
    }*/



}
