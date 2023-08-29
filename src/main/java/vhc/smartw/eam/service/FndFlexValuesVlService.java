package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import vhc.smartw.eam.config.FndFlexValuesVlId;
import vhc.smartw.eam.dto.FndFlexValueSetsDto;
import vhc.smartw.eam.dto.FndFlexValuesVlDto;
import vhc.smartw.eam.dtoFlat.FndFlexValuesVlDtoFlat;
import vhc.smartw.eam.entity.FndFlexValueSets;
import vhc.smartw.eam.entity.FndFlexValuesVl;
import vhc.smartw.eam.repository.FndFlexValuesVlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class FndFlexValuesVlService {
    @Autowired
    FndFlexValuesVlRepository fndFlexValuesVlRepository;

    @Autowired
    ModelMapper modelMapper;

    //list
    public List<FndFlexValuesVl>list(){
        return fndFlexValuesVlRepository.findAll();
    }
    //lau du lieu theo id
    public Optional<FndFlexValuesVl> getById(Long flexValueId){
        return fndFlexValuesVlRepository.findById(flexValueId);
    }
    //add
    public Optional<FndFlexValuesVlDto>save(FndFlexValuesVlDtoFlat fndFlexValuesVlDtoFlat){
        try{
            var fndFlexValuesVlDto = modelMapper.map(fndFlexValuesVlDtoFlat, FndFlexValuesVlDto.class);

            var fndFlexValuesVlId = FndFlexValuesVlId.builder()
                    .flexValueId(fndFlexValuesVlDtoFlat.getFlexValueId())
                    .flexValueSetId(fndFlexValuesVlDtoFlat.getFlexValueSetId())
                    .flexValue(fndFlexValuesVlDtoFlat.getFlexValue())
                    .build();
            fndFlexValuesVlDto.setFndFlexValuesVlId(fndFlexValuesVlId);
            var fndFlexValuesVl = modelMapper.map(fndFlexValuesVlDto, FndFlexValuesVl.class);

            fndFlexValuesVl = fndFlexValuesVlRepository.save(fndFlexValuesVl);

            return Optional.of(modelMapper.map(fndFlexValuesVl, FndFlexValuesVlDto.class));
        }catch (Exception e){
            log.error("Can't update fndFlexValueSets: {}", e);
        }
        return Optional.empty();
    }
    //update
    public FndFlexValuesVl updateFndFlexValuesVl(FndFlexValuesVl fndFlexValuesVl){
        return fndFlexValuesVlRepository.save(fndFlexValuesVl);
    }
    //delete
    public boolean delete (Long flexValueId){
        try {
            fndFlexValuesVlRepository.deleteById(flexValueId);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
