package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.EamFailureCodesDto;
import vhc.smartw.eam.dto.EamFailureCombinationsDto;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.entity.EamFailureCodes;
import vhc.smartw.eam.service.EamFailureCodesService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/eamFailureCodes")
public class EamFailureCodesController {
    @Autowired
    EamFailureCodesService eamFailureCodesService;

    //list
    @GetMapping
    public ResponseEntity<List<EamFailureCodes>>list(){
        List<EamFailureCodes>list = eamFailureCodesService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody EamFailureCodesDto eamFailureCodesDto){
        var eamFailureCodesDtoOptional = eamFailureCodesService.save(eamFailureCodesDto);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if(eamFailureCodesDtoOptional.isPresent()){
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }
}
