package vhc.smartw.eam.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
@Table(name = "WIP_OPERATION_RESOURCES")
public class WipOperationResources {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "RESOURCE_ID")
    private Long resourceId;
    @Column(name = "RESOURCE_SEQ_NUM", unique = true)
    private Long resourceSeqNum;
    @Column(name = "WIP_ENTITY_ID", unique = true)
    private Long wipEntityId;
    @Column(name = "OPERATION_SEQ_NUM", unique = true)
    private Long operationSeqNum;
    @Column(name = "ORGANIZATION_ID", unique = true)
    private Long organizationId;
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
    @Column(name = "UOM_CODE")
    private String uomCode;
    @Column(name = "BASIS_TYPE")
    private Long basisType;
    @Column(name = "USAGE_RATE_OR_AMOUNT")
    private Long usageRateOrAmount;
    @Column(name = "ACTIVITY_ID")
    private Long activityId;
    @Column(name = "SCHEDULED_FLAG")
    private Long scheduledFlag;
    @Column(name = "ASSIGNED_UNITS")
    private Long assignedUnits;
    @Column(name = "AUTOCHARGE_TYPE")
    private Long autochargeType;
    @Column(name = "STANDARD_RATE_FLAG")
    private Long standardRateFlag;
    @Column(name = "APPLIED_RESOURCE_UNITS")
    private Long appliedResourceUnits;
    @Column(name = "APPLIED_RESOURCE_VALUE")
    private Long appliedResourceValue;
    @Column(name = "START_DATE")
    private Date startDate;
    @Column(name = "COMPLETION_DATE")
    private Date completionDate;
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
    @Column(name = "DEPARTMENT_ID")
    private Long departmentId;
    @Column(name = "SCHEDULE_SEQ_NUM")
    private Long sheduleSeqNum;
    @Column(name = "REPLACEMENT_GROUP_NUM")
    private Long replacementGroupNum;
    @Column(name = "PARENT_RESOURCE_SEQ")
    private Long parentResourceSeq;
    @Column(name = "FIRM_FLAG")
    private Long firmFlag;
    @Column(name = "GROUP_SEQUENCE_ID")
    private Long groupSequenceId;
    @Column(name = "GROUP_SEQUENCE_NUMBER")
    private Long groupSequenceNumber;
    @Column(name = "ACTUAL_START_DATE")
    private Date actualStartDate;
    @Column(name = "ACTUAL_COMPLETION_DATE")
    private Date actualCompletionDate;
}
