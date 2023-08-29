package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.config.FndDescrFlexColUsageVlId;
import vhc.smartw.eam.dto.EamWoStatusesVDto;
import vhc.smartw.eam.dto.FndDescrFlexColUsageVlDto;
import vhc.smartw.eam.dto.MtlObjectGenealogyDto;
import vhc.smartw.eam.dtoFlat.FndDescrFlexColUsageVlDtoFlat;
import vhc.smartw.eam.entity.EamWoStatusesV;
import vhc.smartw.eam.entity.FndDescrFlexColUsageVl;
import vhc.smartw.eam.entity.MtlObjectGenealogy;
import vhc.smartw.eam.repository.EamWoStatusesVRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class EamWoStatusesVService {
    @Autowired
    EamWoStatusesVRepository eamWoStatusesVRepository;
    @Autowired
    ModelMapper modelMapper;

    //list
    public List<EamWoStatusesVDto>list(){
        List<EamWoStatusesV>listAll = eamWoStatusesVRepository.findAll();
        List<EamWoStatusesVDto>listDto = listAll.stream().map(eam -> this.modelMapper.map(eam, EamWoStatusesVDto.class))
                .collect(Collectors.toList());
        return listDto;
    }
    //ADD
    public Optional<EamWoStatusesVDto> save(EamWoStatusesVDto eamWoStatusesVDto){
        try {
            var eamWoStatusesV = modelMapper.map(eamWoStatusesVDto, EamWoStatusesV.class);

            eamWoStatusesV = eamWoStatusesVRepository.save(eamWoStatusesV);

            return Optional.of(modelMapper.map(eamWoStatusesV, EamWoStatusesVDto.class));
        }catch (Exception e){
            log.error("Can't update eamWoStatusesV: {}", e);
        }
        return Optional.empty();
    }

}
