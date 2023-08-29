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
public class EamOrgMaintDefaultsDtoFlat {
    @NotNull
    @JsonProperty("object_type")
    private Long objectType;

    @NotNull
    @JsonProperty("object_id")
    private Long objectId;

    @NotNull
    @JsonProperty("organization_id")
    private Long organizationId;

    @JsonProperty("owning_department_id")
    private Long owningDepartmentId;

    @JsonProperty("area_id")
    private Long areaId;

    @JsonProperty("accounting_class_code")
    private String accountingClassCode;

    @JsonProperty("last_update_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date lastUpdateDate;

    @JsonProperty("last_updated_by")
    private String lastUpdatedby;

    @JsonProperty("created_by")
    private String CREATED_BY;

    @JsonProperty("creation_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date creationDate;
}
