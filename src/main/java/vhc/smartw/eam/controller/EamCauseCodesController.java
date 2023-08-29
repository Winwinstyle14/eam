package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.EamCauseCodesDto;
import vhc.smartw.eam.dto.EamFailureCodesDto;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.entity.EamCauseCodes;
import vhc.smartw.eam.service.EamCauseCodesService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/eamCauseCodes")
public class EamCauseCodesController {
    @Autowired
    EamCauseCodesService eamCauseCodesService;

    //list
    @GetMapping
    public ResponseEntity<List<EamCauseCodes>>list(){
        List<EamCauseCodes>list = eamCauseCodesService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody EamCauseCodesDto eamCauseCodesDto){
        var eamCauseCodesDtoOptional = eamCauseCodesService.save(eamCauseCodesDto);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if(eamCauseCodesDtoOptional.isPresent()){
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }
}
