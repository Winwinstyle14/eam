package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.BomOperationalRoutingsDto;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dtoFlat.BomOperationSequencesDtoFlat;
import vhc.smartw.eam.entity.BomOperationSequences;
import vhc.smartw.eam.service.BomOperationSequencesService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bomOperationSequences")
public class BomOperationSequencesController {
    @Autowired
    BomOperationSequencesService bomOperationSequencesService;

    //list
    @GetMapping
    public ResponseEntity<List<BomOperationSequences>>list(){
        List<BomOperationSequences>list = bomOperationSequencesService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody BomOperationSequencesDtoFlat bomOperationSequencesDtoFlat){
        var bomOperationSequencesDtoOptional = bomOperationSequencesService.save(bomOperationSequencesDtoFlat);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if(bomOperationSequencesDtoOptional.isPresent()){
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }
}
