package vhc.smartw.eam.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vhc.smartw.eam.config.MtlNetworkAssetsId;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "MTL_EAM_NETWORK_ASSETS")
public class MtlEamNetworkAssets {
    @EmbeddedId
    private MtlNetworkAssetsId mtlNetworkAssetsId;

    @Column(name = "SERIAL_NUMBER")
    private String serialNumber;

    @Column(name = "ORGANIZATION_ID")
    private Long organizationId;

    @Column(name = "NETWORK_ITEM_ID")
    private Long networkItemId;

    @Column(name = "NETWORK_SERIAL_NUMBER")
    private String networkSerialNumber;

    @Column(name = "START_DATE_ACTIVE")
    private Date startDateActive;

    @Column(name = "END_DATE_ACTIVE")
    private Date endDateActive;

    @Column(name = "NETWORK_OBJECT_TYPE")
    private Long networkObjectType;

    @Column(name = "NETWORK_OBJECT_ID")
    private Long networkObjectId;

    @Column(name = "MAINTENANCE_OBJECT_TYPE")
    private Long maintenanceObjectType;

    @Column(name = "MAINTENANCE_OBJECT_ID")
    private Long maintenanceObjectId;

    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;

    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;

    @Column(name = "CREATION_DATE")
    private Date creationDate;

    @Column(name = "CREATED_BY")
    private String createdBy;
}
