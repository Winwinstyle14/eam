package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.dto.EamAssetFailuresDto;
import vhc.smartw.eam.dto.WipEntitiesDto;
import vhc.smartw.eam.entity.EamAssetFailures;
import vhc.smartw.eam.repository.EamAssetFailuresRepository;

import java.util.Optional;

@Slf4j
@Service
public class EamAssetFailuresService {
    @Autowired
    private EamAssetFailuresRepository eamAssetFailuresRepository;

    @Autowired
    private ModelMapper modelMapper;

    public Optional<EamAssetFailuresDto> getById(long id){
        var eamAssetFailuresOptional = eamAssetFailuresRepository.findById(id);

        var eamAssetFailuresDtoOptional = eamAssetFailuresOptional.map(
                eamAssetFailures -> modelMapper.map(eamAssetFailures, EamAssetFailuresDto.class)
        );

        return eamAssetFailuresDtoOptional;
    }

    public Optional<EamAssetFailuresDto> save(Long wipEntitiesId, EamAssetFailuresDto eamAssetFailuresDto){
        try {
            var eamAssetFailuresNew = modelMapper.map(eamAssetFailuresDto, EamAssetFailures.class);
            var eamAssetFailuresOptional =
                    eamAssetFailuresRepository.findBySourceIdAndFailureId(wipEntitiesId, eamAssetFailuresDto.getFailureId());

            if(eamAssetFailuresOptional.isEmpty()){
                eamAssetFailuresNew.setId(null);
                eamAssetFailuresNew.setSourceId(wipEntitiesId);
            }else{
                var eamAssetFailures = eamAssetFailuresOptional.get();
                eamAssetFailuresNew.setId(eamAssetFailures.getId());
            }

            var eamAssetFailures = eamAssetFailuresRepository.save(eamAssetFailuresNew);

            return Optional.of(modelMapper.map(eamAssetFailures, EamAssetFailuresDto.class));
        }catch (Exception e){
            log.error("Can't save failure: ", e);
        }

        return Optional.empty();
    }
}
