package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dtoFlat.BomResourcesDtoFlat;
import vhc.smartw.eam.dtoFlat.BomStandardOperationsDtoFlat;
import vhc.smartw.eam.entity.BomStandardOperations;
import vhc.smartw.eam.service.BomStandardOperationsService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bomStandardOperations")
public class BomStandardOperationsController {
    @Autowired
    BomStandardOperationsService bomStandardOperationsService;

    //list
    @GetMapping
    public ResponseEntity<List<BomStandardOperations>>list(){
        List<BomStandardOperations>list = bomStandardOperationsService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody BomStandardOperationsDtoFlat bomStandardOperationsDtoFlat){
        var bomStandardOperationsDtoOptional = bomStandardOperationsService.save(bomStandardOperationsDtoFlat);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if(bomStandardOperationsDtoOptional.isPresent()){
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }
}
