package vhc.smartw.eam.controller;

import vhc.smartw.eam.dto.CsiIAssetsDto;
import vhc.smartw.eam.dto.CsiIiGeolocationsDto;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dto.ResponseObject;
import vhc.smartw.eam.entity.CsiIiGeolocations;
import vhc.smartw.eam.service.CsiIiGeolocationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/csiIiGeolocations")
public class CsiIiGeolocationsController {
    @Autowired
    CsiIiGeolocationsService csiIiGeolocationsService;
    //list
    @GetMapping
    public ResponseEntity<List<CsiIiGeolocations>>list(){
        List<CsiIiGeolocations>list = csiIiGeolocationsService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //getid
    @GetMapping("/{instanceId}")
    public ResponseEntity<CsiIiGeolocations>getById(@PathVariable Long instanceId){
        CsiIiGeolocations csiIiGeolocations = csiIiGeolocationsService.getById(instanceId).get();
        return new ResponseEntity<>(csiIiGeolocations,HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody CsiIiGeolocationsDto csiIiGeolocationsDto){
        var csiIiGeolocationsDtoOptional = csiIiGeolocationsService.save(csiIiGeolocationsDto);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if(csiIiGeolocationsDtoOptional.isPresent()){
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
    public ResponseEntity<CsiIiGeolocations>update(@RequestBody CsiIiGeolocations csiIiGeolocations){
        CsiIiGeolocations newCsiIiGeolocations = csiIiGeolocationsService.updateCsiIiGeolocations(csiIiGeolocations);
        return new ResponseEntity<>(newCsiIiGeolocations,HttpStatus.OK);
    }
    //delete
    @DeleteMapping("/{instanceId}")
    public ResponseEntity<?>delete(Long instanceId){
        csiIiGeolocationsService.delete(instanceId);
        ResponseObject responseObject = new ResponseObject(true,null);
        return new ResponseEntity<>(responseObject,HttpStatus.OK);
    }
}
