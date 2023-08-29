package vhc.smartw.eam.config;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@Builder
@EqualsAndHashCode
@Table(name = "MTL_ITEM_LOCATIONS")
public class MtlItemLocationsId {
    @Column(name = "INVENTORY_LOCATION_ID")
    private Long inventoryLocationId;
    @Column(name = "ORGANIZATION_ID")
    private Long organizationId;
}
