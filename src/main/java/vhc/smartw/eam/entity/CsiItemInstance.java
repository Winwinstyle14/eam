package vhc.smartw.eam.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vhc.smartw.eam.config.CsiItemInstanceId;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CSI_ITEM_INSTANCES")
public class CsiItemInstance {
    @EmbeddedId
    private CsiItemInstanceId csiItemInstanceId;
    @Column(name = "INSTANCE_DESCRIPTION")
    private String instanceDescription;
    @Column(name = "SERIAL_NUMBER")
    private String serialNumber;
    @Column(name = "LOT_NUMBER")
    private String lotNumber;
    @Column(name = "QUANTITY")
    private Long quantity;
    @Column(name = "UNIT_OF_MEASURE")
    private String unitOfMeasure;
    @Column(name = "CATEGORY_ID")
    private Long categoryId;
    @Column(name = "LAST_VLD_ORGANIZATION_ID")
    private Long lastVldOrganizationId;
    @Column(name = "ASSET_CRITICALITY_CODE")
    private String assetCriticalityCode;
    @Column(name = "INSTANCE_STATUS_ID")
    private Long instanceStatusId;
    @Column(name = "OPERATIONAL_LOG_FLAG")
    private String operationalLogFlag;
    @Column(name = "SUPPLIER_WARRANTY_EXP_DATE")
    private Date supplierWarrantyExpDate;
    @Column(name = "MAINTAINABLE_FLAG")
    private String maintainableFlag;
    @Column(name = "CHECKIN_STATUS")
    private Long checkinStatus;
    @Column(name = "INV_SUBINVENTORY_NAME")
    private String invSubinventoryName;
    @Column(name = "INV_LOCATOR_ID")
    private Long invLocatorId;
    @Column(name = "PN_LOCATION_ID")
    private Long pnLocationId;
    @Column(name = "LOCATION_ID")
    private Long locationId;
    @Column(name = "EQUIPMENT_GEN_OBJECT_ID")
    private Long equipmentGenObjectId;
    @Column(name = "CONTEXT")
    private String context;
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
    @Column(name = "LAST_UPDATE_DATE")
    private Date lastupdateDate;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "CREATION_DATE")
    private Date creationDate;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "ACTIVE_START_DATE")
    private Date activeStartDate;
    @Column(name = "ACTIVE_END_DATE")
    private Date activeEndDate;
    @Column(name = "INV_MASTER_ORGANIZATION_ID")
    private String invMasterOrganizationId;
    @Column(name = "INV_ORGANIZATION_ID")
    private String invOrganizationId;
    @Column(name = "NETWORK_ASSET_FLAG")
    private String networkAssetFlag;
    @Column(name = "INSTANTIATION_FLAG")
    private String instantiationFlag;
}
