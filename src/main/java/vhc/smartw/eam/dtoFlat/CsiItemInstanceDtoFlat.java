package vhc.smartw.eam.dtoFlat;


import com.fasterxml.jackson.annotation.JsonFormat;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotNull;

import lombok.*;

import vhc.smartw.eam.config.Constants;


import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CsiItemInstanceDtoFlat {
    @NotNull
    @JsonProperty("instance_number")
    private String instanceNumber;

    @NotNull
    @JsonProperty("instance_id")
    private Long instanceId;

    @NotNull
    @JsonProperty("inventory_item_id")
    private Long inventoryItemId;

    @JsonProperty("instance_description")
    private String instanceDescription;

    @JsonProperty("serial_number")
    private String serialNumber;

    @JsonProperty("lot_number")
    private String lotNumber;

    @JsonProperty("quantity")
    private Long quantity;

    @JsonProperty("unit_of_measure")
    private String unitOfMeasure;

    @JsonProperty("category_id")
    private Long categoryId;

    @NotNull
    @JsonProperty("last_vld_organization_id")
    private Long lastVldOrganizationId;

    @JsonProperty("asset_criticality_code")
    private String assetCriticalityCode;

    @JsonProperty("instance_status_id")
    private Long instanceStatusId;

    @JsonProperty("operational_log_flag")
    private String operationalLogFlag;

    @JsonProperty("supplier_warranty_exp_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date supplierWarrantyExpDate;

    @JsonProperty("maintainable_flag")
    private String maintainableFlag;

    @JsonProperty("checkin_status")
    private Long checkinStatus;

    @JsonProperty("inv_subinventory_name")
    private String invSubinventoryName;

    @JsonProperty("inv_locator_id")
    private Long invLocatorId;

    @JsonProperty("pn_location_id")
    private Long pnLocationId;

    @JsonProperty("location_id")
    private Long locationId;

    @JsonProperty("equipment_gen_object_id")
    private Long equipmentGenObjectId;

    @JsonProperty("context")
    private String context;

    @JsonProperty("attribute1")
    private String attribute1;

    @JsonProperty("attribute2")
    private String attribute2;

    @JsonProperty("attribute3")
    private String attribute3;

    @JsonProperty("attribute4")
    private String attribute4;

    @JsonProperty("attribute5")
    private String attribute5;

    @JsonProperty("attribute6")
    private String attribute6;

    @JsonProperty("attribute7")
    private String attribute7;

    @JsonProperty("attribute8")
    private String attribute8;

    @JsonProperty("attribute9")
    private String attribute9;

    @JsonProperty("attribute10")
    private String attribute10;

    @JsonProperty("attribute11")
    private String attribute11;

    @JsonProperty("attribute12")
    private String attribute12;

    @JsonProperty("attribute13")
    private String attribute13;

    @JsonProperty("attribute14")
    private String attribute14;

    @JsonProperty("attribute15")
    private String attribute15;

    @JsonProperty("attribute16")
    private String attribute16;

    @JsonProperty("attribute17")
    private String attribute17;

    @JsonProperty("attribute18")
    private String attribute18;

    @JsonProperty("attribute19")
    private String attribute19;

    @JsonProperty("attribute20")
    private String attribute20;

    @JsonProperty("attribute21")
    private String attribute21;

    @JsonProperty("attribute22")
    private String attribute22;

    @JsonProperty("attribute23")
    private String attribute23;

    @JsonProperty("attribute24")
    private String attribute24;

    @JsonProperty("attribute25")
    private String attribute25;

    @JsonProperty("attribute26")
    private String attribute26;

    @JsonProperty("attribute27")
    private String attribute27;

    @JsonProperty("attribute28")
    private String attribute28;

    @JsonProperty("attribute29")
    private String attribute29;

    @JsonProperty("attribute30")
    private String attribute30;

    @JsonProperty("last_update_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date lastUpdateDate;

    @JsonProperty("last_updated_by")
    private String lastUpdatedBy;

    @JsonProperty("creation_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date creationDate;

    @JsonProperty("created_by")
    private String createdBy;

    @JsonProperty("active_start_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date activeStartDate;

    @JsonProperty("active_end_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date activeEndDate;

    @JsonProperty("inv_master_organization_id")
    private String invMasterOrganizationId;

    @JsonProperty("inv_organization_id")
    private String invOrganizationId;

    @JsonProperty("network_asset_flag")
    private String networkAssetFlag;

    @JsonProperty("instantiation_flag")
    private String instantiationFlag;
}
