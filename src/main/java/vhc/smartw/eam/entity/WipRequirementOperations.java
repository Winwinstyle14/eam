package vhc.smartw.eam.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "WIP_REQUIREMENT_OPERATIONS")
public class WipRequirementOperations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "INVENTORY_ITEM_ID", unique = true)
    private Long inventoryItemId;
    @Column(name = "ORGANIZATION_ID", unique = true)
    private Long organizationId;
    @Column(name = "WIP_ENTITY_ID", unique = true)
    private Long wipEntityId;
    @Column(name = "OPERATION_SEQ_NUM", unique = true)
    private Long operationSeqNum;
    @Column(name = "REPETITIVE_SCHEDULE_ID", unique = true)
    private Long repetitiveScheduleId;
    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "CREATION_DATE")
    private Date creationDate;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "COMPONENT_SEQUENCE_ID")
    private Long componentSequenceId;
    @Column(name = "DEPARTMENT_ID")
    private Long departmentId;
    @Column(name = "WIP_SUPPLY_TYPE")
    private Long wipSupplyType;
    @Column(name = "DATE_REQUIRED")
    private Date dateRequired;
    @Column(name = "REQUIRED_QUANTITY")
    private Long requiredQuantity;
    @Column(name = "QUANTITY_ISSUED")
    private Long quantityIssued;
    @Column(name = "QUANTITY_PER_ASSEMBLY")
    private Long quantityPerAssembly;
    @Column(name = "COMMENTS")
    private String comments;
    @Column(name = "SUPPLY_SUBINVENTORY")
    private String supplySubinventory;
    @Column(name = "SUPPLY_LOCATOR_ID")
    private Long supplyLocatorId;
    @Column(name = "MRP_NET_FLAG")
    private Long mrpNetFlag;
    @Column(name = "MPS_REQUIRED_QUANTITY")
    private Long mpsRequiredQuantity;
    @Column(name = "MPS_DATE_REQUIRED")
    private Date mpsDateRequired;
    @Column(name = "ATTRIBUTE_CATEGORY")
    private String attributeCategory;
    @Column(name = "ATTRIBUTE1")
    private String attribute1;
    @Column(name = "ATTRIBUTE2")
    private String attribute2;
    @Column(name = "ATTRIBUTE3")
    private String attribute3;
    @Column(name = "ATTRIBUTE4")
    private String attribute4;
    @Column(name = "ATTRIBUTE5")
    private String attribute5;
    @Column(name = "ATTRIBUTE6")
    private String attribute6;
    @Column(name = "ATTRIBUTE7")
    private String attribute7;
    @Column(name = "ATTRIBUTE8")
    private String attribute8;
    @Column(name = "ATTRIBUTE9")
    private String attribute9;
    @Column(name = "ATTRIBUTE10")
    private String attribute10;
    @Column(name = "ATTRIBUTE11")
    private String attribute11;
    @Column(name = "ATTRIBUTE12")
    private String attribute12;
    @Column(name = "ATTRIBUTE13")
    private String attribute13;
    @Column(name = "ATTRIBUTE14")
    private String attribute14;
    @Column(name = "ATTRIBUTE15")
    private String attribute15;
    @Column(name = "QUANTITY_ALLOCATED")
    private Long quantityAllocated;
    @Column(name = "QUANTITY_BACKORDERED")
    private Long quantityBackordered;
    @Column(name = "QUANTITY_RELIEVED")
    private Long quantityRelieved;
    @Column(name = "RELEASED_QUANTITY")
    private Long releasedQuantity;
}
