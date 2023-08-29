package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.FaAdditionsBDto;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.entity.FaAdditionsB;
import vhc.smartw.eam.service.FaAdditionsBService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/faAdditionsB")
public class FaAdditionsBController {
    @Autowired
    FaAdditionsBService faAdditionsBService;

    //list
//    @GetMapping
//    public ResponseEntity<List<FaAdditionsB>>list(){
//        List<FaAdditionsB>list = faAdditionsBService.list();
//        return new ResponseEntity<>(list, HttpStatus.OK);
//    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody FaAdditionsBDto faAdditionsBDto){
        var faAdditionsBDtoOptional = faAdditionsBService.save(faAdditionsBDto);
        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();
        if(faAdditionsBDtoOptional.isPresent()){
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }
}
