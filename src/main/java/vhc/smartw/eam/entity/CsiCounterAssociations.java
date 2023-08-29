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
@Table(name = "CSI_COUNTER_ASSOCIATIONS")
public class CsiCounterAssociations {
    @Id
    @Column(name = "INSTANCE_ASSOCIATION_ID")
    private Long instanceAssociationId;
    @Column(name = "SOURCE_OBJECT_CODE")
    private String sourceObjectCode;
    @Column(name = "SOURCE_OBJECT_ID")
    private Long sourceObjectId;
    @Column(name = "COUNTER_ID")
    private Long counterId;
    @Column(name = "START_DATE_ACTIVE")
    private Date startDateActive;
    @Column(name = "END_DATE_ACTIVE")
    private Date endDateActive;
    @Column(name = "OBJECT_VERSION_NUMBER")
    private Long objectVersionNumber;
    @Column(name = "MIGRATED_FLAG")
    private String migratedFlag;
    @Column(name = "MAINT_ORGANIZATION_ID")
    private Long maintOrganizationId;
    @Column(name = "PRIMARY_FAILURE_FLAG")
    private String primaryFailureFlag;
    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "CREATION_DATE")
    private Date creationDate;
    @Column(name = "CREATED_BY")
    private String createdBy;
}
