package vhc.smartw.eam.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.*;

import vhc.smartw.eam.config.Constants;

import java.util.Collection;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MbfMtlRequestHeadersEamDto {
    @JsonProperty("ID")
    private Long id;

    @JsonProperty("HEADER_ID")
    private Long headerId;

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

    @JsonProperty("FROM_LOCATOR_CODE")
    private String fromLocatorCode;

    @JsonProperty("FROM_MBF_TRAM_CODE")
    private String fromMbfTramCode;

    @JsonProperty("TO_SUBINVENTORY_CODE")
    private String toSubinventoryCode;

    @JsonProperty("TO_LOCATOR_CODE")
    private String toLocatorCode;

    @JsonProperty("TO_MBF_TRAM_CODE")
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

    @JsonProperty("TO_ORGANIZATION_ID")
    private Long toOrganizationId;

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

    @JsonProperty("DATE_REQUIRED")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date dateRequired;

    @JsonProperty("lines")
    private Collection<MbfMtlRequestLinesEamDto> lines;
}