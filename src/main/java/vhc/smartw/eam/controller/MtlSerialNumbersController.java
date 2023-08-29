package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dto.MtlSecondaryInventoriesDto;
import vhc.smartw.eam.dto.MtlSerialNumbersDto;
import vhc.smartw.eam.dtoFlat.MtlSerialNumbersDtoFlat;
import vhc.smartw.eam.entity.MtlSerialNumbers;
import vhc.smartw.eam.service.MtlSerialNumbersService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/mtlSerialNumbers")
public class MtlSerialNumbersController {
    @Autowired
    MtlSerialNumbersService mtlSerialNumbersService;

    //lits
    @GetMapping
    public ResponseEntity<List<MtlSerialNumbers>>list(){
        List<MtlSerialNumbers>list = mtlSerialNumbersService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody MtlSerialNumbersDtoFlat mtlSerialNumbersDtoFlat){
        var mtlSerialNumbersDtoOptional = mtlSerialNumbersService.save(mtlSerialNumbersDtoFlat);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if(mtlSerialNumbersDtoOptional.isPresent()){
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }
}
