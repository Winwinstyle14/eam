package vhc.smartw.eam.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import vhc.smartw.eam.config.Constants;
import vhc.smartw.eam.config.EamOrgMaintDefaultsID;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EamOrgMaintDefaultsDto {
    @NotNull
    @JsonProperty("eam_orgmaintdefaultsid")
    private EamOrgMaintDefaultsID eamOrgMaintDefaultsID;
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
