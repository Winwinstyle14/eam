package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import vhc.smartw.eam.dto.BomDepartmentsDto;
import vhc.smartw.eam.dto.PerAllPeopleFDto;
import vhc.smartw.eam.entity.BomDepartments;
import vhc.smartw.eam.entity.PerAllPeopleF;
import vhc.smartw.eam.repository.BomDepartmentsRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class BomDepartmentsService {
    @Autowired
    BomDepartmentsRepository bomDepartmentsRepository;

    @Autowired
    ModelMapper modelMapper;

    //list
    public List<BomDepartments>list(){
        return bomDepartmentsRepository.findAll();
    }
    //add
    public Optional<BomDepartmentsDto> save(BomDepartmentsDto bomDepartmentsDto){
        try {
            var  bomDepartments = modelMapper.map(bomDepartmentsDto, BomDepartments.class);

            bomDepartments = bomDepartmentsRepository.save( bomDepartments);

            return Optional.of(modelMapper.map( bomDepartments, BomDepartmentsDto.class));
        }catch (Exception e){
            log.error("Can't update bomDepartments: {}", e);
        }
        return Optional.empty();
    }
}
