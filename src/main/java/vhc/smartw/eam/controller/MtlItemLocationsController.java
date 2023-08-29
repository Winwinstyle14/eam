package vhc.smartw.eam.controller;

import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dto.MtlItemCategoriesDto;
import vhc.smartw.eam.dto.MtlItemLocationsDto;
import vhc.smartw.eam.dto.ResponseObject;
import vhc.smartw.eam.dtoFlat.MtlItemLocationsDtoFlat;
import vhc.smartw.eam.entity.MtlItemLocations;
import vhc.smartw.eam.service.MtlItemLocationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/mtlItemLocations")
public class MtlItemLocationsController {
    @Autowired
    MtlItemLocationsService mtlItemLocationsService;

    //list
    @GetMapping
    public ResponseEntity<List<MtlItemLocations>>list(){
        List<MtlItemLocations>list = mtlItemLocationsService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody MtlItemLocationsDtoFlat mtlItemLocationsDtoFlat){
        var mtlItemLocationsDtoOptional = mtlItemLocationsService.save(mtlItemLocationsDtoFlat);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if(mtlItemLocationsDtoOptional.isPresent()){
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }

}
