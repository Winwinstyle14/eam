package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.dto.HzLocationsDto;
import vhc.smartw.eam.entity.HzLocations;
import vhc.smartw.eam.repository.HzLocationsRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class HzLocationsService {
    @Autowired
    HzLocationsRepository hzLocationsRepository;

    @Autowired
    ModelMapper modelMapper;

    public List<HzLocations>list(){
        return hzLocationsRepository.findAll();
    }
    //add
    public Optional<HzLocationsDto> save(HzLocationsDto hzLocationsDto){
        try{
            var hzLocations = modelMapper.map(hzLocationsDto, HzLocations.class);

            hzLocations = hzLocationsRepository.save(hzLocations);

            return Optional.of(modelMapper.map(hzLocations, HzLocationsDto.class));

        }catch (Exception e){
            log.error("Can't update hzLocations: {}", e);
        }

        return Optional.empty();
    }
}
