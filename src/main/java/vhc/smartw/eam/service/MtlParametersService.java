package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import vhc.smartw.eam.dto.MtlObjectGenealogyDto;
import vhc.smartw.eam.dto.MtlParametersDto;
import vhc.smartw.eam.entity.MtlObjectGenealogy;
import vhc.smartw.eam.entity.MtlParameters;
import vhc.smartw.eam.repository.MtlParametersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class MtlParametersService {
    @Autowired
    MtlParametersRepository mtlParametersRepository;
    @Autowired
    ModelMapper modelMapper;

    //list
    public List<MtlParameters>list(){
        return mtlParametersRepository.findAll();
    }

    //add
    public Optional<MtlParametersDto> save(MtlParametersDto mtlParametersDto){
        try {
            var mtlParameters = modelMapper.map(mtlParametersDto, MtlParameters.class);

            mtlParameters = mtlParametersRepository.save(mtlParameters);

            return Optional.of(modelMapper.map(mtlParameters, MtlParametersDto.class));
        }catch (Exception e){
            log.error("Can't update Locations: {}", e);
        }
        return Optional.empty();
    }

}
