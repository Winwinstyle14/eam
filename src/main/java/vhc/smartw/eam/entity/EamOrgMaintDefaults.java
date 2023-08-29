package vhc.smartw.eam.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vhc.smartw.eam.config.EamOrgMaintDefaultsID;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "EAM_ORG_MAINT_DEFAULTS")
public class EamOrgMaintDefaults {
    @EmbeddedId
    private EamOrgMaintDefaultsID eamOrgMaintDefaultsID;
    @Column(name = "OWNING_DEPARTMENT_ID")
    private Long owningDepartmentId;
    @Column(name = "AREA_ID")
    private Long areaId;
    @Column(name = "ACCOUNTING_CLASS_CODE")
    private String accountingClassCode;
    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedby;
    @Column(name = "CREATED_BY")
    private String CREATED_BY;
    @Column(name = "CREATION_DATE")
    private Date creationDate;
}
