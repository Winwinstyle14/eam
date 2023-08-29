package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.dto.PerCompetencesDto;
import vhc.smartw.eam.dto.PerQualificationTypesDto;
import vhc.smartw.eam.entity.PerCompetences;
import vhc.smartw.eam.entity.PerQualificationTypes;
import vhc.smartw.eam.repository.PerQualificationTypesRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class PerQualificationTypesService {
    @Autowired
    PerQualificationTypesRepository perQualificationTypesRepository;
    @Autowired
    ModelMapper modelMapper;
    //list
    public List<PerQualificationTypes>list(){
        return perQualificationTypesRepository.findAll();
    }
    //add
    public Optional<PerQualificationTypesDto> save(PerQualificationTypesDto perQualificationTypesDto){
        try {
            var perQualificationTypes = modelMapper.map(perQualificationTypesDto, PerQualificationTypes.class);

            perQualificationTypes = perQualificationTypesRepository.save(perQualificationTypes);

            return Optional.of(modelMapper.map(perQualificationTypes, PerQualificationTypesDto.class));
        }catch (Exception e){
            log.error("Can't update perQualificationTypes: {}", e);
        }
        return Optional.empty();
    }
}
