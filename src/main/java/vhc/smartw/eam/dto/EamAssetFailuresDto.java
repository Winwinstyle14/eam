package vhc.smartw.eam.dto;


import com.fasterxml.jackson.annotation.JsonFormat;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;

import lombok.*;

import vhc.smartw.eam.config.Constants;


import java.util.Date;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EamAssetFailuresDto {
    @JsonProperty("SOURCE_ID")
    private Long sourceId;

    @JsonProperty("FAILURE_ID")
    private Long failureId;

    @JsonProperty("FAILURE_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date failureDate;

    @JsonProperty("SOURCE_TYPE")
    private Long sourceType;

    @JsonProperty("OBJECT_TYPE")
    private Long objectType;

    @JsonProperty("OBJECT_ID")
    private Long objectId;

    @JsonProperty("MAINT_ORGANIZATION_ID")
    private Long maintOrganizationId;

    @JsonProperty("DEPARTMENT_ID")
    private Long departmentId;

    @JsonProperty("AREA_ID")
    private Long areaId;

    @JsonProperty("CURRENT_ORGANIZATION_ID")
    private Long currentOrganizationId;

    @JsonProperty("CREATED_BY")
    private String createdBy;

    @JsonProperty("CREATION_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date creationDate;

    @JsonProperty("LAST_UPDATED_BY")
    private String lastUpdatedBy;

    @JsonProperty("LAST_UPDATE_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date lastUpdateDate;

    @JsonProperty("EAM_ASSET_FAILURE_CODES")
    private EamAssetFailureCodesDto eamAssetFailureCodes;
}
