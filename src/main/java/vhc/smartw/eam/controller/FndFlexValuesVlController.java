package vhc.smartw.eam.controller;

import vhc.smartw.eam.dto.FndFlexValueSetsDto;
import vhc.smartw.eam.dto.FndFlexValuesVlDto;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dto.ResponseObject;
import vhc.smartw.eam.dtoFlat.FndFlexValuesVlDtoFlat;
import vhc.smartw.eam.entity.FndFlexValuesVl;
import vhc.smartw.eam.service.FndFlexValuesVlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/fndFlexValuesVl")
public class FndFlexValuesVlController {
    @Autowired
    FndFlexValuesVlService fndFlexValuesVlService;

    @GetMapping
    public ResponseEntity<List<FndFlexValuesVl>>list(){
        List<FndFlexValuesVl>list = fndFlexValuesVlService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //getById
    @GetMapping("/{flexValueId}")
    public ResponseEntity<FndFlexValuesVl>getById(@PathVariable Long flexValueId){
        FndFlexValuesVl fndFlexValuesVl = fndFlexValuesVlService.getById(flexValueId).get();
        return new ResponseEntity<>(fndFlexValuesVl,HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody FndFlexValuesVlDtoFlat fndFlexValuesVlDtoFlat){
        var fndFlexValuesVlDtoOptional = fndFlexValuesVlService.save(fndFlexValuesVlDtoFlat);
        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();
        if(fndFlexValuesVlDtoOptional.isPresent()){
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }
    //update
    @PutMapping
    public ResponseEntity<FndFlexValuesVl>update(@RequestBody FndFlexValuesVl fndFlexValuesVl){
        FndFlexValuesVl newFndFlexValuesVl = fndFlexValuesVlService.updateFndFlexValuesVl(fndFlexValuesVl);
        return new ResponseEntity<>(newFndFlexValuesVl,HttpStatus.OK);
    }
    //delete
    @DeleteMapping("/{flexValueId}")
    public ResponseEntity<ResponseObject>delete(@PathVariable Long flexValueId){
        Boolean test = fndFlexValuesVlService.delete(flexValueId);
        ResponseObject responseObject = new ResponseObject(test,null);
        return new ResponseEntity<>(responseObject,HttpStatus.OK);
    }
}
