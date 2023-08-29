package vhc.smartw.eam.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import vhc.smartw.eam.config.Constants;
import vhc.smartw.eam.config.MtlEamAssetAttrGroupsVId;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MtlEamAssetAttrGroupsVDto {
    @NotNull
    @JsonProperty("mtl_eam_asset_attr_groups_v_id")
    private MtlEamAssetAttrGroupsVId mtlEamAssetAttrGroupsVId;
    @NotNull
    @JsonProperty("inventory_item_id")
    private Long inventoryItemId;
    @JsonProperty("descriptive_flex_context_name")
    private String descriptiveFlexContextName;
    @JsonProperty("description")
    private String description;
    @JsonProperty("enabled_flag")
    private String enabledFlag;
    @JsonProperty("organization_id")
    private Long organizationId;
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
