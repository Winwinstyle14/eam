package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.config.EamOrgMaintDefaultsID;
import vhc.smartw.eam.dto.EamOrgMaintDefaultsDto;
import vhc.smartw.eam.dtoFlat.EamOrgMaintDefaultsDtoFlat;
import vhc.smartw.eam.entity.EamOrgMaintDefaults;
import vhc.smartw.eam.repository.EamOrgMaintDefaultsRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class EamOrgMaintDefaultsService {
    @Autowired
    EamOrgMaintDefaultsRepository eamOrgMaintDefaultsRepository;

    @Autowired
    ModelMapper modelMapper;

    //list
    public List<EamOrgMaintDefaults>list(){
        return eamOrgMaintDefaultsRepository.findAll();
    }
    //add
    public Optional<EamOrgMaintDefaultsDto> save(EamOrgMaintDefaultsDtoFlat eamOrgMaintDefaultsDtoFlat){
        try {
            var eamOrgMaintDefaultsDto = modelMapper.map(eamOrgMaintDefaultsDtoFlat, EamOrgMaintDefaultsDto.class);

            var eamOrgMaintDefaultsID = EamOrgMaintDefaultsID.builder()
                    .objectId(eamOrgMaintDefaultsDtoFlat.getObjectId())
                    .objecttype(eamOrgMaintDefaultsDtoFlat.getObjectType())
                    .organizationId(eamOrgMaintDefaultsDtoFlat.getOrganizationId())
                    .build();
            eamOrgMaintDefaultsDto.setEamOrgMaintDefaultsID(eamOrgMaintDefaultsID);

            var eamOrgMaintDefaults = modelMapper.map(eamOrgMaintDefaultsDto,EamOrgMaintDefaults.class);
            eamOrgMaintDefaults = eamOrgMaintDefaultsRepository.save(eamOrgMaintDefaults);

            return Optional.of(modelMapper.map(eamOrgMaintDefaults, EamOrgMaintDefaultsDto.class));
        }catch (Exception e){
            log.error("Can't update organization: {}", e);
        }

        return Optional.empty();
    }
}
