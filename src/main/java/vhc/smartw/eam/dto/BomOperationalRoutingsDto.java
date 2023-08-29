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
public class BomOperationalRoutingsDto {
    @NotNull
    @JsonProperty("routing_sequence_id")
    private Long routingSequenceId;
    @NotNull
    @JsonProperty("assembly_item_id")
    private Long assemblyItemId;
    @NotNull
    @JsonProperty("organization_id")
    private Long organizationId;
    @NotNull
    @JsonProperty("routing_type")
    private Long routingType;
    @JsonProperty("alternate_routing_designator")
    private String alternateRoutingDesignator;
    @NotNull
    @JsonProperty("common_routing_sequence_id")
    private Long commonRoutingSequenceId;
    @JsonProperty("common_assembly_item_id")
    private Long commonAssemblyItemId;
    @JsonProperty("routing_comment")
    private String routingComment;
    @JsonProperty("completion_subinventory")
    private String completionSubinventory;
    @JsonProperty("completion_locator_id")
    private Long completionLocatorId;
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
