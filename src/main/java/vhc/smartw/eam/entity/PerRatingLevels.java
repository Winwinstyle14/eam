package vhc.smartw.eam.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vhc.smartw.eam.config.PerRatingLevelsId;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PER_RATING_LEVELS")
public class PerRatingLevels {
    @EmbeddedId
    private PerRatingLevelsId perRatingLevelsId;
    @Column(name = "OBJECT_VERSION_NUMBER")
    private Long objectVersionNumber;
    @Column(name = "STEP_VALUE")
    private Long stepValue;
    @Column(name = "NAME")
    private String name;
    @Column(name = "BEHAVIOURAL_INDICATOR")
    private String behaviouralIndicator;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "CREATION_DATE")
    private Date creationDate;
}
