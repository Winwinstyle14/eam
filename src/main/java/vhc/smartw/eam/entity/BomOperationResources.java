package vhc.smartw.eam.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vhc.smartw.eam.config.BomOperationResourcesId;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "BOM_OPERATION_RESOURCES")
public class BomOperationResources {
    @EmbeddedId
    private BomOperationResourcesId bomOperationResourcesId;
    @Column(name = "ACTIVITY_ID")
    private Long activityId;
    @Column(name = "STANDARD_RATE_FLAG")
    private Long standardRateFlag;
    @Column(name = "ASSIGNED_UNITS")
    private Long assignedUnits;
    @Column(name = "USAGE_RATE_OR_AMOUNT")
    private Long usageRateOrAmount;
    @Column(name = "USAGE_RATE_OR_AMOUNT_INVERSE")
    private Long usageRateOrAmountInverse;
    @Column(name = "BASIS_TYPE")
    private Long basisType;
    @Column(name = "SCHEDULE_FLAG")
    private Long scheduleFlag;
    @Column(name = "AUTOCHARGE_TYPE")
    private Long autochargeType;
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
