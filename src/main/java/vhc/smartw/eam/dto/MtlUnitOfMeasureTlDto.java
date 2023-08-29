package vhc.smartw.eam.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import vhc.smartw.eam.config.Constants;

import java.util.Date;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MtlUnitOfMeasureTlDto {
    @NotNull
    @JsonProperty("uom_code")
    private String uomCode;
    @NotNull
    @JsonProperty("unit_of_measure")
    private String unitOfMeasure;
    @NotNull
    @JsonProperty("description")
    private String description;
    @JsonProperty("disable_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date disableDate;
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
    @JsonProperty("language")
    private String language;
    @JsonProperty("source_lang")
    private String sourceLang;
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
    @JsonProperty("inactive_on")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date inactiveOn;
    @JsonProperty("classs")
    private String classs;
    @JsonProperty("base_unit")
    private String baseUnit;
}
