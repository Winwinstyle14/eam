package vhc.smartw.eam.dtoFlat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import vhc.smartw.eam.config.Constants;
import vhc.smartw.eam.config.FndDescrFlexContextsVlId;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FndDescrFlexContextsVlDtoFlat {
    @NotNull
    @JsonProperty("application_id")
    private Long applicationId;

    @NotNull
    @JsonProperty("descriptive_flex_context_code")
    private String descriptiveFlexContextCode;

    @NotNull
    @JsonProperty("descriptive_flex_context_name")
    private String descriptiveFlexContextName;

    @JsonProperty("description")
    private String description;

    @JsonProperty("enabled_flag")
    private String enabledFlag;

    @NotNull
    @JsonProperty("descriptive_flexfield_name")
    private String descriptiveFlexfieldName;

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
