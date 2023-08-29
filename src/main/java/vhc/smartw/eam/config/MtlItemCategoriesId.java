package vhc.smartw.eam.config;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Embeddable
@Builder
@EqualsAndHashCode
@Table(name = "MTL_ITEM_CATEGORIES")
public class MtlItemCategoriesId implements Serializable {
    @Column(name = "INVENTORY_ITEM_ID")
    private Long inventoryItemId;
    @Column(name = "ORGANIZATION_ID")
    private Long organizationId;
    @Column(name = "CATEGORY_ID")
    private Long categoryId;

    public MtlItemCategoriesId() {
    }

    public MtlItemCategoriesId(Long inventoryItemId, Long organizationId, Long categoryId) {
        this.inventoryItemId = inventoryItemId;
        this.organizationId = organizationId;
        this.categoryId = categoryId;
    }

    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}
