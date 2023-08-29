package vhc.smartw.eam.config;

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
public class CsiItemInstanceId {
    @Column(name = "INSTANCE_NUMBER")
    private String instanceNumber;
    @Column(name = "INSTANCE_ID")
    private Long instanceId;
    @Column(name = "INVENTORY_ITEM_ID")
    private Long inventoryItemId;
}
