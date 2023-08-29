package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.config.MtlSerialNumbersId;
import vhc.smartw.eam.dto.MtlSecondaryInventoriesDto;
import vhc.smartw.eam.dto.MtlSerialNumbersDto;
import vhc.smartw.eam.dtoFlat.MtlSerialNumbersDtoFlat;
import vhc.smartw.eam.entity.MtlSecondaryInventories;
import vhc.smartw.eam.entity.MtlSerialNumbers;
import vhc.smartw.eam.repository.MtlSerialNumbersRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class MtlSerialNumbersService {
    @Autowired
    MtlSerialNumbersRepository mtlSerialNumbersRepository;

    @Autowired
    ModelMapper modelMapper;

    //list
    public List<MtlSerialNumbers>list(){
        return mtlSerialNumbersRepository.findAll();
    }
    //add
    public Optional<MtlSerialNumbersDto> save(MtlSerialNumbersDtoFlat mtlSerialNumbersDtoFlat){
        try {
            var mtlSerialNumbersDto = modelMapper.map(mtlSerialNumbersDtoFlat,MtlSerialNumbersDto.class);

            var mtlSerialNumbersId = MtlSerialNumbersId.builder()
                    .inventoryItemId(mtlSerialNumbersDtoFlat.getInventoryItemId())
                    .serialNumber(mtlSerialNumbersDtoFlat.getSerialNumber())
                    .currentOrganizationId(mtlSerialNumbersDtoFlat.getCurrentOrganizationId())
                    .build();
            mtlSerialNumbersDto.setMtlSerialNumbersId(mtlSerialNumbersId);
            var mtlSerialNumbers = modelMapper.map(mtlSerialNumbersDto, MtlSerialNumbers.class);

            mtlSerialNumbers = mtlSerialNumbersRepository.save(mtlSerialNumbers);

            return Optional.of(modelMapper.map(mtlSerialNumbers, MtlSerialNumbersDto.class));
        }catch (Exception e){
            log.error("Can't update Locations: {}", e);
        }
        return Optional.empty();
    }
}
