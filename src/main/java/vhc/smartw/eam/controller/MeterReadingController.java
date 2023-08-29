package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dto.MeterReadingDto;
import vhc.smartw.eam.dto.MfgLookupsDto;
import vhc.smartw.eam.service.MeterReadingService;

@RestController
@RequestMapping("/api/v1/meterReading")
public class MeterReadingController {
    @Autowired
    MeterReadingService meterReadingService;

    @PostMapping
    public ResponseEntity<MessageResponse> add(@RequestBody MeterReadingDto meterReadingDto){
        var meterReadingDtoOptional = meterReadingService.save(meterReadingDto);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if(meterReadingDtoOptional.isPresent()){
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }
}
