package vhc.smartw.eam.controller;

import vhc.smartw.eam.dto.FaAdditionsBDto;
import vhc.smartw.eam.dto.FndFlexValueSetsDto;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dto.ResponseObject;
import vhc.smartw.eam.entity.FndFlexValueSets;
import vhc.smartw.eam.service.FndFlexValueSetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/value_sets")
public class FndFlexValueSetsController {
    @Autowired
    FndFlexValueSetsService fndFlexValueSetsService;
    //list danh sach
    @GetMapping
    public ResponseEntity<List<FndFlexValueSets>>list(){
        List<FndFlexValueSets>list = fndFlexValueSetsService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //getById
    @GetMapping("/{flexValueSetId}")
    public ResponseEntity<FndFlexValueSets>getById(@PathVariable Long flexValueSetId){
        FndFlexValueSets flexValueSets = fndFlexValueSetsService.getById(flexValueSetId).get();
        return new ResponseEntity<>(flexValueSets,HttpStatus.OK);
    }
    //them
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody FndFlexValueSetsDto fndFlexValueSetsDto){
        var fndFlexValueSetsDtoOptional = fndFlexValueSetsService.save(fndFlexValueSetsDto);
        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();
        if(fndFlexValueSetsDtoOptional.isPresent()){
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }
    //sua
    @PutMapping
    public ResponseEntity<FndFlexValueSets>update(@RequestBody FndFlexValueSets fndFlexValueSets){
        FndFlexValueSets newFndFlexValueSets  = fndFlexValueSetsService.updateFndFlexValueSets(fndFlexValueSets);
        return new ResponseEntity<>(newFndFlexValueSets,HttpStatus.OK);
    }
    //xoa
    @DeleteMapping("/{flexValueSetId}")
    public ResponseEntity<ResponseObject>delete(@PathVariable Long flexValueSetId){
        Boolean test = fndFlexValueSetsService.delete(flexValueSetId);
        ResponseObject responseObject = new ResponseObject(test,null);
        return new ResponseEntity<>(responseObject,HttpStatus.OK);
    }

}
