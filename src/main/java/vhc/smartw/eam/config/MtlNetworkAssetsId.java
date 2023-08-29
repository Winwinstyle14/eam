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
@Table(name = "MTL_NETWORK_ASSETS")
public class MtlNetworkAssetsId {
    @Column(name = "NETWORK_ASSOCIATION_ID")
    private Long networkAssociationId;
    @Column(name = "INVENTORY_ITEM_ID")
    private Long inventoryItemId;
}
