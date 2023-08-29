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
@Table(name = "MTL_SERIAL_NUMBERS")
public class MtlSerialNumbersId {
    @Column(name = "SERIAL_NUMBER")
    private String serialNumber;
    @Column(name = "INVENTORY_ITEM_ID")
    private Long inventoryItemId;
    @Column(name = "CURRENT_ORGANIZATION_ID")
    private Long currentOrganizationId;
}
