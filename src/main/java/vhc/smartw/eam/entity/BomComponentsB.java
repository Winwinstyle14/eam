package vhc.smartw.eam.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vhc.smartw.eam.config.BomComponentsBId;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "BOM_COMPONENTS_B")
public class BomComponentsB {
    @EmbeddedId
    private BomComponentsBId bomComponentsBId;
    @Column(name = "COMPONENT_SEQUENCE_ID")
    private Long componentSequenceId;
    @Column(name = "COMPONENT_ITEM_ID")
    private Long componentItemId;
    @Column(name = "ITEM_NUM")
    private Long itemNum;
    @Column(name = "COMPONENT_QUANTITY")
    private Long componentQuantity;
    @Column(name = "REVISED_ITEM_SEQUENCE_ID")
    private Long revisedItemSequenceId;
    @Column(name = "BASIS_TYPE")
    private Long basisType;
    @Column(name = "COMPONENT_YIELD_FACTOR")
    private Long componentYieldFactor;
    @Column(name = "EFFECTIVITY_DATE")
    private Date effectivityDate;
    @Column(name = "DISABLE_DATE")
    private Date disableDate;
    @Column(name = "PLANNING_FACTOR")
    private Long planningFactor;
    @Column(name = "QUANTITY_RELATED")
    private Long quantityRelated;
    @Column(name = "INCLUDE_IN_COST_ROLLUP")
    private Long includeInCostRollup;
    @Column(name = "CHECK_ATP")
    private Long checkAtp;
    @Column(name = "WIP_SUPPLY_TYPE")
    private Long wipSupplyType;
    @Column(name = "SUPPLY_SUBINVENTORY")
    private String supplySubinventory;
    @Column(name = "SUPPLY_LOCATOR_ID")
    private Long supplyLocatorId;
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
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "CREATION_DATE")
    private Date creationDate;
}
