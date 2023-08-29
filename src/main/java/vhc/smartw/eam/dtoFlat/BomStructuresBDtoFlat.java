package vhc.smartw.eam.dtoFlat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import vhc.smartw.eam.config.BomStructuresBId;
import vhc.smartw.eam.config.Constants;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BomStructuresBDtoFlat {
    @NotNull
    @JsonProperty("bill_sequence_id")
    private Long billSequenceId;
    @NotNull
    @JsonProperty("assembly_item_id")
    private Long assemblyItemId;
    @JsonProperty("alternate_bom_designator")
    private String alternateBomDesignator;
    @NotNull
    @JsonProperty("organization_id")
    private Long organizationId;
    @NotNull
    @JsonProperty("assembly_type")
    private Long assemblyType;
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
    @JsonProperty("common_bill_sequence_id")
    private Long commonBillSequenceId;
    @JsonProperty("common_assembly_item_id")
    private Long commonAssemblyItemId;
    @JsonProperty("specific_assembly_comment")
    private String specificAssemblyComment;
    @JsonProperty("pending_from_ecn")
    private String pendingFromEcn;
    @JsonProperty("pk1_value")
    private String pk1Value;
    @JsonProperty("pk2_value")
    private String pk2Value;
    @JsonProperty("pk3_value")
    private String pk3Value;
    @JsonProperty("pk4_value")
    private String pk4Value;
    @JsonProperty("pk5_value")
    private String pk5Value;
    @JsonProperty("effectivity_control")
    private Long effectivityControl;
    @JsonProperty("is_preferred")
    private String isPreferred;
    @JsonProperty("source_bill_sequence_id")
    private Long sourceBillSequenceId;
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
