package vhc.smartw.eam.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import lombok.*;
import vhc.smartw.eam.config.Constants;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MbfMtlRequestLinesEamDto {
    @JsonProperty("ID")
    private Long id;

    @JsonProperty("HEADER_ID")
    private Long headerId;

    @JsonProperty("LINE_NUMBER")
    private Long lineNumber;

    @JsonProperty("ORGANIZATION_ID")
    private Long organizationId;

    @JsonProperty("OPERATION_SEQ_NUM")
    private Long operationSeqNum;

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

    @JsonProperty("LAST_UPDATE_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date lastUpdateDate;

    @JsonProperty("LAST_UPDATED_BY")
    private String lastUpdatedBy;

    @JsonProperty("CREATION_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date creationDate;

    @JsonProperty("CREATED_BY")
    private String createdBy;
}