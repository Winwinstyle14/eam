package vhc.smartw.eam.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import vhc.smartw.eam.config.Constants;

import java.util.Date;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FaAdditionsBDto {
    @NotNull
    @JsonProperty("asset_id")
    private Long assetId;
    @JsonProperty("asset_number")
    private String assetNumber;
    @JsonProperty("asset_category_id")
    private Long assetCategoryId;
    @JsonProperty("attribute_category_code")
    private String attributeCategoryCode;
    @JsonProperty("last_update_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date lastUpdateDate;
    @JsonProperty("last_updated_by")
    private String lastUpdatedBy;
    @JsonProperty("creation_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date creationDate;
    @JsonProperty("created_by")
    private String createdBy;

}
