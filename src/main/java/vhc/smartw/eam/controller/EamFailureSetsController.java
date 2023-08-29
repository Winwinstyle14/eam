package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.EamFailureSetsDto;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dto.MtlCategoriesDto;
import vhc.smartw.eam.entity.EamFailureSets;
import vhc.smartw.eam.service.EamFailureSetsService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/eamFailureSets")
public class EamFailureSetsController {
    @Autowired
    EamFailureSetsService eamFailureSetsService;

    //list
    @GetMapping
    public ResponseEntity<List<EamFailureSets>>list(){
        List<EamFailureSets>list = eamFailureSetsService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody EamFailureSetsDto eamFailureSetsDto){
        var eamFailureSetsDtoOptional = eamFailureSetsService.save(eamFailureSetsDto);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if(eamFailureSetsDtoOptional.isPresent()){
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }

}
