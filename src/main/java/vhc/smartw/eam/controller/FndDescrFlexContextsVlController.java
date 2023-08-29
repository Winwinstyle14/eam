package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dtoFlat.FndDescrFlexContextsVlDtoFlat;
import vhc.smartw.eam.dtoFlat.MtlEamAssetActivitiesDtoFlat;
import vhc.smartw.eam.entity.FndDescrFlexContextsVl;
import vhc.smartw.eam.service.FndDescrFlexContextsVlService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/fndDescrFlexContextsVl")
public class FndDescrFlexContextsVlController {
    @Autowired
    FndDescrFlexContextsVlService fndDescrFlexContextsVlService;

    //list
    @GetMapping
    public ResponseEntity<List<FndDescrFlexContextsVl>>list(){
        List<FndDescrFlexContextsVl>list = fndDescrFlexContextsVlService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody FndDescrFlexContextsVlDtoFlat fndDescrFlexContextsVlDtoFlat){
        var fndDescrFlexContextsVlDtoOptional = fndDescrFlexContextsVlService.save(fndDescrFlexContextsVlDtoFlat);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if(fndDescrFlexContextsVlDtoOptional.isPresent()){
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }
}
