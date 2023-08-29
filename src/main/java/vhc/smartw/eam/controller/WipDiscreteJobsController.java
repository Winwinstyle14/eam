package vhc.smartw.eam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dto.WipDiscreteJobsDto;
import vhc.smartw.eam.service.WipDiscreteJobsService;

@RestController
@RequestMapping("/api/v1/wipDiscreteJobs")
public class WipDiscreteJobsController {
    @Autowired
    private WipDiscreteJobsService wipDiscreteJobsService;

    @GetMapping("/{id}")
    public ResponseEntity<WipDiscreteJobsDto> findById(
            @PathVariable long id
    ) {
        var wipDiscreteJobsDtoOptional = wipDiscreteJobsService.getById(id);

        if(wipDiscreteJobsDtoOptional.isPresent()){
            var wipDiscreteJobsDto = wipDiscreteJobsDtoOptional.get();

            return ResponseEntity.ok(wipDiscreteJobsDto);
        }

        return ResponseEntity.noContent().build();
    }

    /**
     *
     * @param @{@link WipDiscreteJobsDto}
     * @return
     */
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody WipDiscreteJobsDto wipDiscreteJobsDto) {
        //var user = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        var wipDiscreteJobsDtoOptional = wipDiscreteJobsService.save(1L,wipDiscreteJobsDto);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if (wipDiscreteJobsDtoOptional.isPresent()) {
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }
}
