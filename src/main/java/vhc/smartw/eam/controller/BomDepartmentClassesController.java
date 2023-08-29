package vhc.smartw.eam.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dtoFlat.BomDepartmentClassesDtoFlat;
import vhc.smartw.eam.entity.BomDepartmentClasses;
import vhc.smartw.eam.service.BomDepartmentClassesService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/bomDepartmentClasses")
public class BomDepartmentClassesController{
    @Autowired
    BomDepartmentClassesService bomDepartmentClassesService;

    //list
    @GetMapping
    public ResponseEntity<List<BomDepartmentClasses>>list(){
        List<BomDepartmentClasses>list = bomDepartmentClassesService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody @Valid BomDepartmentClassesDtoFlat bomDepartmentClassesDtoFlat){
        var messageResponse = bomDepartmentClassesService.save(bomDepartmentClassesDtoFlat);


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
