package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.FndDescriptiveFlexsDto;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dto.MtlParametersDto;
import vhc.smartw.eam.entity.FndDescriptiveFlexs;
import vhc.smartw.eam.service.FndDescriptiveFlexsService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/fndDescriptiveFlexs")
public class FndDescriptiveFlexsController {
    @Autowired
    FndDescriptiveFlexsService fndDescriptiveFlexsService;

    //list
    @GetMapping
    public ResponseEntity<List<FndDescriptiveFlexs>>list(){
        List<FndDescriptiveFlexs>list = fndDescriptiveFlexsService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody FndDescriptiveFlexsDto fndDescriptiveFlexsDto){
        var fndDescriptiveFlexsDtoOptional = fndDescriptiveFlexsService.save(fndDescriptiveFlexsDto);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if(fndDescriptiveFlexsDtoOptional.isPresent()){
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }
}
