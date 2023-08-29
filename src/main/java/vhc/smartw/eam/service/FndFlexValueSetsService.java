package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import vhc.smartw.eam.dto.FaAdditionsBDto;
import vhc.smartw.eam.dto.FndFlexValueSetsDto;
import vhc.smartw.eam.entity.FaAdditionsB;
import vhc.smartw.eam.entity.FndFlexValueSets;
import vhc.smartw.eam.repository.FndFlexValueSetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class FndFlexValueSetsService {
    @Autowired
    FndFlexValueSetsRepository fndFlexValueSetsRepository;

    @Autowired
    ModelMapper modelMapper;
    //list
    public List<FndFlexValueSets> list(){
        return fndFlexValueSetsRepository.findAll();
    }
    //lay theo id
    public Optional<FndFlexValueSets> getById(Long flexValueSetId){
        return fndFlexValueSetsRepository.findById(flexValueSetId);
    }
    //add
    public Optional<FndFlexValueSetsDto>save(FndFlexValueSetsDto fndFlexValueSetsDto){
        try{
            var fndFlexValueSets = modelMapper.map(fndFlexValueSetsDto, FndFlexValueSets.class);

            fndFlexValueSets = fndFlexValueSetsRepository.save(fndFlexValueSets);

            return Optional.of(modelMapper.map(fndFlexValueSets, FndFlexValueSetsDto.class));
        }catch (Exception e){
            log.error("Can't update fndFlexValueSets: {}", e);
        }
        return Optional.empty();
    }
    //update
    public FndFlexValueSets updateFndFlexValueSets(FndFlexValueSets fndFlexValueSets){
        return fndFlexValueSetsRepository.save(fndFlexValueSets);
    }
    //delete
    public boolean delete (Long flexValueSetId){
        try {
            fndFlexValueSetsRepository.deleteById(flexValueSetId);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
