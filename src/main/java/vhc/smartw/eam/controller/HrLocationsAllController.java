package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.HrLocationsAllDto;
import vhc.smartw.eam.dto.HzLocationsDto;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.entity.HrLocationsAll;
import vhc.smartw.eam.service.HrLocationsAllService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/hrLocationsAll")
public class HrLocationsAllController {
    @Autowired
    HrLocationsAllService hrLocationsAllService;

    //list
    @GetMapping
    public ResponseEntity<List<HrLocationsAll>>list(){
        List<HrLocationsAll>list = hrLocationsAllService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody HrLocationsAllDto hrLocationsAllDto){
        var hrLocationsAllDtoOptional = hrLocationsAllService.save(hrLocationsAllDto);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if(hrLocationsAllDtoOptional.isPresent()){
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }
}
