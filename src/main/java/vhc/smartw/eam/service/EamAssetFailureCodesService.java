package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.dto.EamAssetFailureCodesDto;
import vhc.smartw.eam.dto.EamAssetFailuresDto;
import vhc.smartw.eam.entity.EamAssetFailureCodes;
import vhc.smartw.eam.repository.EamAssetFailureCodesRepository;

import java.util.Optional;

@Service
@Slf4j
public class EamAssetFailureCodesService {
    @Autowired
    private EamAssetFailureCodesRepository eamAssetFailureCodesRepository;

    @Autowired
    private ModelMapper modelMapper;

    public Optional<EamAssetFailureCodesDto> getById(long id){
        var eamAssetFailureCodesOptional = eamAssetFailureCodesRepository.findById(id);

        var eamAssetFailureCodesDtoOptional = eamAssetFailureCodesOptional.map(
                eamAssetFailureCodes -> modelMapper.map(eamAssetFailureCodes, EamAssetFailureCodesDto.class)
        );

        return eamAssetFailureCodesDtoOptional;
    }

    public Optional<EamAssetFailureCodesDto> save(Long failureId, EamAssetFailureCodesDto eamAssetFailureCodesDto){
        try {
            var eamAssetFailureCodesNew = modelMapper.map(eamAssetFailureCodesDto, EamAssetFailureCodes.class);
            var eamAssetFailureCodesOptional =
                    eamAssetFailureCodesRepository.findByCheckUnique(
                            failureId,
                            eamAssetFailureCodesDto.getFailureEntryId(),
                            eamAssetFailureCodesDto.getFailureCode(),
                            eamAssetFailureCodesDto.getCauseCode(),
                            eamAssetFailureCodesDto.getResolutionCode()
                    );

            if(eamAssetFailureCodesOptional.isEmpty()){
                eamAssetFailureCodesNew.setId(null);
                eamAssetFailureCodesNew.setFailureId(failureId);
            }else{
                var eamAssetFailureCodes = eamAssetFailureCodesOptional.get();
                eamAssetFailureCodesNew.setId(eamAssetFailureCodes.getId());
            }

            var eamAssetFailureCodes = eamAssetFailureCodesRepository.save(eamAssetFailureCodesNew);

            return Optional.of(modelMapper.map(eamAssetFailureCodes, EamAssetFailureCodesDto.class));
        }catch (Exception e){
            log.error("Can't save failure codes: ", e);
        }

        return Optional.empty();
    }
}

