package vhc.smartw.eam.dtoFlat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import vhc.smartw.eam.config.BomDepartmentResourcesId;
import vhc.smartw.eam.config.Constants;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BomDepartmentResourcesDtoFlat {
    @NotNull(message = "Department Id không được để trống")
    @JsonProperty("department_id")
    private Long departmentId;
    @NotNull(message = "Resource Id không được để trống")
    @JsonProperty("resource_id")
    private Long resourceId;
    @NotNull(message = "Share Capacity Flag không được để trống")
    @JsonProperty("share_capacity_flag")
    private Long shareCapacityFlag;
    @JsonProperty("share_from_dept_id")
    private Long shareFromDeptId;
    @NotNull(message = "Available 24 Hours Flag không được để trống")
    @JsonProperty("available_24_hours_flag")
    private Long available24HoursFlag;
    @JsonProperty("capacity_units")
    private Long capacityUnits;
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
    @JsonProperty("resource_group_name")
    private String resourceGroupName;
    @JsonProperty("ctp_flag")
    private Long ctpFlag;
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
