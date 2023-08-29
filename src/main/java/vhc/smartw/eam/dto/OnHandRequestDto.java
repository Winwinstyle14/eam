package vhc.smartw.eam.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class OnHandRequestDto {
    @JsonProperty("P_ORGANIZATION_ID")
    private String organizationId;

    @JsonProperty("P_SUBINVENTORY_CODE")
    private String subInventoryCode;

    @JsonProperty("P_LOCATOR_ID")
    private String locatorId;

    @JsonProperty("P_INVENTORY_ITEM_NUMBER")
    private String inventoryItemNumber;

    @JsonProperty("P_ITEM_NAME")
    private String itemName;
}
