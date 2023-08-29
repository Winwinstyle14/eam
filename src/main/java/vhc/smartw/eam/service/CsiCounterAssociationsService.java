package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import vhc.smartw.eam.dto.CsiCounterAssociationsDto;
import vhc.smartw.eam.dto.HrAllOrganizationUnitsDto;
import vhc.smartw.eam.entity.CsiCounterAssociations;
import vhc.smartw.eam.entity.HrAllOrganizationUnits;
import vhc.smartw.eam.repository.CsiCounterAssociationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class CsiCounterAssociationsService {

    @Autowired
    CsiCounterAssociationsRepository csiCounterAssociationsRepository;

    @Autowired
    ModelMapper modelMapper;

    //list
    public List<CsiCounterAssociations>list(){
        return csiCounterAssociationsRepository.findAll();
    }
    // get id
    public Optional<CsiCounterAssociations>getById(Long instanceAssociationId){
        return csiCounterAssociationsRepository.findById(instanceAssociationId);
    }
    //add
    public Optional<CsiCounterAssociationsDto> save(CsiCounterAssociationsDto csiCounterAssociationsDto){
        try {
            var csiCounterAssociations = modelMapper.map(csiCounterAssociationsDto, CsiCounterAssociations.class);

            csiCounterAssociations = csiCounterAssociationsRepository.save(csiCounterAssociations);

            return Optional.of(modelMapper.map(csiCounterAssociations, CsiCounterAssociationsDto.class));
        }catch (Exception e){
            log.error("Can't update csiCounterAssociations: {}", e);
        }

        return Optional.empty();
    }
    //update
    public CsiCounterAssociations updateCsiCounterAssociations(CsiCounterAssociations csiCounterAssociations){
        return csiCounterAssociationsRepository.save(csiCounterAssociations);
    }
    //delete
    public void  delete(Long instanceAssociationId){
        csiCounterAssociationsRepository.deleteById(instanceAssociationId);
    }
    public boolean existsById(Long instanceAssociationId){
        return csiCounterAssociationsRepository.existsById(instanceAssociationId);
    }
}
