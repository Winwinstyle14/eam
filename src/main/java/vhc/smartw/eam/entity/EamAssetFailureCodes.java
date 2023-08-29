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
@Table(name = "EAM_ASSET_FAILURE_CODES")
public class EamAssetFailureCodes {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "FAILURE_ID")
    private Long failureId;

    @Column(name = "FAILURE_ENTRY_ID")
    private Long failureEntryId;

    @Column(name = "COMBINATION_ID")
    private Long combinationId;

    @Column(name = "FAILURE_CODE")
    private String failureCode;

    @Column(name = "CAUSE_CODE")
    private String causeCode;

    @Column(name = "RESOLUTION_CODE")
    private String resolutionCode;

    @Column(name = "COMMENTS")
    private String comments;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "CREATION_DATE")
    private Date creationDate;

    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;

    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;

    /*@OneToOne
    @JoinColumn(name = "FAILURE_ID", referencedColumnName = "FAILURE_ID", insertable = false, updatable = false)
    private EamAssetFailures eamAssetFailures;*/
}
