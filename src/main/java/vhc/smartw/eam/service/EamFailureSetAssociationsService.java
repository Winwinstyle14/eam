package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.config.EamFailureSetAssociationsId;
import vhc.smartw.eam.config.FndDescrFlexColUsageVlId;
import vhc.smartw.eam.dto.EamFailureSetAssociationsDto;
import vhc.smartw.eam.dto.FndDescrFlexColUsageVlDto;
import vhc.smartw.eam.dtoFlat.EamFailureSetAssociationsDtoFlat;
import vhc.smartw.eam.dtoFlat.FndDescrFlexColUsageVlDtoFlat;
import vhc.smartw.eam.entity.EamFailureSetAssociations;
import vhc.smartw.eam.entity.FndDescrFlexColUsageVl;
import vhc.smartw.eam.repository.EamFailureSetAssociationsRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class EamFailureSetAssociationsService {
    @Autowired
    EamFailureSetAssociationsRepository eamFailureSetAssociationsRepository;
    @Autowired
    ModelMapper modelMapper;

    //list
    public List<EamFailureSetAssociations>list(){
        return eamFailureSetAssociationsRepository.findAll();
    }
    //add
    public Optional<EamFailureSetAssociationsDto> save(EamFailureSetAssociationsDtoFlat eamFailureSetAssociationsDtoFlat){
        try {
            var eamFailureSetAssociationsDto = modelMapper.map(eamFailureSetAssociationsDtoFlat,EamFailureSetAssociationsDto.class);
            var eamFailureSetAssociationsId = EamFailureSetAssociationsId.builder()
                    .setId(eamFailureSetAssociationsDtoFlat.getSetId())
                    .inventoryItemId(eamFailureSetAssociationsDtoFlat.getInventoryItemId())
                    .build();
            eamFailureSetAssociationsDto.setEamFailureSetAssociationsId(eamFailureSetAssociationsId);

            var eamFailureSetAssociations = modelMapper.map(eamFailureSetAssociationsDto, EamFailureSetAssociations.class);

            eamFailureSetAssociations = eamFailureSetAssociationsRepository.save(eamFailureSetAssociations);

            return Optional.of(modelMapper.map(eamFailureSetAssociations, EamFailureSetAssociationsDto.class));
        }catch (Exception e){
            log.error("Can't update eamFailureSetAssociations: {}", e);
        }
        return Optional.empty();
    }
}
