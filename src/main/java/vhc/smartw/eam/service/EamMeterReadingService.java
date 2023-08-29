package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.dto.MeterReadingDto;
import vhc.smartw.eam.dto.MeterReadingRequestDto;
import vhc.smartw.eam.entity.EamMeterReading;
import vhc.smartw.eam.repository.EamMeterReadingRepository;

import java.util.ArrayList;
import java.util.Date;

@Service
@Slf4j
public class EamMeterReadingService {
    @Autowired
    EamMeterReadingRepository eamMeterReadingRepository;
    @Autowired
    EamAPIService eamAPIService;

    public void pushMeter(MeterReadingRequestDto meterReadingRequestDto){
        final var eamMeterReadingList=
                eamMeterReadingRepository.findAllByTime(meterReadingRequestDto.getStartDate(), meterReadingRequestDto.getEndDate());

        var eamMeterReadingCollect = new ArrayList<EamMeterReading>();
        for(var eamMeterReading : eamMeterReadingList){
            System.out.println("START="+new Date());
            try {
                final var meterReadingDto = MeterReadingDto.builder()
                        .cshtCode(eamMeterReading.getCshtCode())
                        .startDate(eamMeterReading.getStartDate())
                        .endDate(eamMeterReading.getEndDate())
                        .build();

                final var messageResponse= eamAPIService.meterReading(meterReadingDto);

                eamMeterReading.setEamPush(1L);
                eamMeterReading.setErrorCode(messageResponse.getErrorCode());
                eamMeterReading.setErrorMessage(messageResponse.getErrorMessage());

                eamMeterReadingCollect.add(eamMeterReading);
            }catch (Exception e){
                log.error(""+e);
            }

            System.out.println("END="+new Date());
        }

        eamMeterReadingRepository.saveAll(eamMeterReadingCollect);
    }
}
