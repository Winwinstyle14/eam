package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dto.MtlEamAssetAttrValuesDto;
import vhc.smartw.eam.dtoFlat.MtlEamAssetAttrValuesDtoFlat;
import vhc.smartw.eam.entity.MtlEamAssetAttrValues;
import vhc.smartw.eam.service.MtlEamAssetAttrValuesService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/mtlEamAssetAttrValues")
public class MtlEamAssetAttrValuesController {
    @Autowired
    MtlEamAssetAttrValuesService mtlEamAssetAttrValuesService;
    //list
    @GetMapping
    public ResponseEntity<List<MtlEamAssetAttrValues>>list(){
        List<MtlEamAssetAttrValues>list = mtlEamAssetAttrValuesService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody MtlEamAssetAttrValuesDtoFlat mtlEamAssetAttrValuesDtoFlat){
        var mtlAssetAttrValuesDtoOptional = mtlEamAssetAttrValuesService.save(mtlEamAssetAttrValuesDtoFlat);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if(mtlAssetAttrValuesDtoOptional.isPresent()){
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }

}
