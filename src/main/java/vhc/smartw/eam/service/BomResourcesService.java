package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.config.BomResourcesId;
import vhc.smartw.eam.config.EamOrgMaintDefaultsID;
import vhc.smartw.eam.dto.BomResourcesDto;
import vhc.smartw.eam.dto.EamOrgMaintDefaultsDto;
import vhc.smartw.eam.dtoFlat.BomResourcesDtoFlat;
import vhc.smartw.eam.dtoFlat.EamOrgMaintDefaultsDtoFlat;
import vhc.smartw.eam.entity.BomResources;
import vhc.smartw.eam.entity.EamOrgMaintDefaults;
import vhc.smartw.eam.repository.BomResourcesRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class BomResourcesService {
    @Autowired
    BomResourcesRepository bomResourcesRepository;
    @Autowired
    ModelMapper modelMapper;

    //list
    public List<BomResources>list(){
        return bomResourcesRepository.findAll();
    }
    //add
    public Optional<BomResourcesDto> save(BomResourcesDtoFlat bomResourcesDtoFlat){
        try {
            var bomResourcesDto = modelMapper.map(bomResourcesDtoFlat, BomResourcesDto.class);
            var bomResourcesId = BomResourcesId.builder()
                    .resourceId(bomResourcesDtoFlat.getResourceId())
                    .resourceCode(bomResourcesDtoFlat.getResourceCode())
                    .organizationId(bomResourcesDtoFlat.getOrganizationId())
                    .costCodeType(bomResourcesDtoFlat.getCostCodeType())
                    .build();
            bomResourcesDto.setBomResourcesId(bomResourcesId);

            var bomResources = modelMapper.map(bomResourcesDto, BomResources.class);
            bomResources = bomResourcesRepository.save(bomResources);

            return Optional.of(modelMapper.map(bomResources, BomResourcesDto.class));
        }catch (Exception e){
            log.error("Can't update bomResources: {}", e);
        }

        return Optional.empty();
    }
}
