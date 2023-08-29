package vhc.smartw.eam.dtoFlat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import vhc.smartw.eam.config.BomResourceEquipmentsId;
import vhc.smartw.eam.config.Constants;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BomResourceEquipmentsDtoFlat {
    @NotNull
    @JsonProperty("resource_id")
    private Long resourceId;

    @NotNull
    @JsonProperty("organization_id")
    private Long organizationId;

    @NotNull
    @JsonProperty("inventory_item_id")
    private Long inventoryItemId;

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
