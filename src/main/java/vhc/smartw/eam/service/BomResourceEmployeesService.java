package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.config.BomResourceEmployeesId;
import vhc.smartw.eam.config.BomResourcesId;
import vhc.smartw.eam.dto.BomResourceEmployeesDto;
import vhc.smartw.eam.dto.BomResourcesDto;
import vhc.smartw.eam.dtoFlat.BomResourceEmployeesDtoFlat;
import vhc.smartw.eam.entity.BomResourceEmployees;
import vhc.smartw.eam.entity.BomResources;
import vhc.smartw.eam.repository.BomResourceEmployeesRespository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class BomResourceEmployeesService {
    @Autowired
    BomResourceEmployeesRespository bomResourceEmployeesRespository;

    @Autowired
    ModelMapper modelMapper;

    //list
    public List<BomResourceEmployees>list(){
        return bomResourceEmployeesRespository.findAll();
    }
    //add
    public Optional<BomResourceEmployeesDto>save(BomResourceEmployeesDtoFlat bomResourceEmployeesDtoFlat){
        try {
            var bomResourceEmployeesDto = modelMapper.map(bomResourceEmployeesDtoFlat, BomResourceEmployeesDto.class);
            var bomResourceEmployeesId = BomResourceEmployeesId.builder()
                    .resourceId(bomResourceEmployeesDtoFlat.getResourceId())
                    .organizationId(bomResourceEmployeesDtoFlat.getOrganizationId())
                    .personId(bomResourceEmployeesDtoFlat.getPersonId())
                    .effectiveStartDate(bomResourceEmployeesDtoFlat.getEffectiveStartDate())
                    .effectiveEndDate(bomResourceEmployeesDtoFlat.getEffectiveEndDate())
                    .instanceId(bomResourceEmployeesDtoFlat.getInstanceId())
                    .build();
            bomResourceEmployeesDto.setBomResourceEmployeesId(bomResourceEmployeesId);

            var bomResourceEmployees = modelMapper.map(bomResourceEmployeesDto, BomResourceEmployees.class);
            bomResourceEmployees = bomResourceEmployeesRespository.save(bomResourceEmployees);

            return Optional.of(modelMapper.map(bomResourceEmployees, BomResourceEmployeesDto.class));
        }catch (Exception e){
            log.error("Can't update ResourceEmployees: {}", e);
        }

        return Optional.empty();

    }
}
