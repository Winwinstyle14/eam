package vhc.smartw.eam.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@Builder
@EqualsAndHashCode
public class EamFailureSetAssociationsId {
    @JsonProperty("set_id")
    private Long setId;

    @JsonProperty("inventory_item_id")
    private Long inventoryItemId;
}
