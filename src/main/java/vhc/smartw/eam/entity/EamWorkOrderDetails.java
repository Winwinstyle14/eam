package vhc.smartw.eam.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "EAM_WORK_ORDER_DETAILS")
public class EamWorkOrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "WIP_ENTITY_ID", unique = true)
    private Long wipEntityId;

    @Column(name = "ORGANIZATION_ID", unique = true)
    private Long organizationId;

    @Column(name = "USER_DEFINED_STATUS_ID")
    private Integer userDefinedStatusId;

    @Column(name = "PENDING_FLAG")
    private String pendingFlag;

    @Column(name = "MATERIAL_SHORTAGE_CHECK_DATE")
    private Date materialShortageCheckDate;

    @Column(name = "MATERIAL_SHORTAGE_FLAG")
    private Long materialShortageFlag;

    @Column(name = "WORKFLOW_TYPE")
    private Long workflowType;

    @Column(name = "WARRANTY_CLAIM_STATUS")
    private Long warrantyClaimStatus;

    @Column(name = "CYCLE_ID")
    private Long cycleId;

    @Column(name = "SEQ_ID")
    private Long seqId;

    @Column(name = "DS_SCHEDULED_FLAG")
    private String dsScheduledFlag;

    @Column(name = "ASSIGNMENT_COMPLETE")
    private String assignmentComplete;

    @Column(name = "WARRANTY_ACTIVE")
    private Long warrantyActive;

    @Column(name = "PM_SUGGESTED_START_DATE")
    private Date pmSuggestedStartDate;

    @Column(name = "PM_SUGGESTED_END_DATE")
    private Date pmSuggestedEndDate;

    @Column(name = "PM_BASE_METER_READING")
    private Long pmBaseMeterReading;

    @Column(name = "PM_BASE_METER")
    private Long pmBaseMeter;

    @Column(name = "FAILURE_CODE_REQUIRED")
    private String failureCodeRequited;

    @Column(name = "ESTIMATE_ID")
    private Long estimateId;

    @Column(name = "PLANNER_MAINTENANCE")
    private Long plannerMaintenance;

    @Column(name = "ROUTE_UPDATE_WO_FLAG")
    private String routeUpdateWoFlag;

    @Column(name = "COST_UPDATE_WO_FLAG")
    private String costUpdateWoFlag;

    @Column(name = "ROUTE_COST_EQUAL_FLAG")
    private String RouteCostEqualFlag;

    @Column(name = "ROUTE_MODIFIED_WO_FLAG")
    private String routeModifiedWoFlag;

    @Column(name = "ROUTE_QUALITY_RESULT_FLAG")
    private String routeQualityResultFlag;

    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;

    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;

    @Column(name = "CREATION_DATE")
    private Date creationDate;

    @Column(name = "CREATED_BY")
    private String createdBy;
}
