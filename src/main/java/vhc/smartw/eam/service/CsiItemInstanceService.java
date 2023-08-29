package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import vhc.smartw.eam.config.CsiItemInstanceId;
import vhc.smartw.eam.dto.CsiItemInstanceDto;
import vhc.smartw.eam.dtoFlat.CsiItemInstanceDtoFlat;
import vhc.smartw.eam.entity.CsiItemInstance;
import vhc.smartw.eam.repository.CsiItemInstanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class CsiItemInstanceService {
    @Autowired
    CsiItemInstanceRepository csiItemInstanceRepository;

    @Autowired
    ModelMapper modelMapper;

    //list
    public List<CsiItemInstance>list(){
        return csiItemInstanceRepository.findAll();
    }
    //getid
    public Optional<CsiItemInstance> getById(String instanceNumber){
        return csiItemInstanceRepository.findById(instanceNumber);
    }
    //add
    public Optional<CsiItemInstanceDto>save(CsiItemInstanceDtoFlat csiItemInstanceDtoFlat){
        try {
            //truyen dtoFlat -> Dto
            var csiItemInstanceDto = modelMapper.map(csiItemInstanceDtoFlat, CsiItemInstanceDto.class);

            var csiItemInstanceId = CsiItemInstanceId.builder()
                    .instanceId(csiItemInstanceDtoFlat.getInstanceId())
                    .inventoryItemId(csiItemInstanceDtoFlat.getInventoryItemId())
                    .instanceNumber(csiItemInstanceDtoFlat.getInstanceNumber())
                    .build();
            csiItemInstanceDto.setCsiItemInstanceId(csiItemInstanceId);

            var csiItemInstance = modelMapper.map(csiItemInstanceDto, CsiItemInstance.class);

            csiItemInstance = csiItemInstanceRepository.save(csiItemInstance);

            return Optional.of(modelMapper.map(csiItemInstance, CsiItemInstanceDto.class));
        }catch (Exception e){
            log.error("Can't update csiItemInstance: {}", e);
        }

        return Optional.empty();
    }
    //update
    public CsiItemInstance updateCsiItemInstance(CsiItemInstance csiItemInstance){
        return csiItemInstanceRepository.save(csiItemInstance);
    }
    //delete
    public void delete(String instanceNumber){
        csiItemInstanceRepository.deleteById(instanceNumber);
    }
    public boolean existsById(String instanceNumber){
        return csiItemInstanceRepository.existsById(instanceNumber);
    }
}
