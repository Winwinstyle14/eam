package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dtoFlat.FndDescrFlexColUsageVlDtoFlat;
import vhc.smartw.eam.dtoFlat.FndDescrFlexContextsVlDtoFlat;
import vhc.smartw.eam.entity.FndDescrFlexColUsageVl;
import vhc.smartw.eam.service.FndDescrFlexColUsageVlService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/fndDescrFlexColUsageVl")
public class FndDescrFlexColUsageVlController {
    @Autowired
    FndDescrFlexColUsageVlService fndDescrFlexColUsageVlService;

    //list
    @GetMapping
    public ResponseEntity<List<FndDescrFlexColUsageVl>>list(){
        List<FndDescrFlexColUsageVl>list = fndDescrFlexColUsageVlService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody FndDescrFlexColUsageVlDtoFlat fndDescrFlexColUsageVlDtoFlat){
        var fndDescrFlexColUsageVlDtoOptional = fndDescrFlexColUsageVlService.save(fndDescrFlexColUsageVlDtoFlat);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if(fndDescrFlexColUsageVlDtoOptional.isPresent()){
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }
}
