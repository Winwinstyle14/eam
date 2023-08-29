package vhc.smartw.eam.controller;

import vhc.smartw.eam.dto.CsiCounterAssociationsDto;
import vhc.smartw.eam.dto.HrAllOrganizationUnitsDto;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dto.ResponseObject;
import vhc.smartw.eam.entity.CsiCounterAssociations;
import vhc.smartw.eam.service.CsiCounterAssociationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/csiCounterAssociations")
public class CsiCounterAssociationsController {
    @Autowired
    CsiCounterAssociationsService csiCounterAssociationsService;

    //list
    @GetMapping
    public ResponseEntity<List<CsiCounterAssociations>>list(){
        List<CsiCounterAssociations>list = csiCounterAssociationsService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //get id
    @GetMapping("/{instanceAssociationId}")
    public ResponseEntity<CsiCounterAssociations>getById(@PathVariable Long instanceAssociationId){
        CsiCounterAssociations csiCounterAssociations = csiCounterAssociationsService.getById(instanceAssociationId).get();
        return new ResponseEntity<>(csiCounterAssociations,HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody CsiCounterAssociationsDto csiCounterAssociationsDto){
        var csiCounterAssociationsDtoOptional = csiCounterAssociationsService.save(csiCounterAssociationsDto);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if(csiCounterAssociationsDtoOptional.isPresent()){
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
    public ResponseEntity<CsiCounterAssociations>update(@RequestBody CsiCounterAssociations csiCounterAssociations){
        CsiCounterAssociations newCsiCounterAssociations1  = csiCounterAssociationsService.updateCsiCounterAssociations(csiCounterAssociations);
        return new ResponseEntity<>(newCsiCounterAssociations1,HttpStatus.OK);
    }
    //delete
    @DeleteMapping("/{instanceAssociationId}")
    public ResponseEntity<?>delete(@PathVariable Long instanceAssociationId){
        if (!csiCounterAssociationsService.existsById(instanceAssociationId))
            return new ResponseEntity<>(new ResponseObject(false,null),HttpStatus.NOT_FOUND);
        csiCounterAssociationsService.delete(instanceAssociationId);
        return new ResponseEntity<>(new ResponseObject(true,null),HttpStatus.OK);
    }
}
