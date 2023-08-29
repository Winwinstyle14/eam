package vhc.smartw.eam.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import vhc.smartw.eam.config.Constants;
import vhc.smartw.eam.config.EamFailureSetAssociationsId;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EamFailureSetAssociationsDto {
    @NotNull
    @JsonProperty("eam_failure_set_associations_id")
    private EamFailureSetAssociationsId eamFailureSetAssociationsId;

    @JsonProperty("failure_code_required")
    private String failureCodeRequired;

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
}
