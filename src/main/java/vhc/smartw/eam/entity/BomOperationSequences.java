package vhc.smartw.eam.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vhc.smartw.eam.config.BomOperationSequencesId;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "BOM_OPERATION_SEQUENCES")
public class BomOperationSequences {
    @EmbeddedId
    private BomOperationSequencesId bomOperationSequencesId;
    @Column(name = "BOM_OPERATION_SEQUENCES")
    private Long bomOperationSequences;
    @Column(name = "REFERENCE_FLAG")
    private Long referenceFlag;
    @Column(name = "DEPARTMENT_ID")
    private Long departmentId;
    @Column(name = "OPTION_DEPENDENT_FLAG")
    private Long optionDependentFlag;
    @Column(name = "OPERATION_LEAD_TIME_PERCENT")
    private Long operationLeadTimePercent;
    @Column(name = "MINIMUM_TRANSFER_QUANTITY")
    private Long minimumTransferQuantity;
    @Column(name = "COUNT_POINT_TYPE")
    private Long countPointType;
    @Column(name = "OPERATION_DESCRIPTION")
    private String operationDescription;
    @Column(name = "EFFECTIVITY_DATE")
    private Date effectivityDate;
    @Column(name = "DISABLE_DATE")
    private Date disableDate;
    @Column(name = "BACKFLUSH_FLAG")
    private Long backflushFlag;
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
    @Column(name = "OPERATION_TYPE")
    private Long operationType;
    @Column(name = "PROCESS_OP_SEQ_ID")
    private Long processOpSeqId;
    @Column(name = "LINE_OP_SEQ_ID")
    private Long lineOpSeqId;
    @Column(name = "YIELD")
    private Long yield;
    @Column(name = "ECO_FOR_PRODUCTION")
    private Long ecoForProduction;
    @Column(name = "SHUTDOWN_TYPE")
    private String shutdownType;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "CREATION_DATE")
    private Date creationDate;
}
