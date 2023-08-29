package vhc.smartw.eam.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@Builder
@EqualsAndHashCode
public class BomResourceEquipmentsId {
    @JsonProperty("resource_id")
    private Long resourceId;
    @JsonProperty("organization_id")
    private Long organizationId;
    @JsonProperty("inventory_item_id")
    private Long inventoryItemId;
}
