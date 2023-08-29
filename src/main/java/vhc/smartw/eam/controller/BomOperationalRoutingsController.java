package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.BomOperationalRoutingsDto;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dtoFlat.BomDepartmentClassesDtoFlat;
import vhc.smartw.eam.entity.BomOperationalRoutings;
import vhc.smartw.eam.service.BomOperationalRoutingsService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bomOperationalRoutings")
public class BomOperationalRoutingsController {
    @Autowired
    BomOperationalRoutingsService bomOperationalRoutingsService;

    //list
    @GetMapping
    public ResponseEntity<List<BomOperationalRoutings>>list(){
        List<BomOperationalRoutings>list = bomOperationalRoutingsService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody BomOperationalRoutingsDto bomOperationalRoutingsDto){
        var bomOperationalRoutingsDtoOptional = bomOperationalRoutingsService.save(bomOperationalRoutingsDto);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if(bomOperationalRoutingsDtoOptional.isPresent()){
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }

}
