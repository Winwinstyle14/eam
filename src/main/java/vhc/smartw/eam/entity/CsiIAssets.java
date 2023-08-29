package vhc.smartw.eam.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CSI_I_ASSETS")
public class CsiIAssets {
    @Id
    @Column(name = "INSTANCE_ASSET_ID")
    private Long instanceAssetId;
    @Column(name = "INSTANCE_ID")
    private Long instanceId;
    @Column(name = "FA_ASSET_ID")
    private Long faAssetId;
    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "CREATION_DATE")
    private Date creationDate;
    @Column(name = "CREATED_BY")
    private String createdBy;
}
