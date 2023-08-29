package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.dto.WipOperationsDto;
import vhc.smartw.eam.entity.WipOperations;
import vhc.smartw.eam.repository.WipOperationsRepository;

import java.util.Optional;

@Service
@Slf4j
public class WipOperationsService {
    @Autowired
    private WipOperationsRepository wipOperationsRepository;

    @Autowired
    private ModelMapper modelMapper;

    public Optional<WipOperationsDto> save(Long wipEntitiesId, WipOperationsDto wipOperationsDto){
        try {
            var wipOperationsNew = modelMapper.map(wipOperationsDto, WipOperations.class);

            var wipOperationsOptional = wipOperationsRepository
                    .findByCheckUnique(wipEntitiesId, wipOperationsDto.getOperationSeqNum(),
                            wipOperationsDto.getOrganizationId(), wipOperationsDto.getRepetitiveScheduleId());

            if(wipOperationsOptional.isEmpty()){
                wipOperationsNew.setId(null);
            }else{
                var wipOperations = wipOperationsOptional.get();
                wipOperationsNew.setId(wipOperations.getId());
            }

            var wipOperations = wipOperationsRepository.save(wipOperationsNew);

            return Optional.of(modelMapper.map(wipOperations, WipOperationsDto.class));
        }catch (Exception e){
            log.error("Can't create Operation: ", e);
        }

        return Optional.empty();
    }

}