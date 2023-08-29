package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import vhc.smartw.eam.dto.MeterReadingDto;
import vhc.smartw.eam.dto.MfgLookupsDto;
import vhc.smartw.eam.entity.MfgLookups;

import java.util.Date;
import java.util.Optional;

@Service
@Slf4j
public class MeterReadingService {

  private RestTemplate restTemplate;
    @Autowired
    public MeterReadingService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public Optional<MeterReadingDto> save(MeterReadingDto meterReadingDto) {
        try {
            HttpEntity<MeterReadingDto> entity = new HttpEntity<>(meterReadingDto);
            ResponseEntity<MeterReadingDto> response = restTemplate.exchange(
                    "http://10.3.6.199:8003/EAM_API?function=wometersync",
                    HttpMethod.POST,
                    entity,
                    MeterReadingDto.class
            );

            if (response.getStatusCode().is2xxSuccessful()) {
                return Optional.of(response.getBody());
            }
        } catch (Exception e) {
            log.error("Can't update meterReading: {}", e);
        }
        return Optional.empty();
    }
}
