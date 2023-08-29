package vhc.smartw.eam.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Collection;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OnHandResponseDto {
    @JsonProperty("error_code")
    private String errorCode;

    @JsonProperty("error_message")
    private String errorMessage;

    @JsonProperty("request")
    private Object request;

    @JsonProperty("result")
    private Collection<OnHand> onHands;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    public static class OnHand{
        @JsonProperty("LOCATOR_ID")
        private Long locatorId;

        @JsonProperty("ORG_NAME")
        private String orgName;

        @JsonProperty("SUBINVENTORY_CODE")
        private String subInventoryCode;

        @JsonProperty("LOCATOR_CODE")
        private String locatorCode;

        @JsonProperty("INVENTORY_ITEM_NUMBER")
        private String inventoryItemNumber;

        @JsonProperty("EAM_ITEM_TYPE")
        private Long eamItemType;

        @JsonProperty("TOTAL_ONHAND_QTY")
        private Long totalOnHandQty;

        @JsonProperty("TOTAL_TRANSACT_QTY")
        private Long totalTransactQty;

        @JsonProperty("ORGANIZATION_ID")
        private Long organizationId;

        @JsonProperty("ITEM_NAME")
        private String itemName;

        @JsonProperty("SERIAL_NUMBER")
        private String serialNumber;

        @JsonProperty("UOM")
        private String uom;

        @JsonProperty("INVENTORY_ITEM_ID")
        private Long inventoryItemId;

        @JsonProperty("ITEM_STATUS")
        private String itemStatus;

        @JsonProperty("ORG_CODE")
        private String orgCode;

        @JsonProperty("ONHAND_QTY")
        private Long onHandQty;

        @JsonProperty("TOTAL_RESERVE_QTY")
        private Long totalReserveQty;
    }
}
