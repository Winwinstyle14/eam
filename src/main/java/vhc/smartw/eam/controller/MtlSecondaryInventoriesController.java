package vhc.smartw.eam.controller;

import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dto.MtlParametersDto;
import vhc.smartw.eam.dto.MtlSecondaryInventoriesDto;
import vhc.smartw.eam.dto.ResponseObject;
import vhc.smartw.eam.dtoFlat.MtlSecondaryInventoriesDtoFlat;
import vhc.smartw.eam.entity.MtlSecondaryInventories;
import vhc.smartw.eam.service.MtlSecondaryInventoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/mtlSecondaryInventories")
public class MtlSecondaryInventoriesController {
    @Autowired
    MtlSecondaryInventoriesService mtlSecondaryInventoriesService;

    //list
    @GetMapping
    public ResponseEntity<List<MtlSecondaryInventories>>list(){
        List<MtlSecondaryInventories>list = mtlSecondaryInventoriesService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody MtlSecondaryInventoriesDtoFlat mtlSecondaryInventoriesDtoFlat){
        var mtlParametersDtoOptional = mtlSecondaryInventoriesService.save(mtlSecondaryInventoriesDtoFlat);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if(mtlParametersDtoOptional.isPresent()){
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }
}
