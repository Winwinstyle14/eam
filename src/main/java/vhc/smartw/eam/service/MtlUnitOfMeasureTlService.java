package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import vhc.smartw.eam.dto.MtlSystemItemBDto;
import vhc.smartw.eam.dto.MtlUnitOfMeasureTlDto;
import vhc.smartw.eam.entity.MtlSystemItemB;
import vhc.smartw.eam.entity.MtlUnitOfMeasureTl;
import vhc.smartw.eam.repository.MtlUnitOfMeasureTlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class MtlUnitOfMeasureTlService {
    @Autowired
    MtlUnitOfMeasureTlRepository mtlUnitOfMeasureTlRepository;

    @Autowired
    ModelMapper modelMapper;
    //list
    public List<MtlUnitOfMeasureTl>list(){
        return mtlUnitOfMeasureTlRepository.findAll();
    }
   //add
   public Optional<MtlUnitOfMeasureTlDto> save(MtlUnitOfMeasureTlDto mtlUnitOfMeasureTlDto){
       try {
           var mtlUnitOfMeasureTl = modelMapper.map(mtlUnitOfMeasureTlDto, MtlUnitOfMeasureTl.class);

           mtlUnitOfMeasureTl = mtlUnitOfMeasureTlRepository.save(mtlUnitOfMeasureTl);

           return Optional.of(modelMapper.map(mtlUnitOfMeasureTl, MtlUnitOfMeasureTlDto.class));
       }catch (Exception e){
           log.error("Can't update Locations: {}", e);
       }
       return Optional.empty();
   }
}
