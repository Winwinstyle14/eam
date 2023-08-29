package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.MbfMtlRequestHeadersEamDto;
import vhc.smartw.eam.dto.MbfMtlRequestLinesEamDto;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.entity.MbfMtlRequestHeadersEam;
import vhc.smartw.eam.service.MbfMtlRequestHeadersEamService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/mbfMtlRequestHeadersEam")
public class MbfMtlRequestHeadersEamController {
    @Autowired
    MbfMtlRequestHeadersEamService mbfMtlRequestHeadersEamService;

    @GetMapping
    public ResponseEntity<List<MbfMtlRequestHeadersEamDto>>list(){
        List<MbfMtlRequestHeadersEamDto>list = mbfMtlRequestHeadersEamService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MbfMtlRequestHeadersEamDto> getById(
            @PathVariable("id") long id
    ){
        final var mbfMtlRequestHeadersEamDtoOptional = mbfMtlRequestHeadersEamService.getById(id);

        if(mbfMtlRequestHeadersEamDtoOptional.isPresent()){
            var headersEamDto = mbfMtlRequestHeadersEamDtoOptional.get();

            return ResponseEntity.ok(headersEamDto);
        }

        return ResponseEntity.noContent().build();
    }

    @PostMapping
    public ResponseEntity<MessageResponse>save(@RequestBody MbfMtlRequestHeadersEamDto mbfMtlRequestHeadersEamDto){
        final var messageResponse = mbfMtlRequestHeadersEamService.save(mbfMtlRequestHeadersEamDto);

        return ResponseEntity.ok(messageResponse);
    }

}
