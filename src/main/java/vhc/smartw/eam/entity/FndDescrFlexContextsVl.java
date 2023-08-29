package vhc.smartw.eam.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vhc.smartw.eam.config.FndDescrFlexContextsVlId;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "FND_DESCR_FLEX_CONTEXTS_VL")
public class FndDescrFlexContextsVl {
    @EmbeddedId
    private FndDescrFlexContextsVlId fndDescrFlexContextsVlId;

    @Column(name = "DESCRIPTIVE_FLEX_CONTEXT_NAME")
    private String descriptiveFlexContextName;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "ENABLED_FLAG")
    private String enabledFlag;

    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;

    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;

    @Column(name = "CREATION_DATE")
    private Date creationDate;

    @Column(name = "CREATED_BY")
    private String createdBy;
}
