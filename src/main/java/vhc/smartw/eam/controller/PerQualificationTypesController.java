package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dto.PerCompetencesDto;
import vhc.smartw.eam.dto.PerQualificationTypesDto;
import vhc.smartw.eam.entity.PerQualificationTypes;
import vhc.smartw.eam.service.PerQualificationTypesService;

import java.util.List;

@RestController
@RequestMapping("api/v1/perQualificationTypes")
public class PerQualificationTypesController {
    @Autowired
    PerQualificationTypesService perQualificationTypesService;

    //list
    @GetMapping
    public ResponseEntity<List<PerQualificationTypes>>list(){
        List<PerQualificationTypes>list = perQualificationTypesService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody PerQualificationTypesDto perQualificationTypesDto) {
        var perQualificationTypesOptional = perQualificationTypesService.save(perQualificationTypesDto);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if (perQualificationTypesOptional.isPresent()) {
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }
}
