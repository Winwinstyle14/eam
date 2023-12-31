package vhc.smartw.eam.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vhc.smartw.eam.config.BomResourcesId;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "BOM_RESOURCES")
public class BomResources {
    @EmbeddedId
    private BomResourcesId bomResourcesId;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "DISABLE_DATE")
    private Date disableDate;
    @Column(name = "COST_ELEMENT_ID")
    private Long costElementId;
    @Column(name = "PURCHASE_ITEM_ID")
    private Long purchaseItemId;
    @Column(name = "RESOURCE_TYPE")
    private Long resourceType;
    @Column(name = "FUNCTIONAL_CURRENCY_FLAG")
    private Long functionalCurrencyFlag;
    @Column(name = "EXPENDITURE_TYPE")
    private String expenditureType;
    @Column(name = "SUPPLY_SUBINVENTORY")
    private String supplySubinventory;
    @Column(name = "SUPPLY_LOCATOR_ID")
    private Long supplyLocatorId;
    @Column(name = "UNIT_OF_MEASURE")
    private String unitOfMeasure;
    @Column(name = "DEFAULT_ACTIVITY_ID")
    private Long defaultActivityId;
    @Column(name = "AUTOCHARGE_TYPE")
    private Long autochargeType;
    @Column(name = "DEFAULT_BASIS_TYPE")
    private Long defaultBasisType;
    @Column(name = "ALLOW_COSTS_FLAG")
    private Long allowCostsFlag;
    @Column(name = "COMPETENCE_ID")
    private Long competenceId;
    @Column(name = "RATING_LEVEL_ID")
    private Long ratingLevelId;
    @Column(name = "QUALIFICATION_TYPE_ID")
    private Long qualificationTypeId;
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
