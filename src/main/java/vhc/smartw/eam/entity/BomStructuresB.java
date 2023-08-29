package vhc.smartw.eam.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vhc.smartw.eam.config.BomStructuresBId;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "BOM_STRUCTURES_B")
public class BomStructuresB {
    @EmbeddedId
    private BomStructuresBId bomStructuresBId;
    @Column(name = "ALTERNATE_BOM_DESIGNATOR")
    private String alternateBomDesignator;
    @Column(name = "ORGANIZATION_ID")
    private Long organizationId;
    @Column(name = "ASSEMBLY_TYPE")
    private Long assemblyType;
    @Column(name = "ATTRIBUTE_CATEGORY")
    private String attributeCategory;
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
    @Column(name = "COMMON_BILL_SEQUENCE_ID")
    private Long commonBillSequenceId;
    @Column(name = "COMMON_ASSEMBLY_ITEM_ID")
    private Long commonAssemblyItemId;
    @Column(name = "SPECIFIC_ASSEMBLY_COMMENT")
    private String specificAssemblyComment;
    @Column(name = "PENDING_FROM_ECN")
    private String pendingFromEcn;
    @Column(name = "PK1_VALUE")
    private String pk1Value;
    @Column(name = "PK2_VALUE")
    private String pk2Value;
    @Column(name = "PK3_VALUE")
    private String pk3Value;
    @Column(name = "PK4_VALUE")
    private String pk4Value;
    @Column(name = "PK5_VALUE")
    private String pk5Value;
    @Column(name = "EFFECTIVITY_CONTROL")
    private Long effectivityControl;
    @Column(name = "IS_PREFERRED")
    private String isPreferred;
    @Column(name = "SOURCE_BILL_SEQUENCE_ID")
    private Long sourceBillSequenceId;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "CREATION_DATE")
    private Date creationDate;

}
