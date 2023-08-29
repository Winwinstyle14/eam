package vhc.smartw.eam.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import vhc.smartw.eam.config.Constants;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@ToString
public class WORequestDto {
    @JsonProperty("ORGANIZATION_ID")
    private Long organizationId;

    @JsonProperty("WIP_ENTITY_NAME")
    private String wipEntityName;

    @JsonProperty("DESCRIPTION")
    private String description;

    @JsonProperty( "INSTANCE_NUMBER")
    private String instanceNumber;

    @JsonProperty( "PRIMARY_ITEM_ID")
    private Long primaryItemId;

    @JsonProperty( "SCHEDULED_START_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date scheduledStartDate;

    @JsonProperty( "SCHEDULED_COMPLETION_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date scheduledCompletionDate;

    @JsonProperty( "ACTUAL_START_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date actualStartDate;

    @JsonProperty( "DATE_COMPLETED")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date dateCompleted;

    @JsonProperty( "DEPARTMENT_ID")
    private Long owningDepartment;

    @JsonProperty("FAILURE_CODE")
    private String failureCode;

    @JsonProperty("CAUSE_CODE")
    private String causeCode;

    @JsonProperty("RESOLUTION_CODE")
    private String resolutionCode;

    @JsonProperty("FAILURE_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date failureDate;

    @JsonProperty("OPERATION")
    private List<WORequestDto.WipOperationsDto> wipOperations;
    @Data
    @NoArgsConstructor
    @ToString
    public static class WipOperationsDto{
        @JsonProperty("OPERATION_SEQ_NUM")
        private Long operationSeqNum;

        @JsonProperty("DEPARTMENT_ID")
        private Long departmentId;

        @JsonProperty("STANDARD_OPERATION_ID")
        private Long standardOperationId;

        @JsonProperty("DESCRIPTION")
        private String description;

        @JsonProperty("FIRST_UNIT_START_DATE")
        @JsonFormat(pattern = Constants.DATE_FORMAT)
        private Date firstUnitStartDate;

        @JsonProperty("LAST_UNIT_COMPLETION_DATE")
        @JsonFormat(pattern = Constants.DATE_FORMAT)
        private Date lastUnitCompletionDate;

        @JsonProperty("OPERATION_COMPLETED")
        private String operationCompleted;

        @JsonProperty("MATERIAL")
        private List<WipRequirementOperationsDto> wipRequirementOperations;

        @JsonProperty("RESOURCE")
        private List<WipOperationResourcesDto>wipOperationResources;
    }
    @Data
    @NoArgsConstructor
    @ToString
    public static class WipRequirementOperationsDto{
        @NotNull
        @JsonProperty("INVENTORY_ITEM_ID")
        private Long inventoryItemId;

        @NotNull
        @JsonProperty("DATE_REQUIRED")
        @JsonFormat(pattern = Constants.DATE_FORMAT)
        private Date dateRequired;

        @NotNull
        @JsonProperty("REQUIRED_QUANTITY")
        private Long requiredQuantity;
    }
    @Data
    @NoArgsConstructor
    @ToString
    public static class WipOperationResourcesDto{
        @JsonProperty("RESOURCE_SEQ_NUM")
        private Long resourceSeqNum;

        @JsonProperty("RESOURCE_ID")
        private Long resourceId;

        @JsonProperty("INSTANCE_ID")
        private Long instanceId;

        @JsonProperty("USAGE_RATE_OR_AMOUNT")
        private Long usageRateOrAmount;

        @JsonProperty("APPLIED_RESOURCE_UNITS")
        private Long appliedResourceUnits;

        @JsonProperty("START_DATE")
        @JsonFormat(pattern = Constants.DATE_FORMAT)
        private Date startDate;
    }
}
