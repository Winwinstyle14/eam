package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.dto.EamFailureCodesDto;
import vhc.smartw.eam.dto.EamFailureCombinationsDto;
import vhc.smartw.eam.entity.EamFailureCodes;
import vhc.smartw.eam.entity.EamFailureCombinations;
import vhc.smartw.eam.repository.EamFailureCodesRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class EamFailureCodesService {
    @Autowired
    EamFailureCodesRepository eamFailureCodesRepository;

    @Autowired
    ModelMapper modelMapper;

    //list
    public List<EamFailureCodes>list(){
        return eamFailureCodesRepository.findAll();
    }
    //add
    public Optional<EamFailureCodesDto> save(EamFailureCodesDto eamFailureCodesDto){
        try {
            var eamFailureCodes = modelMapper.map(eamFailureCodesDto, EamFailureCodes.class);

            eamFailureCodes = eamFailureCodesRepository.save(eamFailureCodes);

            return Optional.of(modelMapper.map(eamFailureCodes, EamFailureCodesDto.class));
        }catch (Exception e){
            log.error("Can't update eamFailureCodes: {}", e);
        }
        return Optional.empty();
    }
}
