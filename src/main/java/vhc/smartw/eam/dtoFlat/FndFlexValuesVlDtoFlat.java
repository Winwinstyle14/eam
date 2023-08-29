package vhc.smartw.eam.dtoFlat;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import vhc.smartw.eam.config.Constants;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FndFlexValuesVlDtoFlat {
    @NotNull
    @JsonProperty("flex_value_id")
    private Long flexValueId;

    @NotNull
    @JsonProperty("flex_value_set_id")
    private Long flexValueSetId;

    @NotNull
    @JsonProperty("flex_value")
    private String flexValue;

    @NotNull
    @JsonProperty("attribute1")
    private String attribute1;

    @NotNull
    @JsonProperty("attribute2")
    private String attribute2;

    @NotNull
    @JsonProperty("attribute3")
    private String attribute3;

    @NotNull
    @JsonProperty("attribute4")
    private String attribute4;

    @NotNull
    @JsonProperty("attribute5")
    private String attribute5;

    @NotNull
    @JsonProperty("attribute11")
    private String attribute11;

    @NotNull
    @JsonProperty("attribute50")
    private String attribute50;

    @NotNull
    @JsonProperty("flex_value_meaning")
    private String flexValueMeaning;

    @JsonProperty("last_update_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date lastUpdateDate;

    @JsonProperty("last_updated_by")
    private String lastUpdatedBy;


    @JsonProperty("creation_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date creationDate;

    @JsonProperty("created_by")
    private String createdBy;

    @JsonProperty("last_update_login")
    private Long lastUpdateLogin;

    @JsonProperty("enabled_flag")
    private String enabledFlag;

    @JsonProperty("summary_flag")
    private String summaryFlag;

    @JsonProperty("start_date_active")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date startDateActive;

    @JsonProperty("end_date_active")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date endDateActive;

    @JsonProperty("parent_flex_value_low")
    private String parentFlexValueLow;

    @JsonProperty("parent_flex_value_high")
    private String parentFlexValueHigh;

    @JsonProperty("structured_hierarchy_level")
    private Long structuredHierarchyLevel;

    @JsonProperty("hierarchy_level")
    private String hierarchyLevel;

    @JsonProperty("compiled_value_attributes")
    private String compiledValueAttributes;

    @JsonProperty("value_category")
    private String valueCategory;

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

    @JsonProperty("attribute12")
    private String attribute12;

    @JsonProperty("attribute13")
    private String attribute13;

    @JsonProperty("attribute14")
    private String attribute14;

    @JsonProperty("attribute15")
    private String attribute15;

    @JsonProperty("attribute16")
    private String attribute16;

    @JsonProperty("attribute17")
    private String attribute17;

    @JsonProperty("attribute18")
    private String attribute18;

    @JsonProperty("attribute19")
    private String attribute19;

    @JsonProperty("attribute20")
    private String attribute20;

    @JsonProperty("attribute21")
    private String attribute21;

    @JsonProperty("attribute22")
    private String attribute22;

    @JsonProperty("attribute23")
    private String attribute23;

    @JsonProperty("attribute24")
    private String attribute24;

    @JsonProperty("attribute25")
    private String attribute25;

    @JsonProperty("attribute26")
    private String attribute26;

    @JsonProperty("attribute27")
    private String attribute27;

    @JsonProperty("attribute28")
    private String attribute28;

    @JsonProperty("attribute29")
    private String attribute29;

    @JsonProperty("attribute30")
    private String attribute30;

    @JsonProperty("attribute31")
    private String attribute31;

    @JsonProperty("attribute32")
    private String attribute32;

    @JsonProperty("attribute33")
    private String attribute33;

    @JsonProperty("attribute34")
    private String attribute34;

    @JsonProperty("attribute35")
    private String attribute35;

    @JsonProperty("attribute36")
    private String attribute36;

    @JsonProperty("attribute37")
    private String attribute37;

    @JsonProperty("attribute38")
    private String attribute38;

    @JsonProperty("attribute39")
    private String attribute39;

    @JsonProperty("attribute40")
    private String attribute40;

    @JsonProperty("attribute41")
    private String attribute41;

    @JsonProperty("attribute42")
    private String attribute42;

    @JsonProperty("attribute43")
    private String attribute43;

    @JsonProperty("attribute44")
    private String attribute44;

    @JsonProperty("attribute45")
    private String attribute45;

    @JsonProperty("attribute46")
    private String attribute46;

    @JsonProperty("attribute47")
    private String attribute47;

    @JsonProperty("attribute48")
    private String attribute48;

    @JsonProperty("attribute49")
    private String attribute49;

    @JsonProperty("description")
    private String description;
}
