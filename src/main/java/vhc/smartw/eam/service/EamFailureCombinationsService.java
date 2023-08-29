package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.dto.EamFailureCombinationsDto;
import vhc.smartw.eam.dto.EamFailureSetsDto;
import vhc.smartw.eam.entity.EamFailureCombinations;
import vhc.smartw.eam.entity.EamFailureSets;
import vhc.smartw.eam.repository.EamFailureCombinationsRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class EamFailureCombinationsService {
    @Autowired
    EamFailureCombinationsRepository eamFailureCombinationsRepository;
    @Autowired
    ModelMapper modelMapper;

    //list
    public List<EamFailureCombinationsDto>list(){
        List<EamFailureCombinations>allList = eamFailureCombinationsRepository.findAll();
        List<EamFailureCombinationsDto>dtoList = allList.stream().map(eam -> this.modelMapper.map(eam,EamFailureCombinationsDto.class))
                .collect(Collectors.toList());
        return dtoList;
    }

    //add
    public Optional<EamFailureCombinationsDto> save(EamFailureCombinationsDto eamFailureCombinationsDto){
        try {
            var eamFailureCombinations = modelMapper.map(eamFailureCombinationsDto, EamFailureCombinations.class);

            eamFailureCombinations = eamFailureCombinationsRepository.save(eamFailureCombinations);

            return Optional.of(modelMapper.map(eamFailureCombinations, EamFailureCombinationsDto.class));
        }catch (Exception e){
            log.error("Can't update eamFailureCombinations: {}", e);
        }
        return Optional.empty();
    }
}
