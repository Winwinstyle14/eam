package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.dto.*;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
@Slf4j
public class EamAPIService {
    @Value("${app.eam.service}")
    private String eamUrl;
    @Autowired
    private RestTemplate restTemplate;

    /**
     * Create WO EAM
     * @return {@link MessageResponse}
     */
    public MessageResponse createWO(WORequestDto woRequestDto) {
        final var URL_CREATE_WO = String.format(eamUrl+"/EAM_API?function=wocreate");
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

            HttpEntity<WORequestDto> requestBody = new HttpEntity<>(woRequestDto, headers);

            ResponseEntity<MessageResponse> responseEntity = restTemplate.exchange(URL_CREATE_WO, HttpMethod.POST, requestBody, MessageResponse.class);

            MessageResponse messageResponse = responseEntity.getBody();

            if(messageResponse.getErrorCode().equals("1")){
                messageResponse.setResult(woRequestDto);
            }

            return messageResponse;
        } catch (Exception e) {
            System.out.println("Can't call api create wo: "+e);
            log.error("Can't call api create wo: "+ e);
            return MessageResponse.builder()
                    .errorCode("1")
                    .errorMessage(e.getMessage())
                    .result(woRequestDto)
                    .build();
        }
    }

    /**
     * Update WO Info EAM
     * @return {@link MessageResponse}
     */
    public MessageResponse updateWOInfo(WORequestDto woRequestDto){
        final var URL_UPDATE_WO_INFO = String.format(eamUrl+"/EAM_API?function=woupdateinfo");
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

            HttpEntity<WORequestDto> requestBody = new HttpEntity<>(woRequestDto, headers);

            ResponseEntity<MessageResponse> responseEntity = restTemplate.exchange(URL_UPDATE_WO_INFO, HttpMethod.POST, requestBody, MessageResponse.class);

            MessageResponse messageResponse = responseEntity.getBody();

            if(messageResponse.getErrorCode().equals("1")){
                messageResponse.setResult(woRequestDto);
            }

            return messageResponse;
        } catch (Exception e) {
            System.out.println("Can't call api update info wo: "+e);
            log.error("Can't call api update info wo: "+ e);
            return MessageResponse.builder()
                    .errorCode("1")
                    .errorMessage(e.getMessage())
                    .result(woRequestDto)
                    .build();
        }
    }

    /**
     * Update WO Status EAM
     * @return {@link MessageResponse}
     */
    public MessageResponse updateWOStatus(WoRequestStatusDto woRequestStatusDto){
        final var URL_UPDATE_WO_STATUS = String.format(eamUrl+"/EAM_API?function=woupdatestatus");
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

            RestTemplate restTemplate = new RestTemplate();

            HttpEntity<WoRequestStatusDto> requestBody = new HttpEntity<>(woRequestStatusDto, headers);

            ResponseEntity<MessageResponse> responseEntity = restTemplate.exchange(URL_UPDATE_WO_STATUS, HttpMethod.POST, requestBody, MessageResponse.class);

            MessageResponse messageResponse = responseEntity.getBody();

            if(messageResponse.getErrorCode().equals("1")){
                messageResponse.setResult(woRequestStatusDto);
            }

            return messageResponse;
        } catch (Exception e) {
            System.out.println("Can't call api update status wo: "+e);
            log.error("Can't call api update status wo: "+ e);
            return MessageResponse.builder()
                    .errorCode("1")
                    .errorMessage(e.getMessage())
                    .result(woRequestStatusDto)
                    .build();
        }
    }

    /**
     * Xuat/Nhap Kho EAM
     * @return {@link MessageResponse}
     */
    public MessageResponse xuatNhapKho(XuatNhapDto xuatNhapDto){
        final var URL_XUAT_NHAP = String.format(eamUrl+"/EAM_API?function=womovecreate");

        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

            RestTemplate restTemplate = new RestTemplate();

            HttpEntity<XuatNhapDto> requestBody = new HttpEntity<>(xuatNhapDto, headers);

            ResponseEntity<MessageResponse> responseEntity = restTemplate.exchange(URL_XUAT_NHAP, HttpMethod.POST, requestBody, MessageResponse.class);

            MessageResponse messageResponse = responseEntity.getBody();

            if(messageResponse.getErrorCode().equals("1")){
                messageResponse.setResult(xuatNhapDto);
            }

            return messageResponse;
        } catch (Exception e) {
            System.out.println("Can't call api xuat/nhap kho: "+e);
            log.error("Can't call api xuat/nhap kho: "+ e);
            return MessageResponse.builder()
                    .errorCode("1")
                    .errorMessage(e.getMessage())
                    .result(xuatNhapDto)
                    .build();
        }
    }

    /**
     * Meter Reading EAM
     * @return {@link MessageResponse}
     */
    public MessageResponse meterReading(MeterReadingDto meterReadingDto){
        final var URL_METER_READING = String.format(eamUrl+"/EAM_API?function=wometersync");
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);

            HttpEntity<MeterReadingDto> requestBody = new HttpEntity<>(meterReadingDto, headers);

            ResponseEntity<MessageResponse> responseEntity = restTemplate.exchange(URL_METER_READING, HttpMethod.POST, requestBody, MessageResponse.class);

            MessageResponse messageResponse = responseEntity.getBody();

            if(messageResponse.getErrorCode().equals("1")){
                messageResponse.setResult(meterReadingDto);
            }

            return messageResponse;
        }catch (Exception e){
            log.error("Can't call api meter reading: "+ e);

            return MessageResponse.builder()
                    .errorCode("1")
                    .errorMessage(e.getMessage())
                    .result(meterReadingDto)
                    .build();
        }
    }

    /**
     * Get OnHand
     * @return {@link MessageResponse}
     */
    public OnHandResponseDto getOnHand(OnHandRequestDto onHandRequestDto){
        final var URL_ON_HAND = String.format(eamUrl+"/EAM_API?function=getonhand");
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);

            HttpEntity<OnHandRequestDto> requestBody = new HttpEntity<>(onHandRequestDto, headers);

            ResponseEntity<OnHandResponseDto> responseEntity = restTemplate.exchange(URL_ON_HAND, HttpMethod.POST, requestBody, OnHandResponseDto.class);

            OnHandResponseDto messageResponse = responseEntity.getBody();

            if(messageResponse.getErrorCode().equals("1")){
                messageResponse.setRequest(onHandRequestDto);
            }

            return messageResponse;
        }catch (Exception e){
            log.error("Can't call api get on hand: "+ e);

            return OnHandResponseDto.builder()
                    .errorCode("1")
                    .errorMessage(e.getMessage())
                    .request(onHandRequestDto)
                    .build();
        }
    }
}
