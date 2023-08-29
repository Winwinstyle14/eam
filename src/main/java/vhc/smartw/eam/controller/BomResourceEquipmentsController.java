package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dtoFlat.BomResourceEmployeesDtoFlat;
import vhc.smartw.eam.dtoFlat.BomResourceEquipmentsDtoFlat;
import vhc.smartw.eam.entity.BomResourceEquipments;
import vhc.smartw.eam.service.BomResourceEquipmentsService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bomResourceEquipments")
public class BomResourceEquipmentsController {
    @Autowired
    BomResourceEquipmentsService bomResourceEquipmentsService;

    //list
    @GetMapping
    public ResponseEntity<List<BomResourceEquipments>>list(){
        List<BomResourceEquipments>list = bomResourceEquipmentsService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody BomResourceEquipmentsDtoFlat bomResourceEquipmentsDtoFlat){
        var bomResourceEmployeesDtoOptional = bomResourceEquipmentsService.save(bomResourceEquipmentsDtoFlat);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if(bomResourceEmployeesDtoOptional.isPresent()){
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }
}
