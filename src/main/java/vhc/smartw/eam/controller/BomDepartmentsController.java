package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.BomDepartmentsDto;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dto.PerAllPeopleFDto;
import vhc.smartw.eam.entity.BomDepartments;
import vhc.smartw.eam.service.BomDepartmentsService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bomDepartments")
public class BomDepartmentsController {
    @Autowired
    BomDepartmentsService bomDepartmentsService;

    //list
    @GetMapping
    public ResponseEntity<List<BomDepartments>>list(){
        List<BomDepartments>list = bomDepartmentsService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody BomDepartmentsDto bomDepartmentsDto) {
        var bomDepartmentsOptional = bomDepartmentsService.save(bomDepartmentsDto);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if (bomDepartmentsOptional.isPresent()) {
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }
}
