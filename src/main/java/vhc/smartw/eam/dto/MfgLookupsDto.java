package vhc.smartw.eam.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import vhc.smartw.eam.config.Constants;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MfgLookupsDto {
    @NotNull
    @JsonProperty("lookup_code")
    private Long lookupCode;
    @JsonProperty("lookup_type")
    private String lookupType;
    @JsonProperty("meaning")
    private String meaning;
    @JsonProperty("description")
    private String description;
    @JsonProperty("enabled_flag")
    private String enabledFlag;
    @JsonProperty("start_date_active")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date startDateActive;
    @JsonProperty("end_date_active")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date endDateActive;
    @JsonProperty("created_by")
    private String createdBy;
    @JsonProperty("creation_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date creationDate;
    @JsonProperty("last_updated_by")
    private String lastUpdatedBy;
    @JsonProperty("last_update_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date lastUpdateDate;
    @JsonProperty("last_update_login")
    private Long lastUpdateLogin;
}
