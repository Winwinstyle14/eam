package vhc.smartw.eam.config;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
@Builder
@Embeddable
@EqualsAndHashCode
@Table(name = "MTL_ASSET_ATTR_VALUES")
public class MtlAssetAttrValuesId implements Serializable {
    @Column(name = "ASSOCIATION_ID")
    private Long associationId;
    @Column(name = "INVENTORY_ITEM_ID")
    private Long inventoryItemId;
    @Column(name = "SERIAL_NUMBER")
    private String serialNumber;
    @Column(name = "ATTRIBUTE_CATEGORY")
    private String attributeCategory;

    public MtlAssetAttrValuesId() {
    }

    public MtlAssetAttrValuesId(Long associationId, Long inventoryItemId, String serialNumber, String attributeCategory) {
        this.associationId = associationId;
        this.inventoryItemId = inventoryItemId;
        this.serialNumber = serialNumber;
        this.attributeCategory = attributeCategory;
    }

    public Long getAssociationId() {
        return associationId;
    }

    public void setAssociationId(Long associationId) {
        this.associationId = associationId;
    }

    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getAttributeCategory() {
        return attributeCategory;
    }

    public void setAttributeCategory(String attributeCategory) {
        this.attributeCategory = attributeCategory;
    }
}
