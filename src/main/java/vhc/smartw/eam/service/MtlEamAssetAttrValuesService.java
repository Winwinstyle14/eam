package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.config.MtlAssetAttrValuesId;
import vhc.smartw.eam.dto.MtlEamAssetAttrValuesDto;
import vhc.smartw.eam.dtoFlat.MtlEamAssetAttrValuesDtoFlat;
import vhc.smartw.eam.entity.MtlEamAssetAttrValues;
import vhc.smartw.eam.repository.MtlAssetAttrValuesRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class MtlEamAssetAttrValuesService {
    @Autowired
    MtlAssetAttrValuesRepository mtlAssetAttrValuesRepository;

    @Autowired
    ModelMapper modelMapper;
    //list
    public List<MtlEamAssetAttrValues>list(){
        return mtlAssetAttrValuesRepository.findAll();
    }

    //add
    public Optional<MtlEamAssetAttrValuesDto> save(MtlEamAssetAttrValuesDtoFlat mtlEamAssetAttrValuesDtoFlat){
        try {
            var mtlEamAssetAttrValuesDto = modelMapper.map(mtlEamAssetAttrValuesDtoFlat,MtlEamAssetAttrValuesDto.class);

            var mtlAssetAttrValuesId = MtlAssetAttrValuesId.builder()
                    .associationId(mtlEamAssetAttrValuesDtoFlat.getAssociationId())
                    .inventoryItemId(mtlEamAssetAttrValuesDtoFlat.getInventoryItemId())
                    .serialNumber(mtlEamAssetAttrValuesDtoFlat.getSerialNumber())
                    .attributeCategory(mtlEamAssetAttrValuesDtoFlat.getAttributeCategory())
                    .build();
            mtlEamAssetAttrValuesDto.setMtlAssetAttrValuesId(mtlAssetAttrValuesId);
            var mtlAssetAttrValues = modelMapper.map(mtlEamAssetAttrValuesDto, MtlEamAssetAttrValues.class);

            mtlAssetAttrValues = mtlAssetAttrValuesRepository.save(mtlAssetAttrValues);

            return Optional.of(modelMapper.map(mtlAssetAttrValues, MtlEamAssetAttrValuesDto.class));
        }catch (Exception e){
            log.error("Can't update AssetAttr: {}", e);
        }
        return Optional.empty();
    }

}
