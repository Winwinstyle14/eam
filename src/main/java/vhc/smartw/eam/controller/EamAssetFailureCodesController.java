package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vhc.smartw.eam.dto.EamAssetFailureCodesDto;
import vhc.smartw.eam.dto.WipDiscreteJobsDto;
import vhc.smartw.eam.service.EamAssetFailureCodesService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/eamAssetFailureCodes")
public class EamAssetFailureCodesController {
    @Autowired
    EamAssetFailureCodesService eamAssetFailureCodesService;

    /*@GetMapping
    public ResponseEntity<List<EamAssetFailureCodesDto>> list(){
        List<EamAssetFailureCodesDto>list = eamAssetFailureCodesService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }*/
}
