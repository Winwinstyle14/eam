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
public class WipRequirementOperationsDto {
    @NotNull
    @JsonProperty("INVENTORY_ITEM_ID")
    private Long inventoryItemId;
    @NotNull
    @JsonProperty("ORGANIZATION_ID")
    private Long organizationId;
    @NotNull
    @JsonProperty("WIP_ENTITY_ID")
    private Long wipEntityId;
    @NotNull
    @JsonProperty("OPERATION_SEQ_NUM")
    private Long operationSeqNum;
    @JsonProperty("REPETITIVE_SCHEDULE_ID")
    private Long repetitiveScheduleId;
    @JsonProperty("LAST_UPDATE_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date lastUpdateDate;
    @JsonProperty("LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @JsonProperty("CREATION_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date creationDate;
    @JsonProperty("CREATED_BY")
    private String createdBy;
    @JsonProperty("COMPONENT_SEQUENCE_ID")
    private Long componentSequenceId;
    @JsonProperty("DEPARTMENT_ID")
    private Long departmentId;
    @NotNull
    @JsonProperty("WIP_SUPPLY_TYPE")
    private Long wipSupplyType;
    @JsonProperty("DATE_REQUIRED")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date dateRequired;
    @NotNull
    @JsonProperty("REQUIRED_QUANTITY")
    private Long requiredQuantity;
    @NotNull
    @JsonProperty("QUANTITY_ISSUED")
    private Long quantityIssued;
    @NotNull
    @JsonProperty("QUANTITY_PER_ASSEMBLY")
    private Long quantityPerAssembly;
    @JsonProperty("COMMENTS")
    private String comments;
    @JsonProperty("SUPPLY_SUBINVENTORY")
    private String supplySubinventory;
    @JsonProperty("SUPPLY_LOCATOR_ID")
    private Long supplyLocatorId;
    @NotNull
    @JsonProperty("MRP_NET_FLAG")
    private Long mrpNetFlag;
    @JsonProperty("MPS_REQUIRED_QUANTITY")
    private Long mpsRequiredQuantity;
    @JsonProperty("MPS_DATE_REQUIRED")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date mpsDateRequired;
    @JsonProperty("ATTRIBUTE_CATEGORY")
    private String attributeCategory;
    @JsonProperty("ATTRIBUTE1")
    private String attribute1;
    @JsonProperty("ATTRIBUTE2")
    private String attribute2;
    @JsonProperty("ATTRIBUTE3")
    private String attribute3;
    @JsonProperty("ATTRIBUTE4")
    private String attribute4;
    @JsonProperty("ATTRIBUTE5")
    private String attribute5;
    @JsonProperty("ATTRIBUTE6")
    private String attribute6;
    @JsonProperty("ATTRIBUTE7")
    private String attribute7;
    @JsonProperty("ATTRIBUTE8")
    private String attribute8;
    @JsonProperty("ATTRIBUTE9")
    private String attribute9;
    @JsonProperty("ATTRIBUTE10")
    private String attribute10;
    @JsonProperty("ATTRIBUTE11")
    private String attribute11;
    @JsonProperty("ATTRIBUTE12")
    private String attribute12;
    @JsonProperty("ATTRIBUTE13")
    private String attribute13;
    @JsonProperty("ATTRIBUTE14")
    private String attribute14;
    @JsonProperty("ATTRIBUTE15")
    private String attribute15;
    @JsonProperty("QUANTITY_ALLOCATED")
    private Long quantityAllocated;
    @JsonProperty("QUANTITY_BACKORDERED")
    private Long quantityBackordered;
    @JsonProperty("QUANTITY_RELIEVED")
    private Long quantityRelieved;
    @JsonProperty("RELEASED_QUANTITY")
    private Long releasedQuantity;
}
