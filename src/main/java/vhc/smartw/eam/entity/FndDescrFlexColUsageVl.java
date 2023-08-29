package vhc.smartw.eam.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vhc.smartw.eam.config.FndDescrFlexColUsageVlId;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "FND_DESCR_FLEX_COL_USAGE_VL")
public class FndDescrFlexColUsageVl {
    @EmbeddedId
    private FndDescrFlexColUsageVlId fndDescrFlexColUsageVlId;

    @Column(name = "COLUMN_SEQ_NUM")
    private Long columnSeqNum;

    @Column(name = "END_USER_COLUMN_NAME")
    private String endUserColumnName;

    @Column(name = "FORM_LEFT_PROMPT")
    private String formLeftPrompt;

    @Column(name = "FLEX_VALUE_SET_ID")
    private Long flexValueSetId;

    @Column(name = "DISPLAY_FLAG")
    private String displayFlag;

    @Column(name = "ENABLED_FLAG")
    private String enabledFlag;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "DEFAULT_VALUE")
    private String defaultValue;

    @Column(name = "RUNTIME_PROPERTY_FUNCTION")
    private String runtimePropertyFunction;

    @Column(name = "REQUIRED_FLAG")
    private String requiredFlag;

    @Column(name = "SECURITY_ENABLED_FLAG")
    private String securityEnabledFlag;

    @Column(name = "DISPLAY_SIZE")
    private Long displaySize;

    @Column(name = "MAXIMUM_DESCRIPTION_LEN")
    private Long maximumDescriptionLen;

    @Column(name = "CONCATENATION_DESCRIPTION_LEN")
    private Long concatenationDescriptionLen;

    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;

    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;

    @Column(name = "CREATION_DATE")
    private Date creationDate;

    @Column(name = "CREATED_BY")
    private String createdBy;
}
