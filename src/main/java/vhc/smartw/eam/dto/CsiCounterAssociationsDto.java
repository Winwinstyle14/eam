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
public class CsiCounterAssociationsDto {
    @NotNull
    @JsonProperty("instance_association_id")
    private Long instanceAssociationId;
    @NotNull
    @JsonProperty("source_object_code")
    private String sourceObjectCode;
    @NotNull
    @JsonProperty("source_object_id")
    private Long sourceObjectId;
    @JsonProperty("counter_id")
    private Long counterId;
    @JsonProperty("start_date_active")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date startDateActive;
    @JsonProperty("end_date_active")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date endDateActive;
    @NotNull
    @JsonProperty("object_version_number")
    private Long objectVersionNumber;
    @JsonProperty("migrated_flag")
    private String migratedFlag;
    @JsonProperty("maint_organization_id")
    private Long maintOrganizationId;
    @JsonProperty("primary_failure_flag")
    private String primaryFailureFlag;
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
