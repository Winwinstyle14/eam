package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import vhc.smartw.eam.config.MtlSystemItemBId;
import vhc.smartw.eam.dto.MtlSerialNumbersDto;
import vhc.smartw.eam.dto.MtlSystemItemBDto;
import vhc.smartw.eam.dtoFlat.MtlSystemItemBDtoFlat;
import vhc.smartw.eam.entity.MtlSerialNumbers;
import vhc.smartw.eam.entity.MtlSystemItemB;
import vhc.smartw.eam.repository.MtlSystemItemBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class MtlSystemItemBService {
    @Autowired
    MtlSystemItemBRepository mtlSystemItemBRepository;

    @Autowired
    ModelMapper modelMapper;

    //list
    public List<MtlSystemItemB>list(){
        return mtlSystemItemBRepository.findAll();
    }
    //add
    public Optional<MtlSystemItemBDto> save(MtlSystemItemBDtoFlat mtlSystemItemBDtoFlat){
        try {
            var mtlSystemItemBDto = modelMapper.map(mtlSystemItemBDtoFlat,MtlSystemItemBDto.class);

            var mtlSystemItemBId = MtlSystemItemBId.builder()
                    .inventoryItemId(mtlSystemItemBDtoFlat.getInventoryItemId())
                    .organizationId(mtlSystemItemBDtoFlat.getOrganizationId())
                    .build();
            mtlSystemItemBDto.setMtlSystemItemBId(mtlSystemItemBId);
            var mtlSystemItemB = modelMapper.map(mtlSystemItemBDto, MtlSystemItemB.class);

            mtlSystemItemB = mtlSystemItemBRepository.save(mtlSystemItemB);

            return Optional.of(modelMapper.map(mtlSystemItemB, MtlSystemItemBDto.class));
        }catch (Exception e){
            log.error("Can't update Locations: {}", e);
        }
        return Optional.empty();
    }

}
