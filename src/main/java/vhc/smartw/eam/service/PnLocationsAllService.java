package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.dto.MtlUnitOfMeasureTlDto;
import vhc.smartw.eam.dto.PnLocationsAllDto;
import vhc.smartw.eam.entity.MtlUnitOfMeasureTl;
import vhc.smartw.eam.entity.PnLocationsAll;
import vhc.smartw.eam.repository.PnLocationsAllRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class PnLocationsAllService {
    @Autowired
    PnLocationsAllRepository pnLocationsAllRepository;

    @Autowired
    ModelMapper modelMapper;
    //list
    public List<PnLocationsAll>list(){
        return pnLocationsAllRepository.findAll();
    }
    //add
    public Optional<PnLocationsAllDto> save(PnLocationsAllDto pnLocationsAllDto){
        try {
            var pnLocationsAll = modelMapper.map(pnLocationsAllDto, PnLocationsAll.class);

            pnLocationsAll = pnLocationsAllRepository.save(pnLocationsAll);

            return Optional.of(modelMapper.map(pnLocationsAll, PnLocationsAllDto.class));
        }catch (Exception e){
            log.error("Can't update Locations: {}", e);
        }
        return Optional.empty();
    }
}
