package vhc.smartw.eam.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import vhc.smartw.eam.config.Constants;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class WoRequestStatusDto {
    @JsonProperty("WIP_ENTITY_NAME")
    private String wipEntityName;

    @JsonProperty( "STATUS_CHANGE_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date statusChangeDate;

    @JsonProperty( "ACTUAL_START_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date actualStartDate;

    @JsonProperty( "DATE_COMPLETED")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date dateCompleted;

    @JsonProperty("COUNTER_READING")
    private Long counterReading;

    @JsonProperty("STATUS_TYPE")
    private Integer statusType;
}
