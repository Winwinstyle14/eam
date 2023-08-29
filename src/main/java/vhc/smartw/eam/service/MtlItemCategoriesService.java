package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import vhc.smartw.eam.config.MtlItemCategoriesId;
import vhc.smartw.eam.dto.MtlCategoriesDto;
import vhc.smartw.eam.dto.MtlItemCategoriesDto;
import vhc.smartw.eam.dtoFlat.MtlItemCategoriesDtoFlat;
import vhc.smartw.eam.entity.MtlCategories;
import vhc.smartw.eam.entity.MtlItemCategories;
import vhc.smartw.eam.repository.MtlItemCategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class MtlItemCategoriesService {
    @Autowired
    MtlItemCategoriesRepository mtlItemCategoriesRepository;

    @Autowired
    ModelMapper modelMapper;

    //list
    public List<MtlItemCategories>list(){
        return mtlItemCategoriesRepository.findAll();
    }

    //add
    public Optional<MtlItemCategoriesDto> save(MtlItemCategoriesDtoFlat mtlItemCategoriesDtoFlat){
        try {
            var mtlItemCategoriesDto = modelMapper.map(mtlItemCategoriesDtoFlat,MtlItemCategoriesDto.class);

            var mtlItemCategoriesId = MtlItemCategoriesId.builder()
                    .inventoryItemId(mtlItemCategoriesDtoFlat.getInventoryItemId())
                    .categoryId(mtlItemCategoriesDtoFlat.getCategoryId())
                    .organizationId(mtlItemCategoriesDtoFlat.getOrganizationId())
                    .build();
            mtlItemCategoriesDto.setMtlItemCategoriesId(mtlItemCategoriesId);
            var mtlItemCategories = modelMapper.map(mtlItemCategoriesDto, MtlItemCategories.class);

            mtlItemCategories = mtlItemCategoriesRepository.save(mtlItemCategories);

            return Optional.of(modelMapper.map(mtlItemCategories, MtlItemCategoriesDto.class));
        }catch (Exception e){
            log.error("Can't update Categories: {}", e);
        }
        return Optional.empty();
    }

}
