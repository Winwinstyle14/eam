package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import vhc.smartw.eam.dto.MtlCategoriesDto;
import vhc.smartw.eam.entity.MtlCategories;
import vhc.smartw.eam.repository.MtlCategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class MtlCategoriesService {
    @Autowired
    MtlCategoriesRepository mtlCategoriesRepository;


    @Autowired
    ModelMapper modelMapper;


    //list
    public List<MtlCategories>list(){
        return mtlCategoriesRepository.findAll();
    }

    //add
    public Optional<MtlCategoriesDto> save(MtlCategoriesDto mtlCategoriesDto){
        try {
            var mtlCategories = modelMapper.map(mtlCategoriesDto, MtlCategories.class);

            mtlCategories = mtlCategoriesRepository.save(mtlCategories);

            return Optional.of(modelMapper.map(mtlCategories, MtlCategoriesDto.class));
        }catch (Exception e){
            log.error("Can't update Categories: {}", e);
        }
        return Optional.empty();
    }
}
