package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.EamResolutionCodesDto;
import vhc.smartw.eam.dto.EamWoStatusesVDto;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.service.EamWoStatusesVService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/eamWoStatusesV")
public class EamWoStatusesVController {
    @Autowired
    EamWoStatusesVService eamWoStatusesVService;

    //list
    @GetMapping
    public ResponseEntity<List<EamWoStatusesVDto>>list(){
        List<EamWoStatusesVDto>list = eamWoStatusesVService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody EamWoStatusesVDto eamWoStatusesVDto){
        var eamWoStatusesVDtoOptional = eamWoStatusesVService.save(eamWoStatusesVDto);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if(eamWoStatusesVDtoOptional.isPresent()){
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }
}
