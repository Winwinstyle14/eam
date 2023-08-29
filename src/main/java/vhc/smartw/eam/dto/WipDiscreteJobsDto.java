package vhc.smartw.eam.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Lob;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import vhc.smartw.eam.config.Constants;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WipDiscreteJobsDto {
    @NotNull
    @JsonProperty("ORGANIZATION_ID")
    private Long organizationId;

    @NotNull
    @JsonProperty( "WIP_ENTITY_ID")
    private Long wipEntityId;

    @JsonProperty( "LAST_UPDATE_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date lastUpdateDate;

    @JsonProperty( "LAST_UPDATED_BY")
    private String lastUpdatedBy;

    @JsonProperty( "CREATION_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date creationDate;

    @JsonProperty( "CREATED_BY")
    private String createdBy;

    @JsonProperty( "SOURCE_LINE_ID")
    private Long sourceLineId;

    @JsonProperty( "SOURCE_CODE")
    private String sourceCode;

    @JsonProperty( "DESCRIPTION")
    private String description;

    @JsonProperty( "STATUS_TYPE")
    private Long statusType;

    @JsonProperty( "PRIMARY_ITEM_ID")
    private Long primaryItemId;

    @JsonProperty( "FIRM_PLANNED_FLAG")
    private Long firmPlannedFlag;

    @JsonProperty( "JOB_TYPE")
    private Long jobType;

    @JsonProperty( "WIP_SUPPLY_TYPE")
    private Long wipSupplyType;

    @JsonProperty( "CLASS_CODE")
    private String classCode;

    @JsonProperty( "SCHEDULED_START_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date scheduledStartDate;

    @JsonProperty( "DATE_RELEASED")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date dateReleased;

    @JsonProperty( "SCHEDULED_COMPLETION_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date scheduledCompletionDate;

    @JsonProperty( "DATE_COMPLETED")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date dateCompleted;

    @JsonProperty( "DATE_CLOSED")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date dateClosed;

    @JsonProperty( "START_QUANTITY")
    private Long startQuantity;

    @JsonProperty( "QUANTITY_COMPLETED")
    private Long quantityCompleted;

    @JsonProperty( "QUANTITY_SCRAPPED")
    private Long quantityScrapped;

    @JsonProperty( "NET_QUANTITY")
    private Long netQuantity;

    @JsonProperty( "LOT_NUMBER")
    private String lotNumber;

    @JsonProperty( "COMPLETION_SUBINVENTORY")
    private String completionSubinventory;

    @JsonProperty( "COMPLETION_LOCATOR_ID")
    private Long completionLocatorId;

    @JsonProperty( "MPS_SCHEDULED_COMPLETION_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date mpsScheduledCompletionDate;

    @JsonProperty( "MPS_NET_QUANTITY")
    private Long mpsNetQuantity;

    @JsonProperty( "ATTRIBUTE_CATEGORY")
    private String attributeCategory;

    @JsonProperty( "ATTRIBUTE1")
    private String attribute1;

    @JsonProperty( "ATTRIBUTE2")
    private String attribute2;

    @JsonProperty( "ATTRIBUTE3")
    private String attribute3;

    @JsonProperty( "ATTRIBUTE4")
    private String attribute4;

    @JsonProperty( "ATTRIBUTE5")
    private String attribute5;

    @JsonProperty( "ATTRIBUTE6")
    private String attribute6;

    @JsonProperty( "ATTRIBUTE7")
    private String attribute7;

    @JsonProperty( "ATTRIBUTE8")
    private String attribute8;

    @JsonProperty( "ATTRIBUTE9")
    private String attribute9;

    @JsonProperty( "ATTRIBUTE10")
    private String attribute10;

    @JsonProperty( "ATTRIBUTE11")
    private String attribute11;

    @JsonProperty( "ATTRIBUTE12")
    private String attribute12;

    @JsonProperty( "ATTRIBUTE13")
    private String attribute13;

    @JsonProperty( "ATTRIBUTE14")
    private String attribute14;

    @JsonProperty( "ATTRIBUTE15")
    private String attribute15;

    @JsonProperty( "PO_CREATION_TIME")
    private Long poCreationTime;

    @JsonProperty( "PRIORITY")
    private Long priority;

    @JsonProperty( "DUE_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date dueDate;

    @JsonProperty( "PARENT_WIP_ENTITY_ID")
    private Long parentWipEntityId;

    @JsonProperty( "ASSET_NUMBER")
    private String assetNumber;

    @JsonProperty( "ASSET_GROUP_ID")
    private Long assetGroupId;

    @JsonProperty( "REBUILD_ITEM_ID")
    private Long rebuildItemId;

    @JsonProperty( "REBUILD_SERIAL_NUMBER")
    private String rebuildSerialNumber;

    @JsonProperty( "MANUAL_REBUILD_FLAG")
    private String manualRebuildFlag;

    @JsonProperty( "SHUTDOWN_TYPE")
    private String shutdownType;

    @JsonProperty( "ESTIMATION_STATUS")
    private Long estimationStatus;

    @JsonProperty( "REQUESTED_START_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date requestedStartDate;

    @JsonProperty( "NOTIFICATION_REQUIRED")
    private String notificationRequired;

    @JsonProperty( "WORK_ORDER_TYPE")
    private String workOrderType;

    @JsonProperty( "OWNING_DEPARTMENT")
    private Long owningDepartment;

    @JsonProperty( "ACTIVITY_TYPE")
    private String activityType;

    @JsonProperty( "ACTIVITY_CAUSE")
    private String activityCause;

    @JsonProperty( "TAGOUT_REQUIRED")
    private String tagoutRequired;

    @JsonProperty( "PLAN_MAINTENANCE")
    private String planMaintenance;

    @JsonProperty( "PM_SCHEDULE_ID")
    private Long pmScheduleId;

    @JsonProperty( "LAST_ESTIMATION_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date lastEstimationDate;

    @JsonProperty( "LAST_ESTIMATION_REQ_ID")
    private Long lastEstimationReqId;

    @JsonProperty( "ACTIVITY_SOURCE")
    private String activitySource;

    @JsonProperty( "MAINTENANCE_OBJECT_ID")
    private Long maintenanceObjectId;

    @JsonProperty( "MAINTENANCE_OBJECT_TYPE")
    private Long maintenanceObjectType;

    @JsonProperty( "MAINTENANCE_OBJECT_SOURCE")
    private Long maintenanceObjectSource;

    @JsonProperty( "MATERIAL_ISSUE_BY_MO")
    private String materialIssueByMo;

    @JsonProperty( "SCHEDULING_REQUEST_ID")
    private Long schedulingRequestId;

    @JsonProperty( "ISSUE_ZERO_COST_FLAG")
    private String issueZeroCostFlag;

    @JsonProperty( "EAM_LINEAR_LOCATION_ID")
    private Long eamLinearLocationId;

    @JsonProperty( "ACTUAL_START_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date actualStartDate;

    @JsonProperty( "EXPECTED_HOLD_RELEASE_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date expectedHoldReleaseDate;

    @JsonProperty( "EXPEDITED")
    private String expedited;

    @JsonProperty( "JOB_NOTE")
    @Lob
    private String jobNote;

    @JsonProperty( "INSTANCE_NUMBER")
    private String instanceNumber;
}
