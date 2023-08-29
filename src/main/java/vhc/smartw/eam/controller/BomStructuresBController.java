package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dtoFlat.BomResourcesDtoFlat;
import vhc.smartw.eam.dtoFlat.BomStructuresBDtoFlat;
import vhc.smartw.eam.entity.BomStructuresB;
import vhc.smartw.eam.service.BomStructuresBService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bomStructuresB")
public class BomStructuresBController {
    @Autowired
    BomStructuresBService bomStructuresBService;

    //list
    @GetMapping
    public ResponseEntity<List<BomStructuresB>>list(){
        List<BomStructuresB>list = bomStructuresBService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody BomStructuresBDtoFlat bomStructuresBDtoFlat){
        var bomStructuresBDtoOptional = bomStructuresBService.save(bomStructuresBDtoFlat);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if(bomStructuresBDtoOptional.isPresent()){
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }
}
