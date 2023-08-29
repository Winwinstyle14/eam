package vhc.smartw.eam.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "MBF_MTL_REQUEST_LINES_EAM")
public class MbfMtlRequestLinesEam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "LINE_ID")
    private Long lineId;

    @Column(name = "HEADER_ID")
    private Long headerId;

    @Column(name = "LINE_NUMBER")
    private Long lineNumber;

    @Column(name = "ORGANIZATION_ID")
    private Long organizationId;

    @Column(name = "OPERATION_SEQ_NUM")
    private Long operationSeqNum;

    @Column(name = "LINE_TYPE")
    private Long lineType;

    @Column(name = "INVENTORY_ITEM_ID")
    private Long inventoryItemId;

    @Column(name = "INVENTORY_ITEM_NAME")
    private String inventoryItemName;

    @Column(name = "INVENTORY_ITEM_NUMBER")
    private String inventoryItemNumber;

    @Column(name = "UOM_CODE")
    private String uomCode;

    @Column(name = "LOT_NUMBER")
    private String lotNumber;

    @Column(name = "SERIAL_NUMBER")
    private String serialNumber;

    @Column(name = "QUANTITY_REQUIRED")
    private Long quantityRequired;

    @Column(name = "QUANTITY_CONFIRM")
    private Long quantityConfirm;

    @Column(name = "QUANTITY_RETURN")
    private Long quantityReturn;

    @Column(name = "ITEM_STATUS")
    private Long itemStatus;

    @Column(name = "ASSET_ID")
    private Long assetId;

    @Column(name = "REBUILDABLE_ID")
    private Long rebuildableId;

    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;

    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;

    @Column(name = "CREATION_DATE")
    private Date creationDate;

    @Column(name = "CREATED_BY")
    private String createdBy;

    /*@ManyToOne
    @JoinColumn(name = "HEADER_ID", insertable=false, updatable=false)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private MbfMtlRequestHeadersEam header;*/
}
