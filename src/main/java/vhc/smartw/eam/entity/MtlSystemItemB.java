package vhc.smartw.eam.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vhc.smartw.eam.config.MtlSerialNumbersId;
import vhc.smartw.eam.config.MtlSystemItemBId;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "MTL_SYSTEM_ITEMS_B")
public class MtlSystemItemB {
    @EmbeddedId
    private MtlSystemItemBId mtlSystemItemBId;
    @Column(name = "SEGMENT1")
    private String segment1;
    @Column(name = "SEGMENT2")
    private String segment2;
    @Column(name = "SEGMENT3")
    private String segment3;
    @Column(name = "SEGMENT4")
    private String segment4;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "PRIMARY_UOM_CODE")
    private String primaryUomCode;
    @Column(name = "PRIMARY_UNIT_OF_MEASURE")
    private String primaryUnitOfMeasure;
    @Column(name = "INVENTORY_ITEM_STATUS_CODE")
    private String inventoryItemStatusCode;
    @Column(name = "LOT_CONTROL_CODE")
    private Long lotControlCode;
    @Column(name = "AUTO_LOT_ALPHA_PREFIX")
    private String autoLotAlphaPrefix;
    @Column(name = "START_AUTO_LOT_NUMBER")
    private String startAutoLotNumber;
    @Column(name = "SERIAL_NUMBER_CONTROL_CODE")
    private Long serialNumberControlCode;
    @Column(name = "AUTO_SERIAL_ALPHA_PREFIX")
    private String autoSerialAlphaPrefix;
    @Column(name = "START_AUTO_SERIAL_NUMBER")
    private String startAutoSerialNumber;
    @Column(name = "EAM_ITEM_TYPE")
    private Long eamItemType;
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
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "CREATION_DATE")
    private Date creationDate;
}
