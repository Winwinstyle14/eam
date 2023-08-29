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
public class PerAllPeopleFDto {
    @NotNull
    @JsonProperty("person_id")
    private Long personId;
    @JsonProperty("employee_number")
    private String employeeNumber;
    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("effective_start_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date effectiveStartDate;
    @JsonProperty("effective_end_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date effectiveEndDate;
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
