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
public class CsiIAssetsDto {
    @NotNull
    @JsonProperty("instance_asset_id")
    private Long instanceAssetId;
    @NotNull
    @JsonProperty("instance_id")
    private Long instanceId;
    @JsonProperty("fa_asset_id")
    private Long faAssetId;
    @JsonProperty("last_update_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date lastUpdateDate;
    @JsonProperty("last_updated_by")
    private String lastUpdatedBy;
    @JsonProperty("creation_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date creationDate;
    @NotNull
    @JsonProperty("created_by")
    private String createdBy;
}
