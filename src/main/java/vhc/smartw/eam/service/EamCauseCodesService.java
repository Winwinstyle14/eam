package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.dto.EamCauseCodesDto;
import vhc.smartw.eam.dto.EamFailureCodesDto;
import vhc.smartw.eam.entity.EamCauseCodes;
import vhc.smartw.eam.entity.EamFailureCodes;
import vhc.smartw.eam.repository.EamCauseCodesRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class EamCauseCodesService {
    @Autowired
    EamCauseCodesRepository eamCauseCodesRepository;

    @Autowired
    ModelMapper modelMapper;
    //list
    public List<EamCauseCodes>list(){
        return eamCauseCodesRepository.findAll();
    }
    //add
    public Optional<EamCauseCodesDto> save(EamCauseCodesDto eamCauseCodesDto){
        try {
            var eamCauseCodes = modelMapper.map(eamCauseCodesDto, EamCauseCodes.class);

            eamCauseCodes = eamCauseCodesRepository.save(eamCauseCodes);

            return Optional.of(modelMapper.map(eamCauseCodes, EamCauseCodesDto.class));
        }catch (Exception e){
            log.error("Can't update eamCauseCodes: {}", e);
        }
        return Optional.empty();
    }
}
