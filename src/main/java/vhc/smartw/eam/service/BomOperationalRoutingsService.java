package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.dto.BomDepartmentsDto;
import vhc.smartw.eam.dto.BomOperationalRoutingsDto;
import vhc.smartw.eam.entity.BomDepartments;
import vhc.smartw.eam.entity.BomOperationalRoutings;
import vhc.smartw.eam.repository.BomOperationalRoutingsRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class BomOperationalRoutingsService {
    @Autowired
    BomOperationalRoutingsRepository  bomOperationalRoutingsRepository;
    @Autowired
    ModelMapper modelMapper;

    //list
    public List<BomOperationalRoutings>list(){
        return bomOperationalRoutingsRepository.findAll();
    }
    //add
    public Optional<BomOperationalRoutingsDto> save(BomOperationalRoutingsDto bomOperationalRoutingsDto){
        try {
            var  bomOperationalRoutings = modelMapper.map(bomOperationalRoutingsDto, BomOperationalRoutings.class);

            bomOperationalRoutings = bomOperationalRoutingsRepository.save( bomOperationalRoutings);

            return Optional.of(modelMapper.map( bomOperationalRoutings, BomOperationalRoutingsDto.class));
        }catch (Exception e){
            log.error("Can't update bomOperationalRoutings: {}", e);
        }
        return Optional.empty();
    }
}
