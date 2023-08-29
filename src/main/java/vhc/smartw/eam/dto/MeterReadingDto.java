package vhc.smartw.eam.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import vhc.smartw.eam.config.Constants;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MeterReadingDto {
    @JsonProperty("CSHT_CODE")
    private String cshtCode;

    @JsonProperty("INSTANCE_NUMBER")
    private String instanceNumber;

    @JsonProperty("START_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date startDate;

    @JsonProperty("END_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date endDate;
}
