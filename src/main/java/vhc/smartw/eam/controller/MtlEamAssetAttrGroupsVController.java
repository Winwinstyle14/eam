package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dtoFlat.MtlEamAssetActivitiesDtoFlat;
import vhc.smartw.eam.dtoFlat.MtlEamAssetAttrGroupsVDtoFlat;
import vhc.smartw.eam.entity.MtlEamAssetAttrGroupsV;
import vhc.smartw.eam.service.MtlEamAssetAttrGroupsVService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/mtlEamAssetAttrGroupsV")
public class MtlEamAssetAttrGroupsVController {
    @Autowired
    MtlEamAssetAttrGroupsVService mtlEamAssetAttrGroupsVService;

    //list
    @GetMapping
    public ResponseEntity<List<MtlEamAssetAttrGroupsV>>list(){
        List<MtlEamAssetAttrGroupsV>list = mtlEamAssetAttrGroupsVService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody MtlEamAssetAttrGroupsVDtoFlat mtlEamAssetAttrGroupsVDtoFlat){
        var mtlEamAssetAttrGroupsVDtoOptional = mtlEamAssetAttrGroupsVService.save(mtlEamAssetAttrGroupsVDtoFlat);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if(mtlEamAssetAttrGroupsVDtoOptional.isPresent()){
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }
}
