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
public class MtlObjectGenealogyDto {
    @NotNull
    @JsonProperty("object_id")
    private Long objectId;
    @JsonProperty("object_type")
    private Long objectType;
    @JsonProperty("parent_object_type")
    private Long parentObjectType;
    @JsonProperty("parent_object_id")
    private Long parentObjectId;
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
    @JsonProperty("start_date_active")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date startDateActive;
    @JsonProperty("end_date_active")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date endDateActive;
    @JsonProperty("genealogy_origin")
    private Long genealogyOrigin;
    @JsonProperty("originTxn_id")
    private Long originTxnId;
    @JsonProperty("genealogy_type")
    private Long genealogyType;
    @JsonProperty("last_update_login")
    private Long lastUpdateLogin;
    @JsonProperty("attribute_category")
    private String attributeCategory;
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
    @JsonProperty("request_id")
    private Long requestId;
    @JsonProperty("program_application_id")
    private Long programApplicationId;
    @JsonProperty("program_id")
    private Long programId;
    @JsonProperty("program_update_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date programUpdateDate;
    @JsonProperty("update_txn_id")
    private Long updateTxnId;
    @JsonProperty("object_type2")
    private Long objectType2;
    @JsonProperty("object_id2")
    private Long objectId2;
    @JsonProperty("parent_object_type2")
    private Long parentObjectType2;
    @JsonProperty("parent_object_id2")
    private Long parentObjectId2;
}
