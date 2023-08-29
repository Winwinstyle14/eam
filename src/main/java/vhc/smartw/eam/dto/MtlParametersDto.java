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
public class MtlParametersDto {
    @NotNull
    @JsonProperty("organization_id")
    private Long organizationId;
    @NotNull
    @JsonProperty("organization_code")
    private String organizationCode;
    @NotNull
    @JsonProperty("organization_name")
    private String organizationName;
    @NotNull
    @JsonProperty("stock_Locator_control_code")
    private Long stockLocatorControlCode;
    @JsonProperty("eam_enabled_flag")
    private String eamEnabledFlag;
    @NotNull
    @JsonProperty("organization_ou_id")
    private Long organizationOuId;
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
