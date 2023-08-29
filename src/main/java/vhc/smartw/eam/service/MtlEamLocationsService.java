package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import vhc.smartw.eam.dto.MtlEamLocationsDto;
import vhc.smartw.eam.entity.MtlEamLocations;
import vhc.smartw.eam.repository.MtlLocationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class MtlEamLocationsService {
    @Autowired
    MtlLocationsRepository mtlLocationsRepository;

    @Autowired
    ModelMapper modelMapper;

    //list
    public List<MtlEamLocations> list(){
        return mtlLocationsRepository.findAll();
    }

    //add
    public Optional<MtlEamLocationsDto> save(MtlEamLocationsDto mtlEamLocationsDto){
        try {
            var mtlLocations = modelMapper.map(mtlEamLocationsDto, MtlEamLocations.class);

            mtlLocations = mtlLocationsRepository.save(mtlLocations);

            return Optional.of(modelMapper.map(mtlLocations, MtlEamLocationsDto.class));
        }catch (Exception e){
            log.error("Can't update Locations: {}", e);
        }
        return Optional.empty();
    }

}
