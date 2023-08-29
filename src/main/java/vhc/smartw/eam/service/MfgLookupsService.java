package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.dto.MfgLookupsDto;
import vhc.smartw.eam.entity.MfgLookups;
import vhc.smartw.eam.repository.MfgLookupsRepository;

import java.util.List;
import java.util.Optional;



@Service
@Slf4j
public class MfgLookupsService {
    @Autowired
    MfgLookupsRepository mfgLookupsRepository;

    @Autowired
    ModelMapper modelMapper;

    //list
    public List<MfgLookups>list(){
        return mfgLookupsRepository.findAll();
    }
    //add
    public Optional<MfgLookupsDto> save(MfgLookupsDto mfgLookupsDto){
        try {
            var mfgLookups = modelMapper.map(mfgLookupsDto, MfgLookups.class);

            mfgLookups = mfgLookupsRepository.save(mfgLookups);

            return Optional.of(modelMapper.map(mfgLookups, MfgLookupsDto.class));
        }catch (Exception e){
            log.error("Can't update lookups: {}", e);
        }
        return Optional.empty();
    }
}
