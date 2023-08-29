package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.config.BomOperationResourcesId;
import vhc.smartw.eam.config.BomOperationSequencesId;
import vhc.smartw.eam.dto.BomOperationResourcesDto;
import vhc.smartw.eam.dto.BomOperationSequencesDto;
import vhc.smartw.eam.dtoFlat.BomOperationResourcesDtoFlat;
import vhc.smartw.eam.dtoFlat.BomOperationSequencesDtoFlat;
import vhc.smartw.eam.entity.BomOperationResources;
import vhc.smartw.eam.entity.BomOperationSequences;
import vhc.smartw.eam.repository.BomOperationResourcesRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class BomOperationResourcesService {
    @Autowired
    BomOperationResourcesRepository bomOperationResourcesRepository;

    @Autowired
    ModelMapper modelMapper;


    //líst
    public List<BomOperationResources>list(){
        return bomOperationResourcesRepository.findAll();
    }
    //add
    public Optional<BomOperationResourcesDto> save(BomOperationResourcesDtoFlat bomOperationResourcesDtoFlat){
        try {
            var bomOperationResourcesDto = modelMapper.map(bomOperationResourcesDtoFlat, BomOperationResourcesDto.class);
            var bomOperationResourcesId = BomOperationResourcesId.builder()
                    .operationSequenceId(bomOperationResourcesDtoFlat.getOperationSequenceId())
                    .resourceSeqNum(bomOperationResourcesDtoFlat.getResourceSeqNum())
                    .resourceId(bomOperationResourcesDtoFlat.getResourceId())
                    .build();
            bomOperationResourcesDto.setBomOperationResourcesId(bomOperationResourcesId);

            var bomOperationResources = modelMapper.map(bomOperationResourcesDto, BomOperationResources.class);
            bomOperationResources = bomOperationResourcesRepository.save(bomOperationResources);

            return Optional.of(modelMapper.map(bomOperationResources, BomOperationResourcesDto.class));
        }catch (Exception e){
            log.error("Can't update bomOperationResources: {}", e);
        }

        return Optional.empty();

    }
}
