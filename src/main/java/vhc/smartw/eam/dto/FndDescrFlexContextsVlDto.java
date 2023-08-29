package vhc.smartw.eam.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import vhc.smartw.eam.config.Constants;
import vhc.smartw.eam.config.FndDescrFlexContextsVlId;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FndDescrFlexContextsVlDto {
    @NotNull
    @JsonProperty("fnd_descr_flex_contexts_vl_id")
    private FndDescrFlexContextsVlId fndDescrFlexContextsVlId;

    @JsonProperty("descriptive_flex_context_name")
    private String descriptiveFlexContextName;

    @JsonProperty("description")
    private String description;

    @JsonProperty("enabled_flag")
    private String enabledFlag;

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
