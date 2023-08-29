package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.dto.FndDescriptiveFlexsDto;
import vhc.smartw.eam.dto.MtlUnitOfMeasureTlDto;
import vhc.smartw.eam.entity.FndDescriptiveFlexs;
import vhc.smartw.eam.entity.MtlUnitOfMeasureTl;
import vhc.smartw.eam.repository.FndDescriptiveFlexsRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class FndDescriptiveFlexsService {
    @Autowired
    FndDescriptiveFlexsRepository fndDescriptiveFlexsRepository;
    @Autowired
    ModelMapper modelMapper;

    //list
    public List<FndDescriptiveFlexs>list(){
        return fndDescriptiveFlexsRepository.findAll();
    }
    //add
    public Optional<FndDescriptiveFlexsDto> save(FndDescriptiveFlexsDto fndDescriptiveFlexsDto){
        try {
            var fndDescriptiveFlexs = modelMapper.map(fndDescriptiveFlexsDto, FndDescriptiveFlexs.class);

            fndDescriptiveFlexs = fndDescriptiveFlexsRepository.save(fndDescriptiveFlexs);

            return Optional.of(modelMapper.map(fndDescriptiveFlexs, FndDescriptiveFlexsDto.class));
        }catch (Exception e){
            log.error("Can't update fndDescriptiveFlexs: {}", e);
        }
        return Optional.empty();
    }
}
