package vhc.smartw.eam.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import vhc.smartw.eam.config.BomComponentsBId;
import vhc.smartw.eam.config.Constants;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BomComponentsBDto {
    @NotNull
    @JsonProperty("bom_components_b_id")
    private BomComponentsBId bomComponentsBId;
    @NotNull
    @JsonProperty("component_sequence_id")
    private Long componentSequenceId;
    @JsonProperty("component_item_id")
    private Long componentItemId;
    @JsonProperty("item_num")
    private Long itemNum;
    @NotNull
    @JsonProperty("component_quantity")
    private Long componentQuantity;
    @JsonProperty("revised_item_sequence_id")
    private Long revisedItemSequenceId;
    @JsonProperty("basis_type")
    private Long basisType;
    @NotNull
    @JsonProperty("component_yield_factor")
    private Long componentYieldFactor;
    @NotNull
    @JsonProperty("effectivity_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date effectivityDate;
    @JsonProperty("disable_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date disableDate;
    @NotNull
    @JsonProperty("planning_factor")
    private Long planningFactor;
    @NotNull
    @JsonProperty("quantity_related")
    private Long quantityRelated;
    @NotNull
    @JsonProperty("include_in_cost_rollup")
    private Long includeInCostRollup;
    @NotNull
    @JsonProperty("check_atp")
    private Long checkAtp;
    @JsonProperty("wip_supply_type")
    private Long wipSupplyType;
    @JsonProperty("supply_subinventory")
    private String supplySubinventory;
    @JsonProperty("supply_locator_id")
    private Long supplyLocatorId;
    @JsonProperty("attribute_category")
    private String attributeCategory;
    @JsonProperty("attribute1")
    private String attribute1;
    @JsonProperty("attribute2")
    private String attribute2;
    @JsonProperty("attribute3")
    private String attribute3;
    @JsonProperty("attribute4")
    private String attribute4;
    @JsonProperty("attribute5")
    private String attribute5;
    @JsonProperty("attribute6")
    private String attribute6;
    @JsonProperty("attribute7")
    private String attribute7;
    @JsonProperty("attribute8")
    private String attribute8;
    @JsonProperty("attribute9")
    private String attribute9;
    @JsonProperty("attribute10")
    private String attribute10;
    @JsonProperty("attribute11")
    private String attribute11;
    @JsonProperty("attribute12")
    private String attribute12;
    @JsonProperty("attribute13")
    private String attribute13;
    @JsonProperty("attribute14")
    private String attribute14;
    @JsonProperty("attribute15")
    private String attribute15;
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


    public BomComponentsBId getBomComponentsBId() {
        return bomComponentsBId;
    }

    public Long getComponentSequenceId() {
        return componentSequenceId;
    }

    public Long getComponentItemId() {
        return componentItemId;
    }

    public Long getItemNum() {
        return itemNum;
    }

    public Long getComponentQuantity() {
        return componentQuantity;
    }

    public Long getRevisedItemSequenceId() {
        return revisedItemSequenceId;
    }

    public Long getBasisType() {
        return basisType;
    }

    public Long getComponentYieldFactor() {
        return componentYieldFactor;
    }

    public Date getEffectivityDate() {
        return effectivityDate;
    }

    public Date getDisableDate() {
        return disableDate;
    }

    public Long getPlanningFactor() {
        return planningFactor;
    }

    public Long getQuantityRelated() {
        return quantityRelated;
    }

    public Long getIncludeInCostRollup() {
        return includeInCostRollup;
    }

    public Long getCheckAtp() {
        return checkAtp;
    }

    public Long getWipSupplyType() {
        return wipSupplyType;
    }

    public String getSupplySubinventory() {
        return supplySubinventory;
    }

    public Long getSupplyLocatorId() {
        return supplyLocatorId;
    }

    public String getAttributeCategory() {
        return attributeCategory;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public String getAttribute4() {
        return attribute4;
    }

    public String getAttribute5() {
        return attribute5;
    }

    public String getAttribute6() {
        return attribute6;
    }

    public String getAttribute7() {
        return attribute7;
    }

    public String getAttribute8() {
        return attribute8;
    }

    public String getAttribute9() {
        return attribute9;
    }

    public String getAttribute10() {
        return attribute10;
    }

    public String getAttribute11() {
        return attribute11;
    }

    public String getAttribute12() {
        return attribute12;
    }

    public String getAttribute13() {
        return attribute13;
    }

    public String getAttribute14() {
        return attribute14;
    }

    public String getAttribute15() {
        return attribute15;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }
}
