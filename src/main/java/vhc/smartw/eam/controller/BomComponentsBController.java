package vhc.smartw.eam.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dtoFlat.BomComponentsBDtoFlat;
import vhc.smartw.eam.entity.BomComponentsB;
import vhc.smartw.eam.service.BomComponentsBService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/bomComponentsB")
public class BomComponentsBController{
    @Autowired
    BomComponentsBService bomComponentsBService;

    //list
    @GetMapping
    public ResponseEntity<List<BomComponentsB>>list(){
        List<BomComponentsB>list = bomComponentsBService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse> add(@RequestBody @Valid BomComponentsBDtoFlat bomComponentsBDtoFlat){
        var messageResponse = bomComponentsBService.save(bomComponentsBDtoFlat);

        return ResponseEntity.ok(messageResponse);
    }
    //validation
    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public MessageResponse handleValidationExceptions(MethodArgumentNotValidException exception) {
        var notification = new ArrayList<String>();
        exception.getBindingResult().getAllErrors().forEach((noti) -> {
            String errorMessage = noti.getDefaultMessage();
            notification.add(errorMessage);
        });
        return MessageResponse.builder()
                .errorCode("1")
                .errorMessage("Dữ liệu không xác thực .")
                .result(notification)
                .build();
    }


}
