package vhc.smartw.eam.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
@Table(name = "WIP_DISCRETE_JOBS")
public class WipDiscreteJobs {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ORGANIZATION_ID")
    private Long organizationId;

    @Column(name = "WIP_ENTITY_ID")
    private Long wipEntityId;

    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;

    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;

    @Column(name = "CREATION_DATE")
    private Date creationDate;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "SOURCE_LINE_ID")
    private Long sourceLineId;

    @Column(name = "SOURCE_CODE")
    private String sourceCode;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "STATUS_TYPE")
    private Long statusType;

    @Column(name = "PRIMARY_ITEM_ID")
    private Long primaryItemId;

    @Column(name = "FIRM_PLANNED_FLAG")
    private Long firmPlannedFlag;

    @Column(name = "JOB_TYPE")
    private Long jobType;

    @Column(name = "WIP_SUPPLY_TYPE")
    private Long wipSupplyType;

    @Column(name = "CLASS_CODE")
    private String classCode;

    @Column(name = "SCHEDULED_START_DATE")
    private Date scheduledStartDate;

    @Column(name = "DATE_RELEASED")
    private Date dateReleased;

    @Column(name = "SCHEDULED_COMPLETION_DATE")
    private Date scheduledCompletionDate;

    @Column(name = "DATE_COMPLETED")
    private Date dateCompleted;

    @Column(name = "DATE_CLOSED")
    private Date dateClosed;

    @Column(name = "START_QUANTITY")
    private Long startQuantity;

    @Column(name = "QUANTITY_COMPLETED")
    private Long quantityCompleted;

    @Column(name = "QUANTITY_SCRAPPED")
    private Long quantityScrapped;

    @Column(name = "NET_QUANTITY")
    private Long netQuantity;

    @Column(name = "LOT_NUMBER")
    private String lotNumber;

    @Column(name = "COMPLETION_SUBINVENTORY")
    private String completionSubinventory;

    @Column(name = "COMPLETION_LOCATOR_ID")
    private Long completionLocatorId;

    @Column(name = "MPS_SCHEDULED_COMPLETION_DATE")
    private Date mpsScheduledCompletionDate;

    @Column(name = "MPS_NET_QUANTITY")
    private Long mpsNetQuantity;

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

    @Column(name = "PO_CREATION_TIME")
    private Long poCreationTime;

    @Column(name = "PRIORITY")
    private Long priority;

    @Column(name = "DUE_DATE")
    private Date dueDate;

    @Column(name = "PARENT_WIP_ENTITY_ID")
    private Long parentWipEntityId;

    @Column(name = "ASSET_NUMBER")
    private String assetNumber;

    @Column(name = "ASSET_GROUP_ID")
    private Long assetGroupId;

    @Column(name = "REBUILD_ITEM_ID")
    private Long rebuildItemId;

    @Column(name = "REBUILD_SERIAL_NUMBER")
    private String rebuildSerialNumber;

    @Column(name = "MANUAL_REBUILD_FLAG")
    private String manualRebuildFlag;

    @Column(name = "SHUTDOWN_TYPE")
    private String shutdownType;

    @Column(name = "ESTIMATION_STATUS")
    private Long estimationStatus;

    @Column(name = "REQUESTED_START_DATE")
    private Date requestedStartDate;

    @Column(name = "NOTIFICATION_REQUIRED")
    private String notificationRequired;

    @Column(name = "WORK_ORDER_TYPE")
    private String workOrderType;

    @Column(name = "OWNING_DEPARTMENT")
    private Long owningDepartment;

    @Column(name = "ACTIVITY_TYPE")
    private String activityType;

    @Column(name = "ACTIVITY_CAUSE")
    private String activityCause;

    @Column(name = "TAGOUT_REQUIRED")
    private String tagoutRequired;

    @Column(name = "PLAN_MAINTENANCE")
    private String planMaintenance;

    @Column(name = "PM_SCHEDULE_ID")
    private Long pmScheduleId;

    @Column(name = "LAST_ESTIMATION_DATE")
    private Date lastEstimationDate;

    @Column(name = "LAST_ESTIMATION_REQ_ID")
    private Long lastEstimationReqId;

    @Column(name = "ACTIVITY_SOURCE")
    private String activitySource;

    @Column(name = "MAINTENANCE_OBJECT_ID")
    private Long maintenanceObjectId;

    @Column(name = "MAINTENANCE_OBJECT_TYPE")
    private Long maintenanceObjectType;

    @Column(name = "MAINTENANCE_OBJECT_SOURCE")
    private Long maintenanceObjectSource;

    @Column(name = "MATERIAL_ISSUE_BY_MO")
    private String materialIssueByMo;

    @Column(name = "SCHEDULING_REQUEST_ID")
    private Long schedulingRequestId;

    @Column(name = "ISSUE_ZERO_COST_FLAG")
    private String issueZeroCostFlag;

    @Column(name = "EAM_LINEAR_LOCATION_ID")
    private Long eamLinearLocationId;

    @Column(name = "ACTUAL_START_DATE")
    private Date actualStartDate;

    @Column(name = "EXPECTED_HOLD_RELEASE_DATE")
    private Date expectedHoldReleaseDate;

    @Column(name = "EXPEDITED")
    private String expedited;

    @Column(name = "JOB_NOTE")
    @Lob
    private String jobNote;

    @Column(name = "INSTANCE_NUMBER")
    private String instanceNumer;

    /*@OneToOne
    @JoinColumn(name = "WIP_ENTITY_ID", insertable = false, updatable = false)
    private WipEntities wipEntities;*/
}