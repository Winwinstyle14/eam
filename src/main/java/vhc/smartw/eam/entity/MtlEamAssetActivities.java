package vhc.smartw.eam.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vhc.smartw.eam.config.MtlEamAssetActivitiesId;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "MTL_EAM_ASSET_ACTIVITIES")
public class MtlEamAssetActivities {
    @EmbeddedId
    private MtlEamAssetActivitiesId mtlEamAssetActivitiesId;
    @Column(name = "PRIORITY_CODE")
    private String priorityCode;
    @Column(name = "START_DATE_ACTIVE")
    private Date startDateActive;
    @Column(name = "END_DATE_ACTIVE")
    private Date endDateActive;
    @Column(name = "ACTIVITY_CAUSE_CODE")
    private String activityCauseCode;
    @Column(name = "ACTIVITY_TYPE_CODE")
    private String activityTypeCode;
    @Column(name = "INVENTORY_ITEM_ID")
    private Long inventoryItemId;
    @Column(name = "SERIAL_NUMBER")
    private String serialNumber;
    @Column(name = "TAGGING_REQUIRED_FLAG")
    private String taggingRequiredFlag;
    @Column(name = "SHUTDOWN_TYPE_CODE")
    private String shutdownTypeCode;
    @Column(name = "CLASS_CODE")
    private String classCode;
    @Column(name = "WIP_ENTITY_ID")
    private Long wipEntityId;
    @Column(name = "ACTIVITY_SOURCE_CODE")
    private String activitySourceCode;
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
    @Column(name = "LAST_SERVICE_START_DATE")
    private Date lastServiceStartDate;
    @Column(name = "LAST_SERVICE_END_DATE")
    private Date lastServiceEndDate;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "CREATION_DATE")
    private Date creationDate;
}
