package vhc.smartw.eam.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import vhc.smartw.eam.config.Constants;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@ToString
public class WipEntitiesDto {
    @JsonProperty("WIP_ENTITY_ID")
    private Long wipEntityId;

    @JsonProperty("ORGANIZATION_ID")
    private Long organizationId;

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

    @JsonProperty("WIP_ENTITY_NAME")
    private String wipEntityName;

    @JsonProperty("ENTITY_TYPE")
    private Long entityType;

    @JsonProperty("DESCRIPTION")
    private String description;

    @JsonProperty("PRIMARY_ITEM_ID")
    private Long primaryItemId;

    @JsonProperty("GEN_OBJECT_ID")
    private Long genObjectId;

    @JsonProperty("DEPARTMENT_CLASS_CODE")
    private String departmentClassCode;

    @JsonProperty("OWNING_DEPARTMENT")
    private Long owningDepartment;

    @JsonProperty("AREA_ID")
    private Long areaId;

    @JsonProperty("ASSET_GROUP_ID")
    private Long assetGroupId;

    @JsonProperty("ASSET_NUMBER")
    private String assetNumber;

    @JsonProperty("COUNTER_READING")
    private Long counterReading;

    @JsonProperty("COUNTER_COMPLETE")
    private Long counterComplete;

    @JsonProperty("STATUS_TYPE")
    private Integer statusType;

    @JsonProperty("SYSTEM_TYPE")
    private String systemType;

    @JsonProperty("WO_DETAIL")
    private EamWorkOrderDetailsDto eamWorkOrderDetails;

    @JsonProperty("WIP_DISCRETE_JOBS")
    private WipDiscreteJobsDto wipDiscreteJobs;

    @JsonProperty("EAM_ASSET_FAILURE")
    private EamAssetFailuresDto eamAssetFailures;

    @JsonProperty("OPERATION")
    private List<WipOperationsDto> wipOperations;
}