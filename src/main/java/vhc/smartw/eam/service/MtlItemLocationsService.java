package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import vhc.smartw.eam.config.MtlItemLocationsId;
import vhc.smartw.eam.dto.MtlItemCategoriesDto;
import vhc.smartw.eam.dto.MtlItemLocationsDto;
import vhc.smartw.eam.dtoFlat.MtlItemLocationsDtoFlat;
import vhc.smartw.eam.entity.MtlItemCategories;
import vhc.smartw.eam.entity.MtlItemLocations;
import vhc.smartw.eam.repository.MtlItemLocationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class MtlItemLocationsService {
    @Autowired
    MtlItemLocationsRepository mtlItemLocationsRepository;

    @Autowired
    ModelMapper modelMapper;

    //list
    public List<MtlItemLocations>list(){
        return mtlItemLocationsRepository.findAll();
    }

    //add
    public Optional<MtlItemLocationsDto> save(MtlItemLocationsDtoFlat mtlItemLocationsDtoFlat){
        try {
            var mtlItemLocationsDto = modelMapper.map(mtlItemLocationsDtoFlat,MtlItemLocationsDto.class);
            var mtlItemLocationsId = MtlItemLocationsId.builder()
                    .organizationId(mtlItemLocationsDtoFlat.getOrganizationId())
                    .inventoryLocationId(mtlItemLocationsDtoFlat.getInventoryLocationId())
                    .build();
            mtlItemLocationsDto.setMtlItemLocationsId(mtlItemLocationsId);
            var mtlItemLocations = modelMapper.map(mtlItemLocationsDto, MtlItemLocations.class);

            mtlItemLocations = mtlItemLocationsRepository.save(mtlItemLocations);

            return Optional.of(modelMapper.map(mtlItemLocations, MtlItemLocationsDto.class));
        }catch (Exception e){
            log.error("Can't update ItemLocations: {}", e);
        }
        return Optional.empty();
    }

}
