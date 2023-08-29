package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.config.MtlAssetAttrValuesId;
import vhc.smartw.eam.config.MtlEamAssetAttrGroupsVId;
import vhc.smartw.eam.dto.MtlEamAssetAttrGroupsVDto;
import vhc.smartw.eam.dto.MtlEamAssetAttrValuesDto;
import vhc.smartw.eam.dtoFlat.MtlEamAssetAttrGroupsVDtoFlat;
import vhc.smartw.eam.dtoFlat.MtlEamAssetAttrValuesDtoFlat;
import vhc.smartw.eam.entity.MtlEamAssetAttrGroupsV;
import vhc.smartw.eam.entity.MtlEamAssetAttrValues;
import vhc.smartw.eam.repository.MtlEamAssetAttrGroupsVRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class MtlEamAssetAttrGroupsVService {
    @Autowired
    MtlEamAssetAttrGroupsVRepository mtlEamAssetAttrGroupsVRepository;

    @Autowired
    ModelMapper modelMapper;

    //list
    public List<MtlEamAssetAttrGroupsV>list(){
        return mtlEamAssetAttrGroupsVRepository.findAll();
    }
    //add
    public Optional<MtlEamAssetAttrGroupsVDto> save(MtlEamAssetAttrGroupsVDtoFlat mtlEamAssetAttrGroupsVDtoFlat){
        try {
            var mtlEamAssetAttrGroupsVDto = modelMapper.map(mtlEamAssetAttrGroupsVDtoFlat,MtlEamAssetAttrGroupsVDto.class);
            var mtlEamAssetAttrGroupsVId = MtlEamAssetAttrGroupsVId.builder()
                    .associationId(mtlEamAssetAttrGroupsVDtoFlat.getAssociationId())
                    .applicationId(mtlEamAssetAttrGroupsVDtoFlat.getApplicationId())
                    .descriptiveFlexContextCode(mtlEamAssetAttrGroupsVDtoFlat.getDescriptiveFlexContextCode())
                    .descriptiveFlexfieldName(mtlEamAssetAttrGroupsVDtoFlat.getDescriptiveFlexfieldName())
                    .build();
            mtlEamAssetAttrGroupsVDto.setMtlEamAssetAttrGroupsVId(mtlEamAssetAttrGroupsVId);

            var mtlEamAssetAttrGroupsV = modelMapper.map(mtlEamAssetAttrGroupsVDto, MtlEamAssetAttrGroupsV.class);

            mtlEamAssetAttrGroupsV = mtlEamAssetAttrGroupsVRepository.save(mtlEamAssetAttrGroupsV);

            return Optional.of(modelMapper.map(mtlEamAssetAttrGroupsV, MtlEamAssetAttrGroupsVDto.class));
        }catch (Exception e){
            log.error("Can't update mtlEamAssetAttrGroupsV: {}", e);
        }
        return Optional.empty();
    }
}
