package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.dto.HrLocationsAllDto;
import vhc.smartw.eam.dto.HzLocationsDto;
import vhc.smartw.eam.entity.HrLocationsAll;
import vhc.smartw.eam.entity.HzLocations;
import vhc.smartw.eam.repository.HrLocationsAllRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class HrLocationsAllService {
    @Autowired
    HrLocationsAllRepository hrLocationsAllRepository;
    @Autowired
    ModelMapper modelMapper;

    //list
    public List<HrLocationsAll>list(){
        return hrLocationsAllRepository.findAll();
    }
    //add
    public Optional<HrLocationsAllDto> save(HrLocationsAllDto hrLocationsAllDto){
        try{
            var hrLocationsAll = modelMapper.map(hrLocationsAllDto, HrLocationsAll.class);

            hrLocationsAll = hrLocationsAllRepository.save(hrLocationsAll);

            return Optional.of(modelMapper.map(hrLocationsAll, HrLocationsAllDto.class));

        }catch (Exception e){
            log.error("Can't update hzLocationsall: {}", e);
        }

        return Optional.empty();
    }

}
