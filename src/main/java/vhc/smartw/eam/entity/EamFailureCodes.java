package vhc.smartw.eam.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name = "EAM_FAILURE_CODES")
public class EamFailureCodes {
    @Id
    @Column(name = "FAILURE_CODE")
    private String failureCode;
    @Column(name = "DESCRIPTION")
    private String description;
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
