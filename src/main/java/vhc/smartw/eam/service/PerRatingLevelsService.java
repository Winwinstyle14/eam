package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.config.BomResourcesId;
import vhc.smartw.eam.config.PerRatingLevelsId;
import vhc.smartw.eam.dto.BomResourcesDto;
import vhc.smartw.eam.dto.PerRatingLevelsDto;
import vhc.smartw.eam.dtoFlat.BomResourcesDtoFlat;
import vhc.smartw.eam.dtoFlat.PerRatingLevelsDtoFlat;
import vhc.smartw.eam.entity.BomResources;
import vhc.smartw.eam.entity.PerRatingLevels;
import vhc.smartw.eam.repository.PerRatingLevelsRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class PerRatingLevelsService {
    @Autowired
    PerRatingLevelsRepository perRatingLevelsRepository;
    @Autowired
    ModelMapper modelMapper;

    //list
    public List<PerRatingLevelsDto>list(){
        List<PerRatingLevels>fillAll = this.perRatingLevelsRepository.findAll();
        List<PerRatingLevelsDto>fillDto = fillAll.stream().map(per ->this.modelMapper.map(per,PerRatingLevelsDto.class)).collect(Collectors.toList());
    return fillDto;

    }
    //add
    public Optional<PerRatingLevelsDto> save(PerRatingLevelsDtoFlat perRatingLevelsDtoFlat){
        try {
            var perRatingLevelsDto = modelMapper.map(perRatingLevelsDtoFlat, PerRatingLevelsDto.class);
            var perRatingLevelsId = PerRatingLevelsId.builder()
                    .ratingLevelId(perRatingLevelsDtoFlat.getRatingLevelId())
                    .build();
            perRatingLevelsDto.setPerRatingLevelsId(perRatingLevelsId);

            var perRatingLevels = modelMapper.map(perRatingLevelsDto, PerRatingLevels.class);
            perRatingLevels = perRatingLevelsRepository.save(perRatingLevels);

            return Optional.of(modelMapper.map(perRatingLevels, PerRatingLevelsDto.class));
        }catch (Exception e){
            log.error("Can't update perRatingLevels: {}", e);
        }

        return Optional.empty();
    }
}
