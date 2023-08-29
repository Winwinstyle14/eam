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
@Table(name = "FND_DESCRIPTIVE_FLEXS")
public class FndDescriptiveFlexs {
    @Id
    @Column(name = "APPLICATION_ID")
    private Long applicationId;
    @Column(name = "APPLICATION_TABLE_NAME")
    private String applicationTableName;
    @Column(name = "DESCRIPTIVE_FLEXFIELD_NAME")
    private String descriptiveFlexfieldName;
    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "CREATION_DATE")
    private Date creationDate;
    @Column(name = "CREATED_BY")
    private String createdBy;
}
