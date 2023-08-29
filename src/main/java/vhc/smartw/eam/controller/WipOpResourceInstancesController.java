package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dto.WipOpResourceInstancesDto;
import vhc.smartw.eam.dto.WipRequirementOperationsDto;
import vhc.smartw.eam.service.WipOpResourceInstancesService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/wipOpResourceInstances")
public class WipOpResourceInstancesController {
    @Autowired
    WipOpResourceInstancesService wipOpResourceInstancesService;

    @GetMapping
    public ResponseEntity<List<WipOpResourceInstancesDto>> list(){
        List<WipOpResourceInstancesDto>list = wipOpResourceInstancesService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    /*@PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody WipOpResourceInstancesDto wipOpResourceInstancesDto) {
        var wipOpResourceInstancesOptional = wipOpResourceInstancesService.saveOrUpdate(wipOpResourceInstancesDto);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if (wipOpResourceInstancesOptional.isPresent()) {
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }*/
}
