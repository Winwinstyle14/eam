package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.spi.MappingContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.dto.EamWorkOrderDetailsDto;
import vhc.smartw.eam.repository.EamWorkOrderDetailsRepository;

import java.util.Optional;

@Service
@Slf4j
public class EamWorkOrderDetailsService {
    @Autowired
    EamWorkOrderDetailsRepository eamWorkOrderDetailsRepository;
    @Autowired
    ModelMapper modelMapper;
    //list
    public Optional<EamWorkOrderDetailsDto> list(){
        // Định nghĩa Converter
        Converter<Object, Object> nullToEmptyStringConverter = new Converter<Object, Object>() {
            @Override
            public Object convert(MappingContext<Object, Object> context) {
                if (context.getSource() == null) {
                    return "";
                }
                return context.getSource();
            }
        };

        // Đăng ký Converter với ModelMapper
        modelMapper.addConverter(nullToEmptyStringConverter);

        return Optional.of(modelMapper.map(eamWorkOrderDetailsRepository.findById(1L), EamWorkOrderDetailsDto.class));
    }
}
