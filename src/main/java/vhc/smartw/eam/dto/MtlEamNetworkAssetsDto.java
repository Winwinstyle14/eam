package vhc.smartw.eam.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import vhc.smartw.eam.config.Constants;
import vhc.smartw.eam.config.MtlNetworkAssetsId;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MtlEamNetworkAssetsDto {
    @NotNull
    @JsonProperty("mtl_network_assets_id")
    private MtlNetworkAssetsId mtlNetworkAssetsId;

    @JsonProperty("serial_number")
    private String serialNumber;

    @JsonProperty("organization_id")
    private Long organizationId;

    @JsonProperty("networkItem_id")
    private Long networkItemId;

    @JsonProperty("network_serial_number")
    private String networkSerialNumber;

    @JsonProperty("start_date_active")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date startDateActive;

    @JsonProperty("end_date_active")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date endDateActive;

    @JsonProperty("network_object_type")
    private Long networkObjectType;

    @JsonProperty("network_object_id")
    private Long networkObjectId;

    @JsonProperty("maintenance_object_type")
    private Long maintenanceObjectType;

    @JsonProperty("maintenance_object_id")
    private Long maintenanceObjectId;

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
}
