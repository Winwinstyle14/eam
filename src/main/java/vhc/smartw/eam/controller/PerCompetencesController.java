package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dto.MtlUnitOfMeasureTlDto;
import vhc.smartw.eam.dto.PerCompetencesDto;
import vhc.smartw.eam.entity.PerCompetences;
import vhc.smartw.eam.service.PerCompetencesService;

import java.util.List;

@RestController
@RequestMapping("api/v1/perCompetences")
public class PerCompetencesController {
    @Autowired
    PerCompetencesService perCompetencesService;

    //list
    @GetMapping
    public ResponseEntity<List<PerCompetences>>list(){
        List<PerCompetences>list = perCompetencesService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody PerCompetencesDto perCompetencesDto) {
        var perCompetencesOptional = perCompetencesService.save(perCompetencesDto);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if (perCompetencesOptional.isPresent()) {
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }
}
