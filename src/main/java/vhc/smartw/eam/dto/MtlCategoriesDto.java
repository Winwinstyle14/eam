package vhc.smartw.eam.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import vhc.smartw.eam.config.Constants;

import java.util.Date;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MtlCategoriesDto {
    @NotNull
    @JsonProperty("category_id")
    private Long categoryId;
    @NotNull
    @JsonProperty("structure_id")
    private Long structureId;
    @NotNull
    @JsonProperty("segment1")
    private String segment1;
    @NotNull
    @JsonProperty("segment2")
    private String segment2;
    @JsonProperty("description")
    private String description;
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
