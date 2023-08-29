package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.dto.PerAllPeopleFDto;
import vhc.smartw.eam.dto.PerCompetencesDto;
import vhc.smartw.eam.entity.PerAllPeopleF;
import vhc.smartw.eam.entity.PerCompetences;
import vhc.smartw.eam.repository.PerAllPeopleFRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class PerAllPeopleFService {
    @Autowired
    PerAllPeopleFRepository perAllPeopleFRepository;
    @Autowired
    ModelMapper modelMapper;

    //list
    public List<PerAllPeopleF>list(){
        return perAllPeopleFRepository.findAll();
    }
    //add
    public Optional<PerAllPeopleFDto> save(PerAllPeopleFDto perAllPeopleFDto){
        try {
            var perAllPeopleF = modelMapper.map(perAllPeopleFDto, PerAllPeopleF.class);

            perAllPeopleF = perAllPeopleFRepository.save(perAllPeopleF);

            return Optional.of(modelMapper.map(perAllPeopleF, PerAllPeopleFDto.class));
        }catch (Exception e){
            log.error("Can't update perAllPeopleF: {}", e);
        }
        return Optional.empty();
    }

}
