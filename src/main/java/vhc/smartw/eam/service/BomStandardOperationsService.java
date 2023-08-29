package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.config.BomStandardOperationsId;
import vhc.smartw.eam.config.BomStructuresBId;
import vhc.smartw.eam.dto.BomStandardOperationsDto;
import vhc.smartw.eam.dto.BomStructuresBDto;
import vhc.smartw.eam.dtoFlat.BomStandardOperationsDtoFlat;
import vhc.smartw.eam.dtoFlat.BomStructuresBDtoFlat;
import vhc.smartw.eam.entity.BomStandardOperations;
import vhc.smartw.eam.entity.BomStructuresB;
import vhc.smartw.eam.repository.BomStandardOperationsRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class BomStandardOperationsService {
    @Autowired
    BomStandardOperationsRepository bomStandardOperationsRepository;
    @Autowired
    ModelMapper modelMapper;

    //list
    public List<BomStandardOperations>list(){
        return bomStandardOperationsRepository.findAll();
    }
    //add
    public Optional<BomStandardOperationsDto> save(BomStandardOperationsDtoFlat bomStandardOperationsDtoFlat){
        try {
            var  bomStandardOperationsDto = modelMapper.map(bomStandardOperationsDtoFlat, BomStandardOperationsDto.class);
            var bomStandardOperationsId = BomStandardOperationsId.builder()
                    .standardOperationId(bomStandardOperationsDtoFlat.getStandardOperationId())
                    .operationCode(bomStandardOperationsDtoFlat.getOperationCode())
                    .operationDescription(bomStandardOperationsDtoFlat.getOperationDescription())
                    .build();
            bomStandardOperationsDto.setBomStandardOperationsId(bomStandardOperationsId);


            var bomStandardOperations = modelMapper.map(bomStandardOperationsDto, BomStandardOperations.class);
            bomStandardOperations = bomStandardOperationsRepository.save(bomStandardOperations);

            return Optional.of(modelMapper.map(bomStandardOperations, BomStandardOperationsDto.class));
        }catch (Exception e){
            log.error("Can't update bomStandardOperations: {}", e);
        }

        return Optional.empty();
    }
}
