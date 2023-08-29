package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.config.BomDepartmentClassesId;
import vhc.smartw.eam.config.BomDepartmentResourcesId;
import vhc.smartw.eam.dto.BomDepartmentClassesDto;
import vhc.smartw.eam.dto.BomDepartmentResourcesDto;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dtoFlat.BomDepartmentClassesDtoFlat;
import vhc.smartw.eam.dtoFlat.BomDepartmentResourcesDtoFlat;
import vhc.smartw.eam.entity.BomDepartmentClasses;
import vhc.smartw.eam.entity.BomDepartmentResources;
import vhc.smartw.eam.repository.BomDepartmentClassesRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class BomDepartmentClassesService {
    @Autowired
    BomDepartmentClassesRepository bomDepartmentClassesRepository;
    @Autowired
    ModelMapper modelMapper;

    //list
    public List<BomDepartmentClasses>list(){
        return bomDepartmentClassesRepository.findAll();
    }
    //add
    public MessageResponse save(BomDepartmentClassesDtoFlat bomDepartmentClassesDtoFlat){
        try {
            var bomDepartmentClassesDto = modelMapper.map(bomDepartmentClassesDtoFlat, BomDepartmentClassesDto.class);
            var bomDepartmentClassesId = BomDepartmentClassesId.builder()
                    .departmentClassCode(bomDepartmentClassesDtoFlat.getDepartmentClassCode())
                    .organizationId(bomDepartmentClassesDtoFlat.getOrganizationId())
                    .build();
            bomDepartmentClassesDto.setBomDepartmentClassesId(bomDepartmentClassesId);

            var bomDepartmentClasses = modelMapper.map(bomDepartmentClassesDto, BomDepartmentClasses.class);
           bomDepartmentClassesRepository.save(bomDepartmentClasses);

            return MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }catch (Exception e){
            log.error("Can't update bomDepartmentClasses: {}", e);


            return MessageResponse.builder()
                    .errorMessage("Không thực hiện thành công .")
                    .errorCode("1")
                    .result("")
                    .build();
        }
        }


}
