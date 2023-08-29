package vhc.smartw.eam.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import vhc.smartw.eam.config.Constants;
import vhc.smartw.eam.config.MtlSystemItemBId;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MtlSystemItemBDto {
    @NotNull
    @JsonProperty("mtl_system_item_b_id")
    private MtlSystemItemBId mtlSystemItemBId;
    @JsonProperty("segment1")
    private String segment1;
    @JsonProperty("segment2")
    private String segment2;
    @JsonProperty("segment3")
    private String segment3;
    @JsonProperty("segment4")
    private String segment4;
    @JsonProperty("description")
    private String description;
    @JsonProperty("primary_uom_code")
    private String primaryUomCode;
    @JsonProperty("primary_unit_of_measure")
    private String primaryUnitOfMeasure;
    @JsonProperty("inventory_item_status_code")
    private String inventoryItemStatusCode;
    @JsonProperty("lot_control_code")
    private Long lotControlCode;
    @JsonProperty("auto_lot_alpha_prefix")
    private String autoLotAlphaPrefix;
    @JsonProperty("start_auto_lot_number")
    private String startAutoLotNumber;
    @JsonProperty("serial_number_control_code")
    private Long serialNumberControlCode;
    @JsonProperty("auto_serial_alpha_prefix")
    private String autoSerialAlphaPrefix;
    @JsonProperty("start_auto_serial_number")
    private String startAutoSerialNumber;
    @JsonProperty("eam_item_type")
    private Long eamItemType;
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
    @JsonProperty("last_updated_by")
    private String lastUpdatedBy;
    @JsonProperty("last_update_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date lastUpdateDate;
    @JsonProperty("created_by")
    private String createdBy;
    @JsonProperty("creation_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date creationDate;
}
