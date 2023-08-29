package vhc.smartw.eam.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import vhc.smartw.eam.config.Constants;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FndFlexValueSetsDto {
    @NotNull
    @JsonProperty("flex_value_set_id")
    private Long flexValueSetId;
    @JsonProperty("flex_value_set_name")
    private String flexValueSetName;
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
    @JsonProperty("last_update_login")
    private Long lastUpdateLogin;
    @JsonProperty("validation_type")
    private String validationType;
    @JsonProperty("protected_flag")
    private String protectedFlag;
    @JsonProperty("security_enabled_flag")
    private String securityEnabledFlag;
    @JsonProperty("longlist_flag")
    private String longlistFlag;
    @JsonProperty("format_type")
    private String formatType;
    @JsonProperty("maximum_size")
    private Long maximumSize;
    @JsonProperty("alphanumeric_allowed_flag")
    private String alphanumericAllowedFlag;
    @JsonProperty("uppercase_only_flag")
    private String uppercaseOnlyFlag;
    @JsonProperty("numeric_mode_enabled_flag")
    private String numericModeEnabledFlag;
    @JsonProperty("description")
    private String Description;
    @JsonProperty("dependant_default_value")
    private String dependantDefaultValue;
    @JsonProperty("dependant_default_meaning")
    private String dependantDefaultMeaning;
    @JsonProperty("parent_flex_value_set_id")
    private Long parentFlexValueSetId;
    @JsonProperty("minimum_value")
    private String minimumValue;
    @JsonProperty("maximum_value")
    private String maximumValue;
    @JsonProperty("number_precision")
    private Long numberPrecision;
    @JsonProperty("zd_edition_name")
    private String zdEditionName;

    @JsonProperty("zd_sync")
    private String zdSync;
}
