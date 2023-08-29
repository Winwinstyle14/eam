package vhc.smartw.eam.controller;

import vhc.smartw.eam.dto.CsiIiGeolocationsDto;
import vhc.smartw.eam.dto.CsiInstanceStatusDto;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dto.ResponseObject;
import vhc.smartw.eam.entity.CsiInstanceStatus;
import vhc.smartw.eam.service.CsiInstanceStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/csiInstanceStatus")
public class CsiInstanceStatusController {
    @Autowired
    CsiInstanceStatusService csiInstanceStatusService;

    //list
    @GetMapping
    public ResponseEntity<List<CsiInstanceStatus>>list(){
        List<CsiInstanceStatus>list = csiInstanceStatusService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //get id
    @GetMapping("/{instanceStatusId}")
    public ResponseEntity<CsiInstanceStatus>getByid(@PathVariable Long instanceStatusId){
        CsiInstanceStatus csiInstanceStatus = csiInstanceStatusService.getById(instanceStatusId).get();
        return new ResponseEntity<>(csiInstanceStatus,HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody CsiInstanceStatusDto csiInstanceStatusDto){
        var csiInstanceStatusDtoOptional = csiInstanceStatusService.save(csiInstanceStatusDto);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if(csiInstanceStatusDtoOptional.isPresent()){
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }
    //update
    @PutMapping
    public ResponseEntity<CsiInstanceStatus>update(@RequestBody CsiInstanceStatus csiInstanceStatus){
        CsiInstanceStatus newCsiInstanceStatus = csiInstanceStatusService.updateCsiInstanceStatus(csiInstanceStatus);
        return new ResponseEntity<>(newCsiInstanceStatus,HttpStatus.OK);
    }
    //delete
    @DeleteMapping("/{instanceStatusId}")
    public ResponseEntity<?>delete(@PathVariable Long instanceStatusId){
        if(!csiInstanceStatusService.existsById(instanceStatusId))
            return new ResponseEntity<>(new ResponseObject(false,null),HttpStatus.NOT_FOUND);
        csiInstanceStatusService.delete(instanceStatusId);
        return new ResponseEntity<>(new ResponseObject(true,null),HttpStatus.OK);
    }
}
