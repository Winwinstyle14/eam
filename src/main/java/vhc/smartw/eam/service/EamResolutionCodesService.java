package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.dto.EamCauseCodesDto;
import vhc.smartw.eam.dto.EamResolutionCodesDto;
import vhc.smartw.eam.entity.EamCauseCodes;
import vhc.smartw.eam.entity.EamResolutionCodes;
import vhc.smartw.eam.repository.EamResolutionCodesRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class EamResolutionCodesService {
    @Autowired
    EamResolutionCodesRepository eamResolutionCodesRepository;
    @Autowired
    ModelMapper modelMapper;
    //list
    public List<EamResolutionCodes>list(){
        return eamResolutionCodesRepository.findAll();
    }
    //add
    public Optional<EamResolutionCodesDto> save(EamResolutionCodesDto eamResolutionCodesDto){
        try {
            var eamResolutionCodes = modelMapper.map(eamResolutionCodesDto, EamResolutionCodes.class);

            eamResolutionCodes = eamResolutionCodesRepository.save(eamResolutionCodes);

            return Optional.of(modelMapper.map(eamResolutionCodes, EamResolutionCodesDto.class));
        }catch (Exception e){
            log.error("Can't update eamResolutionCodes: {}", e);
        }
        return Optional.empty();
    }
}
