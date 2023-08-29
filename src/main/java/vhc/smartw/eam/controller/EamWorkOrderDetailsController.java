package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vhc.smartw.eam.dto.EamWorkOrderDetailsDto;
import vhc.smartw.eam.entity.EamResolutionCodes;
import vhc.smartw.eam.entity.EamWorkOrderDetails;
import vhc.smartw.eam.service.EamResolutionCodesService;
import vhc.smartw.eam.service.EamWorkOrderDetailsService;

import java.util.List;

@Controller
@RequestMapping("/api/v1/eamWorkOrderDetails")
public class EamWorkOrderDetailsController {
    @Autowired
    EamWorkOrderDetailsService eamWorkOrderDetailsService;

    //list
    @GetMapping
    public ResponseEntity<EamWorkOrderDetailsDto> list(){
        var list = eamWorkOrderDetailsService.list();
        return ResponseEntity.ok(list.get());
    }
}
