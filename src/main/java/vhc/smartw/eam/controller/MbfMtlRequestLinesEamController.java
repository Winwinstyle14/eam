package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.EamWoStatusesVDto;
import vhc.smartw.eam.dto.MbfMtlRequestLinesEamDto;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.service.MbfMtlRequestLinesEamService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/mbfMtlRequestLinesEam")
public class MbfMtlRequestLinesEamController {
    @Autowired
    MbfMtlRequestLinesEamService mbfMtlRequestLinesEamService;

    //list
    @GetMapping
    public ResponseEntity<List<MbfMtlRequestLinesEamDto>>list(){
        List<MbfMtlRequestLinesEamDto>list = mbfMtlRequestLinesEamService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //ADD
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody MbfMtlRequestLinesEamDto mbfMtlRequestLinesEamDto){
        var mbfMtlRequestLinesEamDtoOptional = mbfMtlRequestLinesEamService.saveOrUpdate(mbfMtlRequestLinesEamDto);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if(mbfMtlRequestLinesEamDtoOptional.isPresent()){
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }
}
