package vhc.smartw.eam.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vhc.smartw.eam.config.MtlSerialNumbersId;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "MTL_SERIAL_NUMBERS")
public class MtlSerialNumbers {
    @EmbeddedId
    private MtlSerialNumbersId mtlSerialNumbersId;
    @Column(name = "CURRENT_STATUS")
    private Long currentStatus;
    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "CREATION_DATE")
    private Date creationDate;
    @Column(name = "LOT_NUMBER")
    private String lotNumber;
    @Column(name = "CURRENT_SUBINVENTORY_CODE")
    private String currentSubinventoryCode;
    @Column(name = "CURRENT_LOCATOR_ID")
    private Long currentLocatorId;
    @Column(name = "GROUP_MARK_ID")
    private Long GroupMarkId;
    @Column(name = "LINE_MARK_ID")
    private Long lineMarkId;
    @Column(name = "LOT_LINE_MARK_ID")
    private Long lotLineMarkId;
    @Column(name = "GEN_OBJECT_ID")
    private Long genObjectId;
    @Column(name = "STATUS_ID")
    private Long statusId;
    @Column(name = "PREVIOUS_STATUS")
    private Long previousStatus;
    @Column(name = "WIP_ACCOUNTING_CLASS_CODE")
    private String wipAccountingClassCode;
    @Column(name = "EAM_LOCATION_ID")
    private Long eamLocationId;
    @Column(name = "OWNING_ORGANIZATION_ID")
    private Long owningOrganizationId;
    @Column(name = "EAM_INSTANTIATION_FLAG")
    private String eamInstantiationFlag;
    @Column(name = "EAM_LINEAR_LOCATION_ID")
    private Long eamLinearLocationId;
}
