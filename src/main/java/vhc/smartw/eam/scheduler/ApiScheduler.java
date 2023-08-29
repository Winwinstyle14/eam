package vhc.smartw.eam.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import vhc.smartw.eam.dto.MessageResponse;
import vhc.smartw.eam.dto.MeterReadingDto;
import vhc.smartw.eam.dto.MeterReadingRequestDto;
import vhc.smartw.eam.service.EamAPIService;
import vhc.smartw.eam.service.EamMeterReadingService;

import java.time.LocalDate;

@Component
public class ApiScheduler {
    @Autowired
    private EamMeterReadingService eamMeterReadingService;

    @Scheduled(cron = "0 0 1 * * *")
    public void run() {
        var localDateNow= LocalDate.now();
        var startDate = localDateNow.plusDays(-1);

        var meterReadingRequestDto = MeterReadingRequestDto.builder()
                .startDate(startDate)
                .endDate(localDateNow)
                .build();

        eamMeterReadingService.pushMeter(meterReadingRequestDto);
    }

}
