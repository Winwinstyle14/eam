package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dto.MfgLookupsDto;
import vhc.smartw.eam.entity.MfgLookups;
import vhc.smartw.eam.service.MfgLookupsService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/mfgLookups")
public class MfgLookupsController {
    @Autowired
    MfgLookupsService mfgLookupsService;

    //list
    @GetMapping
    public ResponseEntity<List<MfgLookups>>list(){
        List<MfgLookups>list = mfgLookupsService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody MfgLookupsDto mfgLookupsDto){
        var mfgLookupsDtoOptional = mfgLookupsService.save(mfgLookupsDto);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if(mfgLookupsDtoOptional.isPresent()){
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }
}
