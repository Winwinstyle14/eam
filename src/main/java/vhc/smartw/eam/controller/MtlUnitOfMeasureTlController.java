package vhc.smartw.eam.controller;

import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dto.MtlSystemItemBDto;
import vhc.smartw.eam.dto.MtlUnitOfMeasureTlDto;
import vhc.smartw.eam.dto.ResponseObject;
import vhc.smartw.eam.entity.MtlUnitOfMeasureTl;
import vhc.smartw.eam.service.MtlUnitOfMeasureTlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/mtlUnitOfMeasureTl")
public class MtlUnitOfMeasureTlController {
    @Autowired
    MtlUnitOfMeasureTlService mtlUnitOfMeasureTlService;

    //list
    @GetMapping
    public ResponseEntity<List<MtlUnitOfMeasureTl>>list(){
        List<MtlUnitOfMeasureTl>list = mtlUnitOfMeasureTlService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody MtlUnitOfMeasureTlDto mtlUnitOfMeasureTlDto) {
        var mtlUnitOfMeasureTlDtoOptional = mtlUnitOfMeasureTlService.save(mtlUnitOfMeasureTlDto);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if (mtlUnitOfMeasureTlDtoOptional.isPresent()) {
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }

}
