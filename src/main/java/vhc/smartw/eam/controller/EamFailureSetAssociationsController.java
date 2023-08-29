package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dtoFlat.EamFailureSetAssociationsDtoFlat;
import vhc.smartw.eam.dtoFlat.FndDescrFlexColUsageVlDtoFlat;
import vhc.smartw.eam.entity.EamFailureSetAssociations;
import vhc.smartw.eam.service.EamFailureSetAssociationsService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/eamFailureSetAssociations")
public class EamFailureSetAssociationsController {
    @Autowired
    EamFailureSetAssociationsService eamFailureSetAssociationsService;
    //list
    @GetMapping
    public ResponseEntity<List<EamFailureSetAssociations>>list(){
        List<EamFailureSetAssociations>list = eamFailureSetAssociationsService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody EamFailureSetAssociationsDtoFlat eamFailureSetAssociationsDtoFlat){
        var eamFailureSetAssociationsDtoOptional = eamFailureSetAssociationsService.save(eamFailureSetAssociationsDtoFlat);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if(eamFailureSetAssociationsDtoOptional.isPresent()){
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }
}
