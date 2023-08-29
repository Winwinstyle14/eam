package vhc.smartw.eam.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import lombok.*;
import vhc.smartw.eam.config.Constants;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EamWorkOrderDetailsDto {
    @JsonProperty("ID")
    private Long id;

    @JsonProperty("WIP_ENTITY_ID")
    private Long wipEntityId;

    @JsonProperty("ORGANIZATION_ID")
    private Long organizationId;

    @JsonProperty("USER_DEFINED_STATUS_ID")
    private Integer userDefinedStatusId;

    @JsonProperty("PENDING_FLAG")
    private String pendingFlag;

    @JsonProperty("MATERIAL_SHORTAGE_CHECK_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date materialShortageCheckDate;

    @JsonProperty("MATERIAL_SHORTAGE_FLAG")
    private Long materialShortageFlag;

    @JsonProperty("WORKFLOW_TYPE")
    private Long workflowType;

    @JsonProperty("WARRANTY_CLAIM_STATUS")
    private Long warrantyClaimStatus;

    @JsonProperty("CYCLE_ID")
    private Long cycleId;

    @JsonProperty("SEQ_ID")
    private Long seqId;

    @JsonProperty("DS_SCHEDULED_FLAG")
    private String dsScheduledFlag;

    @JsonProperty("ASSIGNMENT_COMPLETE")
    private String assignmentComplete;

    @JsonProperty("WARRANTY_ACTIVE")
    private Long warrantyActive;

    @JsonProperty("PM_SUGGESTED_START_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date pmSuggestedStartDate;

    @JsonProperty("PM_SUGGESTED_END_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date pmSuggestedEndDate;

    @JsonProperty("PM_BASE_METER_READING")
    private Long pmBaseMeterReading;

    @JsonProperty("PM_BASE_METER")
    private Long pmBaseMeter;

    @JsonProperty("FAILURE_CODE_REQUIRED")
    private String failureCodeRequired;

    @JsonProperty("ESTIMATE_ID")
    private Long estimateId;

    @JsonProperty("PLANNER_MAINTENANCE")
    private Long plannerMaintenance;

    @JsonProperty("ROUTE_UPDATE_WO_FLAG")
    private String routeUpdateWoFlag;

    @JsonProperty("COST_UPDATE_WO_FLAG")
    private String costUpdateWoFlag;

    @JsonProperty("ROUTE_COST_EQUAL_FLAG")
    private String RouteCostEqualFlag;

    @JsonProperty("ROUTE_MODIFIED_WO_FLAG")
    private String routeModifiedWoFlag;

    @JsonProperty("ROUTE_QUALITY_RESULT_FLAG")
    private String routeQualityResultFlag;

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
}