package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.EamFailureCombinationsDto;
import vhc.smartw.eam.dto.EamFailureSetsDto;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.entity.EamFailureCombinations;
import vhc.smartw.eam.service.EamFailureCombinationsService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/eamFailureCombinations")
public class EamFailureCombinationsController {
    @Autowired
    EamFailureCombinationsService eamFailureCombinationsService;

    //list
    @GetMapping
    public ResponseEntity<List<EamFailureCombinationsDto>>list(){
        List<EamFailureCombinationsDto>list = eamFailureCombinationsService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody EamFailureCombinationsDto eamFailureCombinationsDto){
        var eamFailureCombinationsDtoOptional = eamFailureCombinationsService.save(eamFailureCombinationsDto);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if(eamFailureCombinationsDtoOptional.isPresent()){
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }
}
