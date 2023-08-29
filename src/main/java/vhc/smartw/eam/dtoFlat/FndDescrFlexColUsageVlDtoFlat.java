package vhc.smartw.eam.dtoFlat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import vhc.smartw.eam.config.Constants;
import vhc.smartw.eam.config.FndDescrFlexColUsageVlId;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FndDescrFlexColUsageVlDtoFlat {
    @NotNull
    @JsonProperty("application_id")
    private Long applicationId;

    @NotNull
    @JsonProperty("descriptive_flex_context_code")
    private String descriptiveFlexContextCode;

    @NotNull
    @JsonProperty("application_column_name")
    private String applicationColumnName;

    @JsonProperty("descriptive_flexfield_name")
    private String descriptiveFlexfieldName;

    @NotNull
    @JsonProperty("column_seq_num")
    private Long columnSeqNum;

    @NotNull
    @JsonProperty("end_user_column_name")
    private String endUserColumnName;

    @NotNull
    @JsonProperty("form_left_prompt")
    private String formLeftPrompt;

    @JsonProperty("flex_value_set_id")
    private Long flexValueSetId;

    @JsonProperty("display_flag")
    private String displayFlag;

    @JsonProperty("enabled_flag")
    private String enabledFlag;

    @JsonProperty("description")
    private String description;

    @JsonProperty("default_value")
    private String defaultValue;

    @JsonProperty("runtime_property_function")
    private String runtimePropertyFunction;

    @JsonProperty("required_flag")
    private String requiredFlag;

    @JsonProperty("security_enabled_flag")
    private String securityEnabledFlag;

    @JsonProperty("display_size")
    private Long displaySize;

    @JsonProperty("maximum_description_len")
    private Long maximumDescriptionLen;

    @JsonProperty("concatenation_description_len")
    private Long concatenationDescriptionLen;

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
