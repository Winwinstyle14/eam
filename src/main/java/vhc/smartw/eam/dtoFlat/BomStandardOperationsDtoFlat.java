package vhc.smartw.eam.dtoFlat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import vhc.smartw.eam.config.BomStandardOperationsId;
import vhc.smartw.eam.config.Constants;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BomStandardOperationsDtoFlat {
    @NotNull
    @JsonProperty("standard_operation_id")
    private Long standardOperationId;
    @NotNull
    @JsonProperty("operation_code")
    private String operationCode;
    @NotNull
    @JsonProperty("operation_description")
    private String operationDescription;
    @NotNull
    @JsonProperty("department_id")
    private Long departmentId;
    @JsonProperty("shutdown_type")
    private String shutdownType;
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
