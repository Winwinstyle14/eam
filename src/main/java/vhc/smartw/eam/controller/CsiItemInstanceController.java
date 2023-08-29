package vhc.smartw.eam.controller;

import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dto.ResponseObject;
import vhc.smartw.eam.dtoFlat.CsiItemInstanceDtoFlat;
import vhc.smartw.eam.entity.CsiItemInstance;
import vhc.smartw.eam.service.CsiItemInstanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/csiItemInstance")
public class CsiItemInstanceController {
    @Autowired
    CsiItemInstanceService csiItemInstanceService;

    //list
    @GetMapping
    public ResponseEntity<List<CsiItemInstance>>list(){
        List<CsiItemInstance>list = csiItemInstanceService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //get id
    @GetMapping("/{instanceNumber}")
    public ResponseEntity<CsiItemInstance>getById(@PathVariable String instanceNumber){
        CsiItemInstance csiItemInstance = csiItemInstanceService.getById(instanceNumber).get();
        return new ResponseEntity<>(csiItemInstance,HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody CsiItemInstanceDtoFlat csiItemInstanceDtoFlat){
        var csiItemInstanceDtoOptional = csiItemInstanceService.save(csiItemInstanceDtoFlat);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if(csiItemInstanceDtoOptional.isPresent()){
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
    public ResponseEntity<CsiItemInstance>update(@RequestBody CsiItemInstance csiItemInstance){
        CsiItemInstance newCsiItemInstance = csiItemInstanceService.updateCsiItemInstance(csiItemInstance);
        return new ResponseEntity<>(newCsiItemInstance,HttpStatus.OK);
    }
    //delete
    @DeleteMapping("/{instanceNumber}")
    public ResponseEntity<?>delete(@PathVariable String instanceNumber){
        if(!csiItemInstanceService.existsById(instanceNumber))
            return new ResponseEntity<>(new ResponseObject(false,null),HttpStatus.NOT_FOUND);
        csiItemInstanceService.delete(instanceNumber);
        return new ResponseEntity<>(new ResponseObject(true,null),HttpStatus.OK);
    }
}
