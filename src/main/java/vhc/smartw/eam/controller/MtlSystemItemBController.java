package vhc.smartw.eam.controller;

import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dto.MtlSerialNumbersDto;
import vhc.smartw.eam.dto.MtlSystemItemBDto;
import vhc.smartw.eam.dto.ResponseObject;
import vhc.smartw.eam.dtoFlat.MtlSystemItemBDtoFlat;
import vhc.smartw.eam.entity.MtlSystemItemB;
import vhc.smartw.eam.service.MtlSystemItemBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/mtlSystemItemB")
public class MtlSystemItemBController {
    @Autowired
    MtlSystemItemBService mtlSystemItemBService;

    //list
    @GetMapping
    public ResponseEntity<List<MtlSystemItemB>>list(){
        List<MtlSystemItemB>list = mtlSystemItemBService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody MtlSystemItemBDtoFlat mtlSystemItemBDtoFlat) {
        var mtlSystemItemBDtoOptional = mtlSystemItemBService.save(mtlSystemItemBDtoFlat);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if (mtlSystemItemBDtoOptional.isPresent()) {
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }
}
