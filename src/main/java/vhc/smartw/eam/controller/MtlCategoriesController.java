package vhc.smartw.eam.controller;

import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dto.MtlCategoriesDto;
import vhc.smartw.eam.entity.MtlCategories;
import vhc.smartw.eam.service.MtlCategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/mtlcategories")
public class MtlCategoriesController {
    @Autowired
    MtlCategoriesService mtlCategoriesService;

    //list
    @GetMapping
    public ResponseEntity<List<MtlCategories>>list(){
        List<MtlCategories>list = mtlCategoriesService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    //add
    @PostMapping
    public ResponseEntity<MessageResponse>add(@RequestBody MtlCategoriesDto mtlCategoriesDto){
        var mtlCategoriesDtoOptional = mtlCategoriesService.save(mtlCategoriesDto);

        var message = MessageResponse.builder()
                .errorMessage("Thực hiện không thành công.")
                .errorCode("1")
                .build();

        if(mtlCategoriesDtoOptional.isPresent()){
            message = MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .result("")
                    .build();
        }

        return ResponseEntity.ok(message);
    }

}
