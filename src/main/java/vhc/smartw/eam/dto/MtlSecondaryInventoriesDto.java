package vhc.smartw.eam.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import vhc.smartw.eam.config.Constants;
import vhc.smartw.eam.config.MtlSecondaryInventoriesId;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MtlSecondaryInventoriesDto {
    @NotNull
    @JsonProperty("mtl_secondary_inventories_id")
    private MtlSecondaryInventoriesId mtlSecondaryInventoriesId;
    @JsonProperty("description")
    private String description;
    @JsonProperty("disable_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date disableDate;
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
