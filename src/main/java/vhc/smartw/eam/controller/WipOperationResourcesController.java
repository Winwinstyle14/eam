package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dto.WipOpResourceInstancesDto;
import vhc.smartw.eam.dto.WipOperationResourcesDto;
import vhc.smartw.eam.entity.WipOperationResources;
import vhc.smartw.eam.service.WipOperationResourcesService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/wipOperationResources")
public class WipOperationResourcesController {
    @Autowired
    WipOperationResourcesService wipOperationResourcesService;
    @GetMapping
    public ResponseEntity<List< WipOperationResourcesDto>> list(){
        List<WipOperationResourcesDto>list = wipOperationResourcesService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    /*@PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody WipOperationResourcesDto wipOperationResourcesDto) {
        var wipOperationResourcesOptional = wipOperationResourcesService.saveOrUpdate(wipOperationResourcesDto);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if (wipOperationResourcesOptional.isPresent()) {
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }*/
}
