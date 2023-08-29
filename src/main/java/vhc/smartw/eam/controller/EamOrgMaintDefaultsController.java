package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.EamOrgMaintDefaultsDto;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dtoFlat.EamOrgMaintDefaultsDtoFlat;
import vhc.smartw.eam.entity.EamOrgMaintDefaults;
import vhc.smartw.eam.entity.FaAdditionsB;
import vhc.smartw.eam.service.EamOrgMaintDefaultsService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/eamOrgMaintDefaults")
public class EamOrgMaintDefaultsController {
    @Autowired
    EamOrgMaintDefaultsService eamOrgMaintDefaultsService;

    @GetMapping
    public ResponseEntity<List<EamOrgMaintDefaults>> list(){
        List<EamOrgMaintDefaults>list = eamOrgMaintDefaultsService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody EamOrgMaintDefaultsDtoFlat eamOrgMaintDefaultsDtoFlat){
        var eamOrgMaintDefaultsDtoOptional = eamOrgMaintDefaultsService.save(eamOrgMaintDefaultsDtoFlat);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if(eamOrgMaintDefaultsDtoOptional.isPresent()){
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }
}
