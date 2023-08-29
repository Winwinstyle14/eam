package vhc.smartw.eam.controller;

import vhc.smartw.eam.dto.HrAllOrganizationUnitsDto;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dto.ResponseObject;
import vhc.smartw.eam.entity.HrAllOrganizationUnits;
import vhc.smartw.eam.service.HrAllOrganizationUnitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/hrAllOrganizationUnits")
public class HrAllOrganizationUnitsController {
    @Autowired
    private HrAllOrganizationUnitsService hrAllOrganizationUnitsService;

    /**
     * Thêm mới trung tâm
     * @param hrAllOrganizationUnitsDto
     * @return
     */
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody HrAllOrganizationUnitsDto hrAllOrganizationUnitsDto){
        var hrAllOrganizationUnitsDtoOptional = hrAllOrganizationUnitsService.save(hrAllOrganizationUnitsDto);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if(hrAllOrganizationUnitsDtoOptional.isPresent()){
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }
}
