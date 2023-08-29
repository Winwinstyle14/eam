package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vhc.smartw.eam.dto.*;
import vhc.smartw.eam.service.EamAPIService;
import vhc.smartw.eam.service.EamMeterReadingService;

@RestController
@RequestMapping("/api/v1/eam-api")
public class EamAPIController {
    @Autowired
    private EamAPIService eamAPIService;
    @Autowired
    private EamMeterReadingService eamMeterReadingService;

    @PostMapping("/on-hand")
    public ResponseEntity<OnHandResponseDto> save(@RequestBody OnHandRequestDto onHandRequestDto) {
        var messageResponse = eamAPIService.getOnHand(onHandRequestDto);

        return ResponseEntity.ok(messageResponse);
    }

    @PostMapping("/meter-reading")
    public ResponseEntity<MessageResponse> meterReading(@RequestBody MeterReadingDto meterReadingDto) {
        var messageResponse = eamAPIService.meterReading(meterReadingDto);

        return ResponseEntity.ok(messageResponse);
    }

    @PostMapping("/meter-reading-by-time")
    public ResponseEntity<MessageResponse> meterReadingByTime(@RequestBody MeterReadingRequestDto meterReadingRequestDto) {
        eamMeterReadingService.pushMeter(meterReadingRequestDto);

        return ResponseEntity.ok(
                MessageResponse.builder()
                        .errorCode("0")
                        .errorMessage("Run meter reading success.")
                        .build()
        );
    }
}
