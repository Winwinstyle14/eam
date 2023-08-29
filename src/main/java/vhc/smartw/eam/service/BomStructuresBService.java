package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.config.BomResourcesId;
import vhc.smartw.eam.config.BomStructuresBId;
import vhc.smartw.eam.dto.BomResourcesDto;
import vhc.smartw.eam.dto.BomStructuresBDto;
import vhc.smartw.eam.dtoFlat.BomResourcesDtoFlat;
import vhc.smartw.eam.dtoFlat.BomStructuresBDtoFlat;
import vhc.smartw.eam.entity.BomResources;
import vhc.smartw.eam.entity.BomStructuresB;
import vhc.smartw.eam.repository.BomStructuresBRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class BomStructuresBService {
    @Autowired
    BomStructuresBRepository bomStructuresBRepository;
    @Autowired
    ModelMapper modelMapper;

    //list
    public List<BomStructuresB>list(){
        return bomStructuresBRepository.findAll();
    }
    //add
    public Optional<BomStructuresBDto> save(BomStructuresBDtoFlat bomStructuresBDtoFlat){
        try {
            var bomStructuresBDto = modelMapper.map(bomStructuresBDtoFlat, BomStructuresBDto.class);

            var bomStructuresBId = BomStructuresBId.builder()
                    .billSequenceId(bomStructuresBDtoFlat.getBillSequenceId())
                    .assemblyItemId(bomStructuresBDtoFlat.getAssemblyItemId())
                    .build();
            bomStructuresBDto.setBomStructuresBId(bomStructuresBId);

            var BomStructuresB = modelMapper.map(bomStructuresBDto, BomStructuresB.class);
            BomStructuresB = bomStructuresBRepository.save(BomStructuresB);

            return Optional.of(modelMapper.map(BomStructuresB, BomStructuresBDto.class));
        }catch (Exception e){
            log.error("Can't update BomStructuresB: {}", e);
        }

        return Optional.empty();
    }
}
