package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import vhc.smartw.eam.dto.CsiIiGeolocationsDto;
import vhc.smartw.eam.dto.CsiInstanceStatusDto;
import vhc.smartw.eam.entity.CsiIiGeolocations;
import vhc.smartw.eam.entity.CsiInstanceStatus;
import vhc.smartw.eam.repository.CsiInstanceStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class CsiInstanceStatusService{
    @Autowired
    CsiInstanceStatusRepository csiInstanceStatusRepository;
    @Autowired
    ModelMapper modelMapper;


    //list
    public List<CsiInstanceStatus>list(){
        return csiInstanceStatusRepository.findAll();
    }
    //getid
    public Optional<CsiInstanceStatus> getById(Long instanceStatusId){
        return csiInstanceStatusRepository.findById(instanceStatusId);
    }
    //add
    public Optional<CsiInstanceStatusDto>save(CsiInstanceStatusDto csiInstanceStatusDto){
        try {
            var csiInstanceStatus = modelMapper.map(csiInstanceStatusDto, CsiInstanceStatus.class);

            csiInstanceStatus = csiInstanceStatusRepository.save(csiInstanceStatus);

            return Optional.of(modelMapper.map(csiInstanceStatus, CsiInstanceStatusDto.class));
        }catch (Exception e){
            log.error("Can't update csiInstanceStatus: {}", e);
        }

        return Optional.empty();
    }
    //update
    public CsiInstanceStatus updateCsiInstanceStatus(CsiInstanceStatus csiInstanceStatus){
        return csiInstanceStatusRepository.save(csiInstanceStatus);
    }
    //delete
    public void delete(Long instanceStatusId){
        csiInstanceStatusRepository.deleteById(instanceStatusId);
    }
    public boolean existsById(Long instanceStatusId){
        return csiInstanceStatusRepository.existsById(instanceStatusId);
    }
}
