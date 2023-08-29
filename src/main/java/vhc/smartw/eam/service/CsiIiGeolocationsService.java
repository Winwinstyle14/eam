package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import vhc.smartw.eam.dto.CsiIAssetsDto;
import vhc.smartw.eam.dto.CsiIiGeolocationsDto;
import vhc.smartw.eam.entity.CsiIAssets;
import vhc.smartw.eam.entity.CsiIiGeolocations;
import vhc.smartw.eam.repository.CsiIiGeolocationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class CsiIiGeolocationsService {
    @Autowired
    CsiIiGeolocationsRepository csiIiGeolocationsRepository;

    @Autowired
    ModelMapper modelMapper;

    //list
    public List<CsiIiGeolocations>list(){
        return csiIiGeolocationsRepository.findAll();
    }
    //getid
    public Optional<CsiIiGeolocations>getById(Long instanceId){
        return csiIiGeolocationsRepository.findById(instanceId);
    }
    //add
    public Optional<CsiIiGeolocationsDto>save(CsiIiGeolocationsDto csiIiGeolocationsDto){
        try {
            var csiIiGeolocations = modelMapper.map(csiIiGeolocationsDto, CsiIiGeolocations.class);

            csiIiGeolocations = csiIiGeolocationsRepository.save(csiIiGeolocations);

            return Optional.of(modelMapper.map(csiIiGeolocations, CsiIiGeolocationsDto.class));
        }catch (Exception e){
            log.error("Can't update IiGeolocations: {}", e);
        }

        return Optional.empty();
    }
    //update
    public CsiIiGeolocations updateCsiIiGeolocations(CsiIiGeolocations csiIiGeolocations){
        return csiIiGeolocationsRepository.save(csiIiGeolocations);
    }
    //delete
    public void delete(Long instanceId){
        csiIiGeolocationsRepository.deleteById(instanceId);
    }
    public boolean existsById(Long instanceId){
        return csiIiGeolocationsRepository.existsById(instanceId);
    }
}
