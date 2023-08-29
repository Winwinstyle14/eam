package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.HzLocationsDto;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dto.ResponseObject;
import vhc.smartw.eam.entity.HrAllOrganizationUnits;
import vhc.smartw.eam.entity.HzLocations;
import vhc.smartw.eam.service.HzLocationsService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/hzLocations")
public class HzLocationsController {
    @Autowired
    HzLocationsService hzLocationsService;

    //list
    @GetMapping
    public ResponseEntity<List<HzLocations>>list(){
        List<HzLocations>list = hzLocationsService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody HzLocationsDto hzLocationsDto){
        var hzLocationsDtoOptional = hzLocationsService.save(hzLocationsDto);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if(hzLocationsDtoOptional.isPresent()){
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }
}
