package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.dto.EamFailureSetsDto;
import vhc.smartw.eam.dto.PerQualificationTypesDto;
import vhc.smartw.eam.entity.EamFailureSets;
import vhc.smartw.eam.entity.PerQualificationTypes;
import vhc.smartw.eam.repository.EamFailureSetsRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class EamFailureSetsService {
    @Autowired
    EamFailureSetsRepository eamFailureSetsRepository;
    @Autowired
    ModelMapper modelMapper;

    //list
    public List<EamFailureSets>list(){
        return eamFailureSetsRepository.findAll();
    }
    //add
    public Optional<EamFailureSetsDto> save(EamFailureSetsDto eamFailureSetsDto){
        try {
            var eamFailureSets = modelMapper.map(eamFailureSetsDto, EamFailureSets.class);

            eamFailureSets = eamFailureSetsRepository.save(eamFailureSets);

            return Optional.of(modelMapper.map(eamFailureSets, EamFailureSetsDto.class));
        }catch (Exception e){
            log.error("Can't update eamFailureSets: {}", e);
        }
        return Optional.empty();
    }
}
