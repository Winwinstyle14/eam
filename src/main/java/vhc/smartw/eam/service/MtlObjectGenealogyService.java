package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.dto.MtlObjectGenealogyDto;
import vhc.smartw.eam.entity.MtlObjectGenealogy;
import vhc.smartw.eam.repository.MtlObjectGenealogyRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class MtlObjectGenealogyService {
    @Autowired
    MtlObjectGenealogyRepository mtlObjectGenealogyRepository;

    @Autowired
    ModelMapper modelMapper;

    //list
    public List<MtlObjectGenealogy>list(){
        return mtlObjectGenealogyRepository.findAll();
    }
    //add
    public Optional<MtlObjectGenealogyDto> save(MtlObjectGenealogyDto mtlObjectGenealogyDto){
        try {
            var mtlObjectGenealogy = modelMapper.map(mtlObjectGenealogyDto, MtlObjectGenealogy.class);

            mtlObjectGenealogy = mtlObjectGenealogyRepository.save(mtlObjectGenealogy);

            return Optional.of(modelMapper.map(mtlObjectGenealogy, MtlObjectGenealogyDto.class));
        }catch (Exception e){
            log.error("Can't update Locations: {}", e);
        }
        return Optional.empty();
    }

}
