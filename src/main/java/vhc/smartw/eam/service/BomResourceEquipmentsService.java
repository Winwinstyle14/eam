package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.config.BomResourceEquipmentsId;
import vhc.smartw.eam.config.BomResourcesId;
import vhc.smartw.eam.dto.BomResourceEquipmentsDto;
import vhc.smartw.eam.dto.BomResourcesDto;
import vhc.smartw.eam.dtoFlat.BomResourceEquipmentsDtoFlat;
import vhc.smartw.eam.dtoFlat.BomResourcesDtoFlat;
import vhc.smartw.eam.entity.BomResourceEquipments;
import vhc.smartw.eam.entity.BomResources;
import vhc.smartw.eam.repository.BomResourceEquipmentsRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class BomResourceEquipmentsService {
    @Autowired
    BomResourceEquipmentsRepository bomResourceEquipmentsRepository;
    @Autowired
    ModelMapper modelMapper;
    //list
    public List<BomResourceEquipments>list(){
        return bomResourceEquipmentsRepository.findAll();
    }
    //add
    public Optional<BomResourceEquipmentsDto> save(BomResourceEquipmentsDtoFlat bomResourceEquipmentsDtoFlat){
        try {
            var bomResourceEquipmentsDto = modelMapper.map(bomResourceEquipmentsDtoFlat, BomResourceEquipmentsDto.class);
            var bomResourceEquipmentsId = BomResourceEquipmentsId.builder()
                    .resourceId(bomResourceEquipmentsDtoFlat.getResourceId())
                    .organizationId(bomResourceEquipmentsDtoFlat.getOrganizationId())
                    .inventoryItemId(bomResourceEquipmentsDtoFlat.getInventoryItemId())
                    .build();
            bomResourceEquipmentsDto.setBomResourceEquipmentsId(bomResourceEquipmentsId);

            var  bomResourceEquipments = modelMapper.map(bomResourceEquipmentsDto, BomResourceEquipments.class);
            bomResourceEquipments = bomResourceEquipmentsRepository.save( bomResourceEquipments);

            return Optional.of(modelMapper.map( bomResourceEquipments, BomResourceEquipmentsDto.class));
        }catch (Exception e){
            log.error("Can't update bomResourceEquipments: {}", e);
        }

        return Optional.empty();
    }
}
