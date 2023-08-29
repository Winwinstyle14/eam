package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dto.WORequestDto;
import vhc.smartw.eam.dto.WipEntitiesDto;
import vhc.smartw.eam.service.WipEntitiesService;
import vhc.smartw.eam.utils.StringTool;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/wipEntities")
public class WipEntitiesController {
    @Autowired
    WipEntitiesService wipEntitiesService;

    @GetMapping("/{id}")
    public ResponseEntity<WipEntitiesDto> findById(
            @PathVariable long id
    ) {
        var wipEntitiesDtoOptional = wipEntitiesService.getById(id);

        if(wipEntitiesDtoOptional.isPresent()){
            var wipEntities = wipEntitiesDtoOptional.get();

            return ResponseEntity.ok(wipEntities);
        }

        return ResponseEntity.noContent().build();
    }

    /**
     * Nhận WO từ EAM/sMartW
     * WO từ EAM wipEntitiesDto.systemType = null
     * @return {@link MessageResponse}
     */
    @PostMapping
    public ResponseEntity<MessageResponse> save(@RequestBody WipEntitiesDto wipEntitiesDto) {
        var messageResponseOptional = wipEntitiesService.save(wipEntitiesDto);

        return ResponseEntity.ok(messageResponseOptional);
    }

    @PostMapping("/smartw-test")
    public ResponseEntity<Optional<WORequestDto>>receiveFromWTest(@RequestBody WipEntitiesDto wipEntitiesDto) {
        /** Sinh tự động nếu chưa có Wo Name*/
        if(!StringUtils.hasText(wipEntitiesDto.getWipEntityName())){
            wipEntitiesDto.setWipEntityName(StringTool.generateWoName());
        }

        /** Save sMartW*/
        var messageResponseOptional = wipEntitiesService.saveAndCallAPITest(wipEntitiesDto);

        return ResponseEntity.ok(messageResponseOptional);
    }

}
