package vhc.smartw.eam.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "EAM_ASSET_FAILURES")
public class EamAssetFailures {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "SOURCE_ID")
    private Long sourceId;

    @Column(name = "FAILURE_ID")
    private Long failureId;

    @Column(name = "FAILURE_DATE")
    private Date failureDate;

    @Column(name = "SOURCE_TYPE")
    private Long sourceType;

    @Column(name = "OBJECT_TYPE")
    private Long objectType;

    @Column(name = "OBJECT_ID")
    private Long objectId;

    @Column(name = "MAINT_ORGANIZATION_ID")
    private Long maintOrganizationId;

    @Column(name = "DEPARTMENT_ID")
    private Long departmentId;

    @Column(name = "AREA_ID")
    private Long areaId;

    @Column(name = "CURRENT_ORGANIZATION_ID")
    private Long currentOrganizationId;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "CREATION_DATE")
    private Date creationDate;

    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;

    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;

    /*@OneToOne
    @JoinColumn(name = "SOURCE_ID", insertable = false, updatable = false)
    private WipEntities wipEntities;

    @OneToOne(
            mappedBy = "eamAssetFailures",
            cascade = CascadeType.ALL,
            orphanRemoval = false
    )
    private EamAssetFailureCodes eamAssetFailureCodes;*/
}
