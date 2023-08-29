package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dtoFlat.BomResourcesDtoFlat;
import vhc.smartw.eam.entity.BomResources;
import vhc.smartw.eam.service.BomResourcesService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bomResources")
public class BomResourcesController {
    @Autowired
    BomResourcesService bomResourcesService;

    //list
    @GetMapping
    public ResponseEntity<List<BomResources>>list(){
        List<BomResources>list = bomResourcesService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody BomResourcesDtoFlat bomResourcesDtoFlat){
        var bomResourcesDtoOptional = bomResourcesService.save(bomResourcesDtoFlat);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if(bomResourcesDtoOptional.isPresent()){
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }
}
