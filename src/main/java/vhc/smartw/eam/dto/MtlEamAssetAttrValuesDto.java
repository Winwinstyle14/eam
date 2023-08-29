package vhc.smartw.eam.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import vhc.smartw.eam.config.Constants;
import vhc.smartw.eam.config.MtlAssetAttrValuesId;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MtlEamAssetAttrValuesDto {
    @NotNull
    @JsonProperty("mtl_asset_attr_values_id")
    private MtlAssetAttrValuesId mtlAssetAttrValuesId;
    @JsonProperty("organization_id")
    private Long organizationId;
    @JsonProperty("application_id")
    private Long applicationId;
    @JsonProperty("descriptive_flexfield_name")
    private String descriptiveFlexfieldName;
    @JsonProperty("c_attribute1")
    private String cAttribute1;
    @JsonProperty("c_attribute2")
    private String cAttribute2;
    @JsonProperty("c_attribute3")
    private String cAttribute3;
    @JsonProperty("c_attribute4")
    private String cAttribute4;
    @JsonProperty("c_attribute5")
    private String cAttribute5;
    @JsonProperty("c_attribute6")
    private String cAttribute6;
    @JsonProperty("c_attribute7")
    private String cAttribute7;
    @JsonProperty("c_attribute8")
    private String cAttribute8;
    @JsonProperty("c_attribute9")
    private String cAttribute9;
    @JsonProperty("c_attribute10")
    private String cAttribute10;
    @JsonProperty("c_attribute11")
    private String cAttribute11;
    @JsonProperty("c_attribute12")
    private String cAttribute12;
    @JsonProperty("c_attribute13")
    private String cAttribute13;
    @JsonProperty("c_attribute14")
    private String cAttribute14;
    @JsonProperty("c_attribute15")
    private String cAttribute15;
    @JsonProperty("c_attribute16")
    private String cAttribute16;
    @JsonProperty("c_attribute17")
    private String cAttribute17;
    @JsonProperty("c_attribute18")
    private String cAttribute18;
    @JsonProperty("c_attribute19")
    private String cAttribute19;
    @JsonProperty("c_attribute20")
    private String cAttribute20;
    @JsonProperty("d_attribute1")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date dAttribute1;
    @JsonProperty("d_attribute2")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date dAttribute2;
    @JsonProperty("d_attribute3")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date dAttribute3;
    @JsonProperty("d_attribute4")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date dAttribute4;
    @JsonProperty("d_attribute5")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date dAttribute5;
    @JsonProperty("d_attribute6")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date dAttribute6;
    @JsonProperty("d_attribute7")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date dAttribute7;
    @JsonProperty("d_attribute8")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date dAttribute8;
    @JsonProperty("d_attribute9")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date dAttribute9;
    @JsonProperty("d_attribute10")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date dAttribute10;
    @JsonProperty("n_attribute1")
    private Long nAttribute1;
    @JsonProperty("n_attribute2")
    private Long nAttribute2;
    @JsonProperty("n_attribute3")
    private Long nAttribute3;
    @JsonProperty("n_attribute4")
    private Long nAttribute4;
    @JsonProperty("n_attribute5")
    private Long nAttribute5;
    @JsonProperty("n_attribute6")
    private Long nAttribute6;
    @JsonProperty("n_attribute7")
    private Long nAttribute7;
    @JsonProperty("n_attribute8")
    private Long nAttribute8;
    @JsonProperty("n_attribute9")
    private Long nAttribute9;
    @JsonProperty("n_attribute10")
    private Long nAttribute10;
    @JsonProperty("last_update_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date lastUpdateDate;
    @JsonProperty("last_updated_by")
    private String lastUpdatedBy;
    @JsonProperty("created_by")
    private String createdBy;
    @JsonProperty("creation_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date creationDate;
}
