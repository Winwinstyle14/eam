package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dto.PerQualificationTypesDto;
import vhc.smartw.eam.dto.WipRequirementOperationsDto;
import vhc.smartw.eam.entity.WipRequirementOperations;
import vhc.smartw.eam.service.WipRequirementOperationsService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/wipRequirementOperations")
public class WipRequirementOperationsController {
    @Autowired
    WipRequirementOperationsService wipRequirementOperationsService;

    @GetMapping
    public ResponseEntity<List<WipRequirementOperationsDto>>list(){
        List<WipRequirementOperationsDto>list = wipRequirementOperationsService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //add
    /*@PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody WipRequirementOperationsDto wipRequirementOperationsDto) {
        var wipRequirementOperationsOptional = wipRequirementOperationsService.saveOrUpdate(wipRequirementOperationsDto);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if (wipRequirementOperationsOptional.isPresent()) {
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }*/
}
