package vhc.smartw.eam.config;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.AbstractConverter;
import org.modelmapper.Conditions;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.convention.NameTokenizers;
import org.modelmapper.spi.MappingContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import vhc.smartw.eam.definition.WoStatus;

@Configuration
public class ModelMapperConfig {
    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();

        // application config
        modelMapper.getConfiguration()
                .setSkipNullEnabled(true)
                .setMatchingStrategy(MatchingStrategies.STRICT)
                .setUseOSGiClassLoaderBridging(true)
                .setPreferNestedProperties(false)
                .setSourceNameTokenizer(NameTokenizers.UNDERSCORE)
                .setDestinationNameTokenizer(NameTokenizers.UNDERSCORE);

        // convert WO status <-------> int
        modelMapper.addConverter(new AbstractConverter<WoStatus, Integer>() {
            @Override
            protected Integer convert(WoStatus source) {
                return source.getDbVal();
            }
        });
        modelMapper.addConverter(new AbstractConverter<Integer, WoStatus>() {
            @Override
            protected WoStatus convert(Integer source) {
                for (WoStatus status : WoStatus.values()) {
                    if (status.getDbVal().equals(source)) {
                        return status;
                    }
                }

                return null;
            }
        });

        return modelMapper;
    }
}