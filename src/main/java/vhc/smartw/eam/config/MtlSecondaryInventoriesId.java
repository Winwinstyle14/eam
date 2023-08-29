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
@Table(name = "MTL_SECONDARY_INVENTORIES")
public class MtlSecondaryInventoriesId {
    @Column(name = "ORGANIZATION_ID")
    private Long organizationId;
    @Column(name = "SECONDARY_INVENTORY_NAME")
    private String secondaryinventoryName;
}
