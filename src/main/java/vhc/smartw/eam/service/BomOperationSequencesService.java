package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.config.BomOperationSequencesId;
import vhc.smartw.eam.config.BomResourceEmployeesId;
import vhc.smartw.eam.dto.BomOperationSequencesDto;
import vhc.smartw.eam.dto.BomResourceEmployeesDto;
import vhc.smartw.eam.dtoFlat.BomOperationSequencesDtoFlat;
import vhc.smartw.eam.dtoFlat.BomResourceEmployeesDtoFlat;
import vhc.smartw.eam.entity.BomOperationSequences;
import vhc.smartw.eam.entity.BomResourceEmployees;
import vhc.smartw.eam.repository.BomOperationSequencesRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class BomOperationSequencesService {
    @Autowired
    BomOperationSequencesRepository bomOperationSequencesRepository;
    @Autowired
    ModelMapper modelMapper;

    //list
    public List<BomOperationSequences>list(){
        return bomOperationSequencesRepository.findAll();
    }
    //add
    public Optional<BomOperationSequencesDto> save(BomOperationSequencesDtoFlat bomOperationSequencesDtoFlat){
        try {
            var bomOperationSequencesDto = modelMapper.map(bomOperationSequencesDtoFlat, BomOperationSequencesDto.class);
            var bomOperationSequencesId = BomOperationSequencesId.builder()
                    .operationSequenceId(bomOperationSequencesDtoFlat.getOperationSequenceId())
                    .routingSequenceId(bomOperationSequencesDtoFlat.getRoutingSequenceId())
                    .operationSeqNum(bomOperationSequencesDtoFlat.getOperationSeqNum())
                    .build();
            bomOperationSequencesDto.setBomOperationSequencesId(bomOperationSequencesId);

            var bomOperationSequences = modelMapper.map(bomOperationSequencesDto, BomOperationSequences.class);
            bomOperationSequences = bomOperationSequencesRepository.save(bomOperationSequences);

            return Optional.of(modelMapper.map(bomOperationSequences, BomOperationSequencesDto.class));
        }catch (Exception e){
            log.error("Can't update ResourceEmployees: {}", e);
        }

        return Optional.empty();

    }
}
