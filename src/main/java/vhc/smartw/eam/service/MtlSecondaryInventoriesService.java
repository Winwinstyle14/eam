package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import vhc.smartw.eam.config.MtlSecondaryInventoriesId;
import vhc.smartw.eam.dto.MtlParametersDto;
import vhc.smartw.eam.dto.MtlSecondaryInventoriesDto;
import vhc.smartw.eam.dtoFlat.MtlSecondaryInventoriesDtoFlat;
import vhc.smartw.eam.entity.MtlParameters;
import vhc.smartw.eam.entity.MtlSecondaryInventories;
import vhc.smartw.eam.repository.MtlSecondaryInventoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class MtlSecondaryInventoriesService {
    @Autowired
    MtlSecondaryInventoriesRepository mtlSecondaryInventoriesRepository;

    @Autowired
    ModelMapper modelMapper;
    //list
    public List<MtlSecondaryInventories>list(){
        return mtlSecondaryInventoriesRepository.findAll();
    }

    //add
    public Optional<MtlSecondaryInventoriesDto> save(MtlSecondaryInventoriesDtoFlat mtlSecondaryInventoriesDtoFlat){
        try {
            var mtlSecondaryInventoriesDto = modelMapper.map(mtlSecondaryInventoriesDtoFlat,MtlSecondaryInventoriesDto.class);
            var mtlSecondaryInventoriesId = MtlSecondaryInventoriesId.builder()
                    .organizationId(mtlSecondaryInventoriesDtoFlat.getOrganizationId())
                    .secondaryinventoryName(mtlSecondaryInventoriesDtoFlat.getSecondaryInventoryName())
                    .build();
            mtlSecondaryInventoriesDto.setMtlSecondaryInventoriesId(mtlSecondaryInventoriesId);
            var mtlSecondaryInventories = modelMapper.map(mtlSecondaryInventoriesDto, MtlSecondaryInventories.class);

            mtlSecondaryInventories = mtlSecondaryInventoriesRepository.save(mtlSecondaryInventories);

            return Optional.of(modelMapper.map(mtlSecondaryInventories, MtlSecondaryInventoriesDto.class));
        }catch (Exception e){
            log.error("Can't update SecondaryInventories: {}", e);
        }
        return Optional.empty();
    }
}
