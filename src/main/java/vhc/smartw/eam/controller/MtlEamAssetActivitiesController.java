package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dtoFlat.MtlEamAssetActivitiesDtoFlat;
import vhc.smartw.eam.dtoFlat.MtlEamAssetAttrValuesDtoFlat;
import vhc.smartw.eam.entity.MtlEamAssetActivities;
import vhc.smartw.eam.service.MtlEamAssetActivitiesService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/mtlEamAssetActivities")
public class MtlEamAssetActivitiesController {
    @Autowired
    MtlEamAssetActivitiesService mtlEamAssetActivitiesService;

    //list
    @GetMapping
    public ResponseEntity<List<MtlEamAssetActivities>>list(){
        List<MtlEamAssetActivities>list = mtlEamAssetActivitiesService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody MtlEamAssetActivitiesDtoFlat mtlEamAssetActivitiesDtoFlat){
        var mtlEamAssetActivitiesDtoOptional = mtlEamAssetActivitiesService.save(mtlEamAssetActivitiesDtoFlat);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if(mtlEamAssetActivitiesDtoOptional.isPresent()){
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }

}
