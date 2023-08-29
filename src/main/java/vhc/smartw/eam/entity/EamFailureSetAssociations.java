package vhc.smartw.eam.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vhc.smartw.eam.config.EamFailureSetAssociationsId;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "EAM_FAILURE_SET_ASSOCIATIONS")
public class EamFailureSetAssociations {
    @EmbeddedId
    private EamFailureSetAssociationsId eamFailureSetAssociationsId;

    @Column(name = "FAILURE_CODE_REQUIRED")
    private String failureCodeRequired;

    @Column(name = "EFFECTIVE_END_DATE")
    private Date effectiveEndDate;

    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;

    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;

    @Column(name = "CREATION_DATE")
    private Date creationDate;

    @Column(name = "CREATED_BY")
    private String createdBy;
}
