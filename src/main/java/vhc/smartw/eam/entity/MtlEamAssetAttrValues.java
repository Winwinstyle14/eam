package vhc.smartw.eam.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vhc.smartw.eam.config.MtlAssetAttrValuesId;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "MTL_EAM_ASSET_ATTR_VALUES")
public class MtlEamAssetAttrValues {
    @EmbeddedId
    private MtlAssetAttrValuesId mtlAssetAttrValuesId;
    @Column(name = "ORGANIZATION_ID")
    private Long organizationId;
    @Column(name = "APPLICATION_ID")
    private Long applicationId;
    @Column(name = "DESCRIPTIVE_FLEXFIELD_NAME")
    private String descriptiveFlexfieldName;
    @Column(name = "C_ATTRIBUTE1")
    private String cAttribute1;
    @Column(name = "C_ATTRIBUTE2")
    private String cAttribute2;
    @Column(name = "C_ATTRIBUTE3")
    private String cAttribute3;
    @Column(name = "C_ATTRIBUTE4")
    private String cAttribute4;
    @Column(name = "C_ATTRIBUTE5")
    private String cAttribute5;
    @Column(name = "C_ATTRIBUTE6")
    private String cAttribute6;
    @Column(name = "C_ATTRIBUTE7")
    private String cAttribute7;
    @Column(name = "C_ATTRIBUTE8")
    private String cAttribute8;
    @Column(name = "C_ATTRIBUTE9")
    private String cAttribute9;
    @Column(name = "C_ATTRIBUTE10")
    private String cAttribute10;
    @Column(name = "C_ATTRIBUTE11")
    private String cAttribute11;
    @Column(name = "C_ATTRIBUTE12")
    private String cAttribute12;
    @Column(name = "C_ATTRIBUTE13")
    private String cAttribute13;
    @Column(name = "C_ATTRIBUTE14")
    private String cAttribute14;
    @Column(name = "C_ATTRIBUTE15")
    private String cAttribute15;
    @Column(name = "C_ATTRIBUTE16")
    private String cAttribute16;
    @Column(name = "C_ATTRIBUTE17")
    private String cAttribute17;
    @Column(name = "C_ATTRIBUTE18")
    private String cAttribute18;
    @Column(name = "C_ATTRIBUTE19")
    private String cAttribute19;
    @Column(name = "C_ATTRIBUTE20")
    private String cAttribute20;
    @Column(name = "D_ATTRIBUTE1")
    private Date dAttribute1;
    @Column(name = "D_ATTRIBUTE2")
    private Date dAttribute2;
    @Column(name = "D_ATTRIBUTE3")
    private Date dAttribute3;
    @Column(name = "D_ATTRIBUTE4")
    private Date dAttribute4;
    @Column(name = "D_ATTRIBUTE5")
    private Date dAttribute5;
    @Column(name = "D_ATTRIBUTE6")
    private Date dAttribute6;
    @Column(name = "D_ATTRIBUTE7")
    private Date dAttribute7;
    @Column(name = "D_ATTRIBUTE8")
    private Date dAttribute8;
    @Column(name = "D_ATTRIBUTE9")
    private Date dAttribute9;
    @Column(name = "D_ATTRIBUTE10")
    private Date dAttribute10;
    @Column(name = "N_ATTRIBUTE1")
    private Long nAttribute1;
    @Column(name = "N_ATTRIBUTE2")
    private Long nAttribute2;
    @Column(name = "N_ATTRIBUTE3")
    private Long nAttribute3;
    @Column(name = "N_ATTRIBUTE4")
    private Long nAttribute4;
    @Column(name = "N_ATTRIBUTE5")
    private Long nAttribute5;
    @Column(name = "N_ATTRIBUTE6")
    private Long nAttribute6;
    @Column(name = "N_ATTRIBUTE7")
    private Long nAttribute7;
    @Column(name = "N_ATTRIBUTE8")
    private Long nAttribute8;
    @Column(name = "N_ATTRIBUTE9")
    private Long nAttribute9;
    @Column(name = "N_ATTRIBUTE10")
    private Long nAttribute10;
    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "CREATION_DATE")
    private Date creationDate;
}
