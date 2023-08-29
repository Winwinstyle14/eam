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
@Table(name = "EAM_ORG_MAINT_DEFAULTS")
public class EamOrgMaintDefaultsID implements Serializable {
    @Column(name = "OBJECT_TYPE")
    private Long objecttype;
    @Column(name = "OBJECT_ID")
    private Long objectId;
    @Column(name = "ORGANIZATION_ID")
    private Long organizationId;


    public EamOrgMaintDefaultsID() {
    }

    public EamOrgMaintDefaultsID(Long objecttype, Long objectId, Long organizationId) {
        this.objecttype = objecttype;
        this.objectId = objectId;
        this.organizationId = organizationId;
    }

    public Long getObjecttype() {
        return objecttype;
    }

    public void setObjecttype(Long objecttype) {
        this.objecttype = objecttype;
    }

    public Long getObjectId() {
        return objectId;
    }

    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }
}
