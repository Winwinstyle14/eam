package vhc.smartw.eam.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "WIP_ENTITIES")
public class WipEntities {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "WIP_ENTITY_ID")
    private Long wipEntityId;

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

    @Column(name = "WIP_ENTITY_NAME")
    private String wipEntityName;

    @Column(name = "ENTITY_TYPE")
    private Long entityType;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "PRIMARY_ITEM_ID")
    private Long primaryItemId;

    @Column(name = "GEN_OBJECT_ID")
    private Long genObjectId;

    @Column(name = "DEPARTMENT_CLASS_CODE")
    private String departmentClassCode;

    @Column(name = "OWNING_DEPARTMENT")
    private Long owningDepartment;

    @Column(name = "AREA_ID")
    private Long areaId;

    @Column(name = "ASSET_GROUP_ID")
    private Long assetGroupId;

    @Column(name = "ASSET_NUMBER")
    private String assetNumber;

    @Column(name = "COUNTER_READING")
    private Long counterReading;

    @Column(name = "COUNTER_COMPLETE")
    private Long counterComplete;

    @Column(name = "STATUS_TYPE")
    private Integer statusType;

    /*@OneToOne(
            mappedBy = "wipEntities",
            cascade = CascadeType.ALL,
            orphanRemoval = false
    )
    private WipDiscreteJobs wipDiscreteJobs;

    @OneToOne(
            mappedBy = "wipEntities",
            cascade = CascadeType.ALL,
            orphanRemoval = false
    )
    private EamAssetFailures eamAssetFailures;

    @OneToMany(
            mappedBy = "wipEntities",
            cascade = CascadeType.ALL,
            orphanRemoval = false
    )
    private Set<WipOperations> wipOperations;*/
}