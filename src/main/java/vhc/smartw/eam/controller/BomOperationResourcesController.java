package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dtoFlat.BomOperationResourcesDtoFlat;
import vhc.smartw.eam.dtoFlat.BomOperationSequencesDtoFlat;
import vhc.smartw.eam.entity.BomOperationResources;
import vhc.smartw.eam.service.BomOperationResourcesService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bomOperationResources")
public class BomOperationResourcesController {
    @Autowired
    BomOperationResourcesService  bomOperationResourcesService;

    //list
    @GetMapping
    public ResponseEntity<List<BomOperationResources>>list(){
        List<BomOperationResources>list = bomOperationResourcesService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody BomOperationResourcesDtoFlat bomOperationResourcesDtoFlat){
        var bomOperationResourcesDtoOptional = bomOperationResourcesService.save(bomOperationResourcesDtoFlat);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if(bomOperationResourcesDtoOptional.isPresent()){
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }
}
