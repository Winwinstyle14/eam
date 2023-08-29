package vhc.smartw.eam.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import vhc.smartw.eam.config.Constants;
import vhc.smartw.eam.config.PerRatingLevelsId;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PerRatingLevelsDto {
    @NotNull
    @JsonProperty("per_rating_levels_id")
    private PerRatingLevelsId perRatingLevelsId;

    @JsonProperty("competence_id")
    private Long competenceId;

    @NotNull
    @JsonProperty("object_version_number")
    private Long objectVersionNumber;
    @JsonProperty("step_value")
    private Long stepValue;
    @JsonProperty("name")
    private String name;
    @JsonProperty("behavioural_indicator")
    private String behaviouralIndicator;
    @JsonProperty("last_updated_by")
    private String lastUpdatedBy;
    @JsonProperty("last_update_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date lastUpdateDate;
    @JsonProperty("created_by")
    private String createdBy;
    @JsonProperty("creation_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date creationDate;
}
