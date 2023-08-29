package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dtoFlat.BomResourceEmployeesDtoFlat;
import vhc.smartw.eam.dtoFlat.BomResourcesDtoFlat;
import vhc.smartw.eam.entity.BomResourceEmployees;
import vhc.smartw.eam.service.BomResourceEmployeesService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bomResourceEmployees")
public class BomResourceEmployeesController {
    @Autowired
    BomResourceEmployeesService bomResourceEmployeesService;

    //list
    @GetMapping
    public ResponseEntity<List<BomResourceEmployees>>list(){
        List<BomResourceEmployees>list = bomResourceEmployeesService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody BomResourceEmployeesDtoFlat bomResourceEmployeesDtoFlat){
        var bomResourceEmployeesDtoOptional = bomResourceEmployeesService.save(bomResourceEmployeesDtoFlat);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if(bomResourceEmployeesDtoOptional.isPresent()){
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }
}
