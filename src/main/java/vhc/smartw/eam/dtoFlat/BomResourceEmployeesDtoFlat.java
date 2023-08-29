package vhc.smartw.eam.dtoFlat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import vhc.smartw.eam.config.BomResourceEmployeesId;
import vhc.smartw.eam.config.Constants;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BomResourceEmployeesDtoFlat {
    @NotNull
    @JsonProperty("resource_id")
    private Long resourceId;
    @NotNull
    @JsonProperty("organization_id")
    private Long organizationId;
    @NotNull
    @JsonProperty("person_id")
    private Long personId;
    @NotNull
    @JsonProperty("effective_start_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date effectiveStartDate;
    @NotNull
    @JsonProperty("effective_end_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date effectiveEndDate;
    @NotNull
    @JsonProperty("instance_id")
    private Long instanceId;
    @NotNull
    @JsonProperty("interleave")
    private Long interleave;
    @JsonProperty("last_updated_by")
    private String lastUpdatedBy;
    @JsonProperty("last_update_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date lastUpdateDate;
    @JsonProperty("created_by")
    private String createdBy;
    @JsonProperty("creation_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date creationDate;
}
