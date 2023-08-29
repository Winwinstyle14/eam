package vhc.smartw.eam.dtoFlat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public class BomComponentsBDtoFlat {
    @NotNull(message = "Operation Seq Num không được để trống")
    @JsonProperty("operation_seq_num")
    private Long operationSeqNum;
    @NotNull(message = "Bill Sequence Id không được để trống")
    @JsonProperty("bill_sequence_id")
    private Long billSequenceId;
    @NotNull(message = "Component Sequence Id không được để trống")
    @JsonProperty("component_sequence_id")
    private Long componentSequenceId;
    @JsonProperty("component_item_id")
    private Long componentItemId;
    @JsonProperty("item_num")
    private Long itemNum;
    @NotNull(message = "Component Quantity không được để trống")
    @JsonProperty("component_quantity")
    private Long componentQuantity;
    @JsonProperty("revised_item_sequence_id")
    private Long revisedItemSequenceId;
    @JsonProperty("basis_type")
    private Long basisType;
    @NotNull(message = "Component Yield Factor không được để trống")
    @JsonProperty("component_yield_factor")
    private Long componentYieldFactor;
    @NotNull(message = "Effectivity Date không được để trống")
    @JsonProperty("effectivity_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date effectivityDate;
    @JsonProperty("disable_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date disableDate;
    @NotNull(message = "Planning Factor không được để trống")
    @JsonProperty("planning_factor")
    private Long planningFactor;
    @NotNull(message = "Quantity Related không được để trống")
    @JsonProperty("quantity_related")
    private Long quantityRelated;
    @NotNull(message = "Include In Cost Rollup không được để trống")
    @JsonProperty("include_in_cost_rollup")
    private Long includeInCostRollup;
    @NotNull(message = "Check Atp không được để trống")
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
}
