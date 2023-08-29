package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dto.MtlUnitOfMeasureTlDto;
import vhc.smartw.eam.dto.PnLocationsAllDto;
import vhc.smartw.eam.entity.HzLocations;
import vhc.smartw.eam.entity.PnLocationsAll;
import vhc.smartw.eam.service.PnLocationsAllService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pnLocationsAll")
public class PnLocationsAllController {
    @Autowired
    PnLocationsAllService pnLocationsAllService;

    //list
    @GetMapping
    public ResponseEntity<List<PnLocationsAll>>list(){
        List<PnLocationsAll>list = pnLocationsAllService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody PnLocationsAllDto pnLocationsAllDto) {
        var pnLocationsAllDtoOptional = pnLocationsAllService.save(pnLocationsAllDto);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if (pnLocationsAllDtoOptional.isPresent()) {
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }
}
