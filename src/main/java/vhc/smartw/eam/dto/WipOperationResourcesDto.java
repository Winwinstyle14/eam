package vhc.smartw.eam.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import lombok.*;
import vhc.smartw.eam.config.Constants;


import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WipOperationResourcesDto {
    @JsonProperty("RESOURCE_ID")
    private Long resourceId;
    @JsonProperty("RESOURCE_SEQ_NUM")
    private Long resourceSeqNum;
    @JsonProperty("WIP_ENTITY_ID")
    private Long wipEntityId;
    @JsonProperty("OPERATION_SEQ_NUM")
    private Long operationSeqNum;
    @JsonProperty("ORGANIZATION_ID")
    private Long organizationId;
    @JsonProperty("REPETITIVE_SCHEDULE_ID")
    private Long repetitiveScheduleId;
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
    @JsonProperty("UOM_CODE")
    private String uomCode;
    @JsonProperty("BASIS_TYPE")
    private Long basisType;
    @JsonProperty("USAGE_RATE_OR_AMOUNT")
    private Long usageRateOrAmount;
    @JsonProperty("ACTIVITY_ID")
    private Long activityId;
    @JsonProperty("SCHEDULED_FLAG")
    private Long scheduledFlag;
    @JsonProperty("ASSIGNED_UNITS")
    private Long assignedUnits;
    @JsonProperty("AUTOCHARGE_TYPE")
    private Long autochargeType;
    @JsonProperty("STANDARD_RATE_FLAG")
    private Long standardRateFlag;
    @JsonProperty("APPLIED_RESOURCE_UNITS")
    private Long appliedResourceUnits;
    @JsonProperty("APPLIED_RESOURCE_VALUE")
    private Long appliedResourceValue;
    @JsonProperty("START_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date startDate;
    @JsonProperty("COMPLETION_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date completionDate;
    @JsonProperty("ATTRIBUTE_CATEGORY")
    private String attributeCategory;
    @JsonProperty("ATTRIBUTE1")
    private String attribute1;
    @JsonProperty("ATTRIBUTE2")
    private String attribute2;
    @JsonProperty("ATTRIBUTE3")
    private String attribute3;
    @JsonProperty("ATTRIBUTE4")
    private String attribute4;
    @JsonProperty("ATTRIBUTE5")
    private String attribute5;
    @JsonProperty("ATTRIBUTE6")
    private String attribute6;
    @JsonProperty("ATTRIBUTE7")
    private String attribute7;
    @JsonProperty("ATTRIBUTE8")
    private String attribute8;
    @JsonProperty("ATTRIBUTE9")
    private String attribute9;
    @JsonProperty("ATTRIBUTE10")
    private String attribute10;
    @JsonProperty("ATTRIBUTE11")
    private String attribute11;
    @JsonProperty("ATTRIBUTE12")
    private String attribute12;
    @JsonProperty("ATTRIBUTE13")
    private String attribute13;
    @JsonProperty("ATTRIBUTE14")
    private String attribute14;
    @JsonProperty("ATTRIBUTE15")
    private String attribute15;
    @JsonProperty("DEPARTMENT_ID")
    private Long departmentId;
    @JsonProperty("SCHEDULE_SEQ_NUM")
    private Long sheduleSeqNum;
    @JsonProperty("REPLACEMENT_GROUP_NUM")
    private Long replacementGroupNum;
    @JsonProperty("PARENT_RESOURCE_SEQ")
    private Long parentResourceSeq;
    @JsonProperty("FIRM_FLAG")
    private Long firmFlag;
    @JsonProperty("GROUP_SEQUENCE_ID")
    private Long groupSequenceId;
    @JsonProperty("GROUP_SEQUENCE_NUMBER")
    private Long groupSequenceNumber;
    @JsonProperty("ACTUAL_START_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date actualStartDate;
    @JsonProperty("ACTUAL_COMPLETION_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date actualCompletionDate;
    @JsonProperty("WIP_OP_RESOURCE_INSTANCES")
    private WipOpResourceInstancesDto wipOpResourceInstancesDto;
}
