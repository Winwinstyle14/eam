package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dto.MtlObjectGenealogyDto;
import vhc.smartw.eam.entity.MtlObjectGenealogy;
import vhc.smartw.eam.service.MtlObjectGenealogyService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/mtlObjectGenealogy")
//http://localhost:9088/
public class MtlObjectGenealogyController {

    @Autowired
    MtlObjectGenealogyService mtlObjectGenealogyService;

    //list
    @GetMapping
    public ResponseEntity<List<MtlObjectGenealogy>>list(){
        List<MtlObjectGenealogy>list = mtlObjectGenealogyService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody MtlObjectGenealogyDto mtlObjectGenealogyDto){
        var mtlItemLocationsDtoOptional = mtlObjectGenealogyService.save(mtlObjectGenealogyDto);

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
