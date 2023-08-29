package vhc.smartw.eam.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import vhc.smartw.eam.config.Constants;
import vhc.smartw.eam.config.MtlSerialNumbersId;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MtlSerialNumbersDto {
    @NotNull
    @JsonProperty("mtl_serial_numbers_id")
    private MtlSerialNumbersId mtlSerialNumbersId;
    @JsonProperty("current_status")
    private Long currentStatus;
    @JsonProperty("last_update_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date lastUpdateDate;
    @JsonProperty("last_updated_by")
    private String lastUpdatedBy;
    @JsonProperty("created_by")
    private String createdBy;
    @JsonProperty("creation_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date creationDate;
    @JsonProperty("lot_number")
    private String lotNumber;
    @JsonProperty("current_subinventory_code")
    private String currentSubinventoryCode;
    @JsonProperty("current_locator_id")
    private Long currentLocatorId;
    @JsonProperty("group_mark_id")
    private Long GroupMarkId;
    @JsonProperty("line_mark_id")
    private Long lineMarkId;
    @JsonProperty("lot_line_mark_id")
    private Long lotLineMarkId;
    @NotNull
    @JsonProperty("gen_object_id")
    private Long genObjectId;
    @JsonProperty("status_id")
    private Long statusId;
    @JsonProperty("previous_status")
    private Long previousStatus;
    @JsonProperty("wip_accounting_class_code")
    private String wipAccountingClassCode;
    @JsonProperty("eam_location_id")
    private Long eamLocationId;
    @JsonProperty("owning_organization_id")
    private Long owningOrganizationId;
    @JsonProperty("eam_instantiation_flag")
    private String eamInstantiationFlag;
    @JsonProperty("eam_linear_location_id")
    private Long eamLinearLocationId;
}
