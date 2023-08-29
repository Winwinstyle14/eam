package vhc.smartw.eam.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import vhc.smartw.eam.config.Constants;

import java.util.Date;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MtlEamLocationsDto {
    @NotNull
    @JsonProperty("location_id")
    private Long locationId;
    @JsonProperty("organization_id")
    private Long organizationId;
    @NotNull
    @JsonProperty("location_codes")
    private String locationCodes;
    @JsonProperty("last_update_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date lastUpdateDate;
    @JsonProperty("last_updated_by")
    private String lastUpdatedBy;
    @JsonProperty("created_by")
    private String createdBy;
    @JsonProperty("creation_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date creationDate;
    @JsonProperty("description")
    private String description;
}
