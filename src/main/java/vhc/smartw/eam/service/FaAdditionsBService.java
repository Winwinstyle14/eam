package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.dto.FaAdditionsBDto;
import vhc.smartw.eam.entity.FaAdditionsB;
import vhc.smartw.eam.repository.FaAdditionsBRepository;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class FaAdditionsBService {
    @Autowired
    FaAdditionsBRepository faAdditionsBRepository;
    @Autowired
    ModelMapper modelMapper;

    //add
    public Optional<FaAdditionsBDto>save(FaAdditionsBDto faAdditionsBDto){
        try{
            var faAdditionsB = modelMapper.map(faAdditionsBDto, FaAdditionsB.class);

            faAdditionsB = faAdditionsBRepository.save(faAdditionsB);

            return Optional.of(modelMapper.map(faAdditionsB, FaAdditionsBDto.class));
        }catch (Exception e){
            log.error("Can't update additions: {}", e);
        }
        return Optional.empty();
    }
}
