package vhc.smartw.eam.controller;

import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dto.MtlObjectGenealogyDto;
import vhc.smartw.eam.dto.MtlParametersDto;
import vhc.smartw.eam.dto.ResponseObject;
import vhc.smartw.eam.entity.MtlParameters;
import vhc.smartw.eam.service.MtlParametersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/mtlParameters")
public class MtlParametersController {
    @Autowired
    MtlParametersService mtlParametersService;

    //list
    @GetMapping
    public ResponseEntity<List<MtlParameters>>list(){
        List<MtlParameters>list = mtlParametersService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody MtlParametersDto mtlParametersDto){
        var mtlParametersDtoOptional = mtlParametersService.save(mtlParametersDto);

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
