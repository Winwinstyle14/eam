package vhc.smartw.eam.entity;


import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import vhc.smartw.eam.config.FndFlexValuesVlId;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "FND_FLEX_VALUES_VL")
public class FndFlexValuesVl {
    @EmbeddedId
    private FndFlexValuesVlId fndFlexValuesVlId;

    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;

    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;

    @Column(name = "CREATION_DATE")
    private Date creationDate;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "LAST_UPDATE_LOGIN")
    private Long lastUpdateLogin;

    @Column(name = "ENABLED_FLAG")
    private String enabledFlag;

    @Column(name = "SUMMARY_FLAG")
    private String summaryFlag;

    @Column(name = "START_DATE_ACTIVE")
    private Date startDateActive;

    @Column(name = "END_DATE_ACTIVE")
    private Date endDateActive;

    @Column(name = "PARENT_FLEX_VALUE_LOW")
    private String parentFlexValueLow;

    @Column(name = "PARENT_FLEX_VALUE_HIGH")
    private String parentFlexValueHigh;

    @Column(name = "STRUCTURED_HIERARCHY_LEVEL")
    private Long structuredHierarchyLevel;

    @Column(name = "HIERARCHY_LEVEL")
    private String hierarchyLevel;

    @Column(name = "COMPILED_VALUE_ATTRIBUTES")
    private String compiledValueAttributes;

    @Column(name = "VALUE_CATEGORY")
    private String valueCategory;

    @Column(name = "ATTRIBUTE1")
    private String attribute1;

    @Column(name = "ATTRIBUTE2")
    private String attribute2;

    @Column(name = "ATTRIBUTE3")
    private String attribute3;

    @Column(name = "ATTRIBUTE4")
    private String attribute4;

    @Column(name = "ATTRIBUTE5")
    private String attribute5;

    @Column(name = "ATTRIBUTE6")
    private String attribute6;

    @Column(name = "ATTRIBUTE7")
    private String attribute7;

    @Column(name = "ATTRIBUTE8")
    private String attribute8;

    @Column(name = "ATTRIBUTE9")
    private String attribute9;

    @Column(name = "ATTRIBUTE10")
    private String attribute10;

    @Column(name = "ATTRIBUTE11")
    private String attribute11;

    @Column(name = "ATTRIBUTE12")
    private String attribute12;

    @Column(name = "ATTRIBUTE13")
    private String attribute13;

    @Column(name = "ATTRIBUTE14")
    private String attribute14;

    @Column(name = "ATTRIBUTE15")
    private String attribute15;

    @Column(name = "ATTRIBUTE16")
    private String attribute16;

    @Column(name = "ATTRIBUTE17")
    private String attribute17;

    @Column(name = "ATTRIBUTE18")
    private String attribute18;

    @Column(name = "ATTRIBUTE19")
    private String attribute19;

    @Column(name = "ATTRIBUTE20")
    private String attribute20;

    @Column(name = "ATTRIBUTE21")
    private String attribute21;

    @Column(name = "ATTRIBUTE22")
    private String attribute22;

    @Column(name = "ATTRIBUTE23")
    private String attribute23;

    @Column(name = "ATTRIBUTE24")
    private String attribute24;

    @Column(name = "ATTRIBUTE25")
    private String attribute25;

    @Column(name = "ATTRIBUTE26")
    private String attribute26;

    @Column(name = "ATTRIBUTE27")
    private String attribute27;

    @Column(name = "ATTRIBUTE28")
    private String attribute28;

    @Column(name = "ATTRIBUTE29")
    private String attribute29;

    @Column(name = "ATTRIBUTE30")
    private String attribute30;

    @Column(name = "ATTRIBUTE31")
    private String attribute31;

    @Column(name = "ATTRIBUTE32")
    private String attribute32;

    @Column(name = "ATTRIBUTE33")
    private String attribute33;

    @Column(name = "ATTRIBUTE34")
    private String attribute34;

    @Column(name = "ATTRIBUTE35")
    private String attribute35;

    @Column(name = "ATTRIBUTE36")
    private String attribute36;

    @Column(name = "ATTRIBUTE37")
    private String attribute37;

    @Column(name = "ATTRIBUTE38")
    private String attribute38;

    @Column(name = "ATTRIBUTE39")
    private String attribute39;

    @Column(name = "ATTRIBUTE40")
    private String attribute40;

    @Column(name = "ATTRIBUTE41")
    private String attribute41;

    @Column(name = "ATTRIBUTE42")
    private String attribute42;

    @Column(name = "ATTRIBUTE43")
    private String attribute43;

    @Column(name = "ATTRIBUTE44")
    private String attribute44;

    @Column(name = "ATTRIBUTE45")
    private String attribute45;

    @Column(name = "ATTRIBUTE46")
    private String attribute46;

    @Column(name = "ATTRIBUTE47")
    private String attribute47;

    @Column(name = "ATTRIBUTE48")
    private String attribute48;

    @Column(name = "ATTRIBUTE49")
    private String attribute49;

    @Column(name = "ATTRIBUTE50")
    private String attribute50;

    @Column(name = "FLEX_VALUE_MEANING")
    private String flexValueMeaning;

    @Column(name = "DESCRIPTION")
    private String description;
}
