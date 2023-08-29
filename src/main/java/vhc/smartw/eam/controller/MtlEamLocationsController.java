package vhc.smartw.eam.controller;

import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dto.MtlEamLocationsDto;
import vhc.smartw.eam.entity.MtlEamLocations;
import vhc.smartw.eam.service.MtlEamLocationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/mtlEamLocations")
public class MtlEamLocationsController {
    @Autowired
    MtlEamLocationsService mtlEamLocationsService;
    //list
    @GetMapping
    public ResponseEntity<List<MtlEamLocations>> list(){
        List<MtlEamLocations>list = mtlEamLocationsService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody MtlEamLocationsDto mtlEamLocationsDto){
        var mtlItemLocationsDtoOptional = mtlEamLocationsService.save(mtlEamLocationsDto);

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
