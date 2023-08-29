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
@Table(name = "MFG_LOOKUPS")
public class MfgLookups {
    @Id
    @Column(name = "LOOKUP_CODE")
    private Long lookupCode;
    @Column(name = "LOOKUP_TYPE")
    private String lookupType;
    @Column(name = "MEANING")
    private String meaning;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "ENABLED_FLAG")
    private String enabledFlag;
    @Column(name = "START_DATE_ACTIVE")
    private Date startDateActive;
    @Column(name = "END_DATE_ACTIVE")
    private Date endDateActive;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "CREATION_DATE")
    private Date creationDate;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;
    @Column(name = "LAST_UPDATE_LOGIN")
    private Long lastUpdateLogin;
}
