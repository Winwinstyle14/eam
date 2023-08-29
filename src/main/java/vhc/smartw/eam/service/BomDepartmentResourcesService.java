package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.config.BomDepartmentResourcesId;
import vhc.smartw.eam.config.BomResourceEmployeesId;
import vhc.smartw.eam.dto.BomDepartmentResourcesDto;
import vhc.smartw.eam.dto.BomResourceEmployeesDto;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dtoFlat.BomDepartmentResourcesDtoFlat;
import vhc.smartw.eam.dtoFlat.BomResourceEmployeesDtoFlat;
import vhc.smartw.eam.entity.BomDepartmentResources;
import vhc.smartw.eam.entity.BomResourceEmployees;
import vhc.smartw.eam.repository.BomDepartmentResourcesRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class BomDepartmentResourcesService {
    @Autowired
    BomDepartmentResourcesRepository bomDepartmentResourcesRepository;

    @Autowired
    ModelMapper modelMapper;

    //list
    public List<BomDepartmentResources>list(){
        return bomDepartmentResourcesRepository.findAll();
    }
    //add
    public MessageResponse save(BomDepartmentResourcesDtoFlat bomDepartmentResourcesDtoFlat){
        try {
            var bomDepartmentResourcesDto = modelMapper.map(bomDepartmentResourcesDtoFlat, BomDepartmentResourcesDto.class);
            var bomDepartmentResourcesId = BomDepartmentResourcesId.builder()
                    .departmentId(bomDepartmentResourcesDtoFlat.getDepartmentId())
                    .resourceId(bomDepartmentResourcesDtoFlat.getResourceId())
                    .build();

            bomDepartmentResourcesDto.setBomDepartmentResourcesId(bomDepartmentResourcesId);

            var bomDepartmentResources = modelMapper.map(bomDepartmentResourcesDto, BomDepartmentResources.class);

            bomDepartmentResourcesRepository.save(bomDepartmentResources);

            return MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }catch (Exception e){
            log.error("Can't update bomDepartmentResources: {}", e);


            return MessageResponse.builder()
                    .errorMessage("Không thực hiện thành công .")
                    .errorCode("1")
                    .result("")
                    .build();
        }
    }
}
