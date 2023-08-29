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
public class MtlItemLocationsDtoFlat {
    @NotNull
    @JsonProperty("inventory_location_id")
    private Long inventoryLocationId;

    @NotNull
    @JsonProperty("organization_id")
    private Long organizationId;

    @JsonProperty("segment1")
    private String segment1;

    @JsonProperty("description")
    private String description;

    @JsonProperty("disable_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date disableDate;

    @JsonProperty("subinventory_code")
    private String subinventoryCode;

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
