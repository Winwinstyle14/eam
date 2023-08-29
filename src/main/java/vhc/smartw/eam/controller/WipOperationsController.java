package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vhc.smartw.eam.dto.WipEntitiesDto;
import vhc.smartw.eam.dto.WipOperationsDto;
import vhc.smartw.eam.entity.WipOperations;
import vhc.smartw.eam.service.WipOperationsService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/wipOperations")
public class WipOperationsController {
    @Autowired
    WipOperationsService wipOperationsService;



}