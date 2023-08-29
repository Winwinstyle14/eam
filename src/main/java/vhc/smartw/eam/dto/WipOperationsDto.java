package vhc.smartw.eam.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import vhc.smartw.eam.config.Constants;
import java.util.Date;
import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WipOperationsDto {
    @JsonProperty("ORGANIZATION_ID")
    private Long organizationId;

    @JsonProperty("WIP_ENTITY_ID")
    private Long wipEntityId;

    @JsonProperty("OPERATION_SEQ_NUM")
    private Long operationSeqNum;

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

    @JsonProperty("OPERATION_SEQUENCE_ID")
    private Long operationSequenceId;

    @JsonProperty("STANDARD_OPERATION_ID")
    private Long standardOperationId;

    @JsonProperty("DEPARTMENT_ID")
    private Long departmentId;

    @JsonProperty("DESCRIPTION")
    private String description;

    @JsonProperty("SCHEDULED_QUANTITY")
    private Long scheduledQuantity;

    @JsonProperty("QUANTITY_IN_QUEUE")
    private Long quantityInQueue;

    @JsonProperty("QUANTITY_RUNNING")
    private Long quantityRunning;

    @JsonProperty("QUANTITY_WAITING_TO_MOVE")
    private Long quantityWaitingToMove;

    @JsonProperty("QUANTITY_REJECTED")
    private Long quantityRejected;

    @JsonProperty("QUANTITY_SCRAPPED")
    private Long quantityScrapped;

    @JsonProperty("QUANTITY_COMPLETED")
    private Long quantityCompleted;

    @JsonProperty("FIRST_UNIT_START_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date firstUnitStartDate;

    @JsonProperty("FIRST_UNIT_COMPLETION_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date firstUnitCompletionDate;

    @JsonProperty("LAST_UNIT_START_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date lastUnitStartDate;

    @JsonProperty("LAST_UNIT_COMPLETION_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date lastUnitCompletionDate;

    @JsonProperty("PREVIOUS_OPERATION_SEQ_NUM")
    private Long previousOperationSeqNum;

    @JsonProperty("NEXT_OPERATION_SEQ_NUM")
    private Long nextOperationSeqNum;

    @JsonProperty("COUNT_POINT_TYPE")
    private Long countPointType;

    @JsonProperty("BACKFLUSH_FLAG")
    private Long backflushFlag;

    @JsonProperty("MINIMUM_TRANSFER_QUANTITY")
    private Long minimumTransferQuantity;

    @JsonProperty("DATE_LAST_MOVED")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date dateLastMoved;

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

    @JsonProperty("OPERATION_YIELD")
    private Long operationYield;

    @JsonProperty("OPERATION_YIELD_ENABLED")
    private Long operationYieldEnabled;

    @JsonProperty("PRE_SPLIT_QUANTITY")
    private Long preSplitQuantity;

    @JsonProperty("OPERATION_COMPLETED")
    private String operationCompleted;

    @JsonProperty("SHUTDOWN_TYPE")
    private String shutdownType;

    @JsonProperty("MATERIAL")
    private List<WipRequirementOperationsDto> wipRequirementOperations;

    @JsonProperty("RESOURCE")
    private List<WipOperationResourcesDto>wipOperationResources;
}
