package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.dto.PerCompetencesDto;
import vhc.smartw.eam.entity.PerCompetences;
import vhc.smartw.eam.repository.PerCompetencesRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class PerCompetencesService {
    @Autowired
    PerCompetencesRepository perCompetencesRepository;

    @Autowired
    ModelMapper modelMapper;

    //list
    public List<PerCompetences>list(){
        return perCompetencesRepository.findAll();
    }
    //add
    public Optional<PerCompetencesDto> save(PerCompetencesDto perCompetencesDto){
        try {
            var perCompetences = modelMapper.map(perCompetencesDto, PerCompetences.class);

            perCompetences = perCompetencesRepository.save(perCompetences);

            return Optional.of(modelMapper.map(perCompetences, PerCompetencesDto.class));
        }catch (Exception e){
            log.error("Can't update perCompetences: {}", e);
        }
        return Optional.empty();
    }
}
