package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dto.PerAllPeopleFDto;
import vhc.smartw.eam.dto.PerCompetencesDto;
import vhc.smartw.eam.entity.PerAllPeopleF;
import vhc.smartw.eam.service.PerAllPeopleFService;

import java.util.List;

@RestController
@RequestMapping("api/v1/perAllPeopleF")
public class PerAllPeopleFController {
    @Autowired
    PerAllPeopleFService perAllPeopleFService;

    //list
    @GetMapping
    public ResponseEntity<List<PerAllPeopleF>>list(){
        List<PerAllPeopleF>list = perAllPeopleFService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody PerAllPeopleFDto perAllPeopleFDto) {
        var perAllPeopleFOptional = perAllPeopleFService.save(perAllPeopleFDto);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if (perAllPeopleFOptional.isPresent()) {
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }
}
