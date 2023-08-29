package vhc.smartw.eam.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vhc.smartw.eam.config.MtlEamAssetAttrGroupsVId;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "MTL_EAM_ASSET_ATTR_GROUPS_V")
public class MtlEamAssetAttrGroupsV {
    @EmbeddedId
    private MtlEamAssetAttrGroupsVId mtlEamAssetAttrGroupsVId;
    @Column(name = "INVENTORY_ITEM_ID")
    private Long inventoryItemId;
    @Column(name = "DESCRIPTIVE_FLEX_CONTEXT_NAME")
    private String descriptiveFlexContextName;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "ENABLED_FLAG")
    private String enabledFlag;
    @Column(name = "ORGANIZATION_ID")
    private Long organizationId;
    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "CREATION_DATE")
    private Date creationDate;
    @Column(name = "CREATED_BY")
    private String createdBy;
}
