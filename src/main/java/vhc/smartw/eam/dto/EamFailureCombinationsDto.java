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
public class EamFailureCombinationsDto {
    @NotNull
    @JsonProperty("combination_id")
    private Long combinationId;
    @JsonProperty("set_id")
    private Long setId;
    @JsonProperty("failure_code")
    private String failureCode;
    @JsonProperty("cause_code")
    private String causeCode;
    @JsonProperty("resolution_code")
    private String resolutionCode;
    @JsonProperty("effective_end_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date effectiveEndDate;
    @JsonProperty("last_update_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date lastUpdateDate;
    @JsonProperty("last_updated_by")
    private String lastUpdatedBy;
    @JsonProperty("creation_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date creationDate;
    @JsonProperty("created_by")
    private String createdBy;


    public Long getCombinationId() {
        return combinationId;
    }

    public Long getSetId() {
        return setId != null ? setId : Long.valueOf("");
    }

    public String getFailureCode() {
        return failureCode != null ? failureCode : "";
    }

    public String getCauseCode() {
        return causeCode != null ? causeCode : "";
    }

    public String getResolutionCode() {
        return resolutionCode != null ? resolutionCode : "";
    }

    public Date getEffectiveEndDate() {
        return effectiveEndDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }
}
