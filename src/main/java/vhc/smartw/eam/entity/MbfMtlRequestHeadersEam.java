package vhc.smartw.eam.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "MBF_MTL_REQUEST_HEADERS_EAM")
public class MbfMtlRequestHeadersEam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "CR_ID")
    private String crId;

    @Column(name = "ORGANIZATION_ID")
    private Long organizationId;

    @Column(name = "REQUEST_NUMBER")
    private String requestNumber;

    @Column(name = "TRANSACTION_TYPE_ID")
    private Long transactionTypeId;

    @Column(name = "MOVE_ORDER_TYPE")
    private Long moveOrderType;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "FROM_SUBINVENTORY_CODE")
    private String fromSubinventoryCode;

    @Column(name = "FROM_LOCATOR_CODE")
    private String fromLocatorCode;

    @Column(name = "FROM_MBF_TRAM_CODE")
    private String fromMbfTramCode;

    @Column(name = "TO_SUBINVENTORY_CODE")
    private String toSubinventoryCode;

    @Column(name = "TO_LOCATOR_CODE")
    private String toLocatorCode;

    @Column(name = "TO_MBF_TRAM_CODE")
    private String toMbfTramCode;

    @Column(name = "HEADER_STATUS")
    private Long headerStatus;

    @Column(name = "MBF_REASON")
    private String mbfReason;

    @Column(name = "MBF_EXPORT_CODE")
    private String mbfExportCode;

    @Column(name = "MBF_RECEIPT_CODE")
    private String mbfReceiptCode;

    @Column(name = "MBF_EXPORT_DATE")
    private Date mbfExportDate;

    @Column(name = "MBF_RECEIPT_DATE")
    private Date mbfReceiptDate;

    @Column(name = "MBF_DESTROY_DATE")
    private Date mbfDestroyDate;

    @Column(name = "MBF_EXPORTER_NAME")
    private String mbfExporterName;

    @Column(name = "MBF_RECIPIENT_NAME")
    private String mbfRecipientName;

    @Column(name = "TO_ORGANIZATION_ID")
    private Long toOrganizationId;

    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;

    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;

    @Column(name = "CREATION_DATE")
    private Date creationDate;

    @Column(name = "CREATED_BY")
    private String createdBy;

    /*@OneToMany(mappedBy = "header", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Collection<MbfMtlRequestLinesEam> lines;*/
}
