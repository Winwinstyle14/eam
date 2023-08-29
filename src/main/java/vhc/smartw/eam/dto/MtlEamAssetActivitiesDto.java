package vhc.smartw.eam.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import vhc.smartw.eam.config.Constants;
import vhc.smartw.eam.config.MtlEamAssetActivitiesId;
import vhc.smartw.eam.entity.MtlEamAssetActivities;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MtlEamAssetActivitiesDto {
    @NotNull
    @JsonProperty("mtl_eam_asset_activities_id")
    private MtlEamAssetActivitiesId mtlEamAssetActivitiesId;
    @JsonProperty("priority_code")
    private String priorityCode;
    @JsonProperty("start_date_active")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date startDateActive;
    @JsonProperty("end_date_active")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date endDateActive;
    @JsonProperty("activity_cause_code")
    private String activityCauseCode;
    @JsonProperty("activity_type_code")
    private String activityTypeCode;
    @JsonProperty("inventory_item_id")
    private Long inventoryItemId;
    @JsonProperty("serial_number")
    private String serialNumber;
    @JsonProperty("tagging_required_flag")
    private String taggingRequiredFlag;
    @JsonProperty("shutdown_type_code")
    private String shutdownTypeCode;
    @JsonProperty("class_code")
    private String classCode;
    @JsonProperty("wip_entity_id")
    private Long wipEntityId;
    @JsonProperty("activity_source_code")
    private String activitySourceCode;
    @JsonProperty("attribute_category")
    private String attributeCategory;
    @JsonProperty("attribute1")
    private String attribute1;
    @JsonProperty("attribute2")
    private String attribute2;
    @JsonProperty("attribute3")
    private String attribute3;
    @JsonProperty("attribute4")
    private String attribute4;
    @JsonProperty("attribute5")
    private String attribute5;
    @JsonProperty("attribute6")
    private String attribute6;
    @JsonProperty("attribute7")
    private String attribute7;
    @JsonProperty("attribute8")
    private String attribute8;
    @JsonProperty("attribute9")
    private String attribute9;
    @JsonProperty("attribute10")
    private String attribute10;
    @JsonProperty("attribute11")
    private String attribute11;
    @JsonProperty("attribute12")
    private String attribute12;
    @JsonProperty("attribute13")
    private String attribute13;
    @JsonProperty("attribute14")
    private String attribute14;
    @JsonProperty("attribute15")
    private String attribute15;
    @JsonProperty("last_service_start_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date lastServiceStartDate;
    @JsonProperty("last_service_end_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date lastServiceEndDate;
    @JsonProperty("last_updated_by")
    private String lastUpdatedBy;
    @JsonProperty("last_update_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date lastUpdateDate;
    @JsonProperty("created_by")
    private String createdBy;
    @JsonProperty("creation_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date creationDate;
}
