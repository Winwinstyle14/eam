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
@Table(name = "MTL_PARAMETERS")
public class MtlParameters {
    @Id
    @Column(name = "ORGANIZATION_ID")
    private Long organizationId;
    @Column(name = "ORGANIZATION_CODE")
    private String organizationCode;
    @Column(name = "ORGANIZATION_NAME")
    private String organizationName;
    @Column(name = "STOCK_LOCATOR_CONTROL_CODE")
    private Long stockLocatorControlCode;
    @Column(name = "EAM_ENABLED_FLAG")
    private String eamEnabledFlag;
    @Column(name = "ORGANIZATION_OU_ID")
    private Long organizationOuId;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "CREATION_DATE")
    private Date creationDate;
}
