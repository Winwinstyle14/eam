package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import vhc.smartw.eam.dto.HrAllOrganizationUnitsDto;
import vhc.smartw.eam.entity.HrAllOrganizationUnits;
import vhc.smartw.eam.repository.HrAllOrganizationUnitsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@Slf4j
public class HrAllOrganizationUnitsService {
    @Autowired
    HrAllOrganizationUnitsRepository hrAllOrganizationUnitsRepository;

    @Autowired
    ModelMapper modelMapper;

    public Optional<HrAllOrganizationUnitsDto> save(HrAllOrganizationUnitsDto hrAllOrganizationUnitsDto){
        try {
            var hrAllOrganizationUnits = modelMapper.map(hrAllOrganizationUnitsDto, HrAllOrganizationUnits.class);

            hrAllOrganizationUnits = hrAllOrganizationUnitsRepository.save(hrAllOrganizationUnits);

            return Optional.of(modelMapper.map(hrAllOrganizationUnits, HrAllOrganizationUnitsDto.class));
        }catch (Exception e){
            log.error("Can't update organization: {}", e);
        }

        return Optional.empty();
    }
}
