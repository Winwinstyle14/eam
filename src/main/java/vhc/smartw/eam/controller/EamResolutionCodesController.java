package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.EamCauseCodesDto;
import vhc.smartw.eam.dto.EamResolutionCodesDto;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.entity.EamResolutionCodes;
import vhc.smartw.eam.service.EamResolutionCodesService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/eamResolutionCodes")
public class EamResolutionCodesController {
    @Autowired
    EamResolutionCodesService eamResolutionCodesService;

    //list
    @GetMapping
    public ResponseEntity<List<EamResolutionCodes>>list(){
        List<EamResolutionCodes>list = eamResolutionCodesService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody EamResolutionCodesDto eamResolutionCodesDto){
        var eamResolutionCodesDtoOptional = eamResolutionCodesService.save(eamResolutionCodesDto);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if(eamResolutionCodesDtoOptional.isPresent()){
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }
}
