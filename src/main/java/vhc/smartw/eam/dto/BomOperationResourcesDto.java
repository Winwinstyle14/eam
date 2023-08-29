package vhc.smartw.eam.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import vhc.smartw.eam.config.BomOperationResourcesId;
import vhc.smartw.eam.config.Constants;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BomOperationResourcesDto {
    @NotNull
    @JsonProperty("bom_operation_resources_id")
    private BomOperationResourcesId bomOperationResourcesId;
    @JsonProperty("activity_id")
    private Long activityId;
    @JsonProperty("standard_rate_flag")
    private Long standardRateFlag;
    @JsonProperty("assigned_units")
    private Long assignedUnits;
    @JsonProperty("usage_rate_or_amount")
    private Long usageRateOrAmount;
    @JsonProperty("usage_rate_or_amount_inverse")
    private Long usageRateOrAmountInverse;
    @JsonProperty("basis_type")
    private Long basisType;
    @JsonProperty("schedule_flag")
    private Long scheduleFlag;
    @JsonProperty("autocharge_type")
    private Long autochargeType;
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
