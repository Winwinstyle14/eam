package vhc.smartw.eam.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import vhc.smartw.eam.config.Constants;

import java.util.Collection;
import java.util.Date;

@Data
@NoArgsConstructor
@ToString
public class XuatNhapDto {
    @JsonProperty("CR_ID")
    private String crId;

    @JsonProperty("REQUEST_NUMBER")
    private String requestNumber;

    @JsonProperty("ORGANIZATION_ID")
    private Long organizationId;

    @JsonProperty("TRANSACTION_TYPE_ID")
    private Long transactionTypeId;

    @JsonProperty("MOVE_ORDER_TYPE")
    private Long moveOrderType;

    @JsonProperty("DESCRIPTION")
    private String description;

    @JsonProperty("FROM_SUBINVENTORY_CODE")
    private String fromSubinventoryCode;

    @JsonProperty("FROM_LOCATOR_ID")
    private String fromLocatorCode;

    @JsonProperty("FROM_MBF_TRAM_ID")
    private String fromMbfTramCode;

    @JsonProperty("TO_ORGANIZATION_ID")
    private Long toOrganizationId;

    @JsonProperty("TO_SUBINVENTORY_CODE")
    private String toSubinventoryCode;

    @JsonProperty("TO_LOCATOR_ID")
    private String toLocatorCode;

    @JsonProperty("TO_MBF_TRAM_ID")
    private String toMbfTramCode;

    @JsonProperty("HEADER_STATUS")
    private Long headerStatus;

    @JsonProperty("MBF_REASON")
    private String mbfReason;

    @JsonProperty("MBF_EXPORT_CODE")
    private String mbfExportCode;

    @JsonProperty("MBF_RECEIPT_CODE")
    private String mbfReceiptCode;

    @JsonProperty("MBF_EXPORT_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date mbfExportDate;

    @JsonProperty("MBF_RECEIPT_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date mbfReceiptDate;

    @JsonProperty("MBF_DESTROY_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date mbfDestroyDate;

    @JsonProperty("MBF_EXPORTER_NAME")
    private String mbfExporterName;

    @JsonProperty("MBF_RECIPIENT_NAME")
    private String mbfRecipientName;

    @JsonProperty("DATE_REQUIRED")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date dateRequired;

    @JsonProperty("lines")
    private Collection<XuatNhapDto.MbfMtlRequestLinesEamDto> lines;

    @Data
    @NoArgsConstructor
    @ToString
    public static class MbfMtlRequestLinesEamDto{
        @JsonProperty("LINE_NUMBER")
        private Long lineNumber;

        @JsonProperty("LINE_TYPE")
        private Long lineType;

        @JsonProperty("INVENTORY_ITEM_ID")
        private Long inventoryItemId;

        @JsonProperty("INVENTORY_ITEM_NAME")
        private String inventoryItemName;

        @JsonProperty("INVENTORY_ITEM_NUMBER")
        private String inventoryItemNumber;

        @JsonProperty("UOM_CODE")
        private String uomCode;

        @JsonProperty("LOT_NUMBER")
        private String lotNumber;

        @JsonProperty("SERIAL_NUMBER")
        private String serialNumber;

        @JsonProperty("QUANTITY_REQUIRED")
        private Long quantityRequired;

        @JsonProperty("QUANTITY_CONFIRM")
        private Long quantityConfirm;

        @JsonProperty("QUANTITY_RETURN")
        private Long quantityReturn;

        @JsonProperty("ITEM_STATUS")
        private Long itemStatus;

        @JsonProperty("ASSET_ID")
        private Long assetId;

        @JsonProperty("REBUILDABLE_ID")
        private Long rebuildableId;

        @JsonProperty("OPERATION_SEQ_NUM")
        private Long operationSeqNum;
    }
}
