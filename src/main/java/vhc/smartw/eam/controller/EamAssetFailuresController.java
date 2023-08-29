package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vhc.smartw.eam.dto.EamAssetFailuresDto;
import vhc.smartw.eam.service.EamAssetFailuresService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/eamAssetFailure")
public class EamAssetFailuresController {
    @Autowired
    private EamAssetFailuresService eamAssetFailuresService;

    @GetMapping("/{id}")
    public ResponseEntity<EamAssetFailuresDto> getById(@PathVariable long id){
        var eamAssetFailuresDtoOptional = eamAssetFailuresService.getById(id);

        if(eamAssetFailuresDtoOptional.isPresent()){
            var eamAssetFailures = eamAssetFailuresDtoOptional.get();

            return ResponseEntity.ok(eamAssetFailures);
        }

        return ResponseEntity.noContent().build();
    }
}