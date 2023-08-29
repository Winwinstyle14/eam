package vhc.smartw.eam.dtoFlat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import vhc.smartw.eam.config.BomResourcesId;
import vhc.smartw.eam.config.Constants;

import java.util.Date;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BomResourcesDtoFlat {
    @NotNull
    @JsonProperty("resource_id")
    private Long resourceId;
    @NotNull
    @JsonProperty("resource_code")
    private String resourceCode;
    @NotNull
    @JsonProperty("organization_id")
    private Long organizationId;
    @NotNull
    @JsonProperty("cost_code_type")
    private Long costCodeType;
    @JsonProperty("description")
    private String description;
    @JsonProperty("disable_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date disableDate;
    @NotNull
    @JsonProperty("cost_element_id")
    private Long costElementId;
    @JsonProperty("purchase_item_id")
    private Long purchaseItemId;
    @NotNull
    @JsonProperty("resource_type")
    private Long resourceType;
    @NotNull
    @JsonProperty("functional_currency_flag")
    private Long functionalCurrencyFlag;
    @JsonProperty("expenditure_type")
    private String expenditureType;
    @JsonProperty("supply_subinventory")
    private String supplySubinventory;
    @JsonProperty("supply_locator_id")
    private Long supplyLocatorId;
    @NotNull
    @JsonProperty("unit_of_measure")
    private String unitOfMeasure;
    @JsonProperty("default_activity_id")
    private Long defaultActivityId;
    @JsonProperty("autocharge_type")
    private Long autochargeType;
    @JsonProperty("default_basis_type")
    private Long defaultBasisType;
    @NotNull
    @JsonProperty("allow_costs_flag")
    private Long allowCostsFlag;
    @JsonProperty("competence_id")
    private Long competenceId;
    @JsonProperty("rating_level_id")
    private Long ratingLevelId;
    @JsonProperty("qualification_type_id")
    private Long qualificationTypeId;
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
