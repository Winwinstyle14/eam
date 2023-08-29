package vhc.smartw.eam.dtoFlat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import vhc.smartw.eam.config.BomOperationSequencesId;
import vhc.smartw.eam.config.Constants;

import java.util.Date;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BomOperationSequencesDtoFlat {
    @NotNull
    @JsonProperty("operation_sequence_id")
    private Long operationSequenceId;
    @NotNull
    @JsonProperty("routing_sequence_id")
    private Long routingSequenceId;
    @NotNull
    @JsonProperty("operation_seq_num")
    private Long operationSeqNum;
    @JsonProperty("bom_operation_sequences")
    private Long bomOperationSequences;
    @JsonProperty("reference_flag")
    private Long referenceFlag;
    @NotNull
    @JsonProperty("department_id")
    private Long departmentId;
    @JsonProperty("option_dependent_flag")
    private Long optionDependentFlag;
    @JsonProperty("operation_leadTime_percent")
    private Long operationLeadTimePercent;
    @JsonProperty("minimum_transfer_quantity")
    private Long minimumTransferQuantity;
    @NotNull
    @JsonProperty("count_point_type")
    private Long countPointType;
    @JsonProperty("operation_description")
    private String operationDescription;
    @NotNull
    @JsonProperty("effectivity_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date effectivityDate;
    @JsonProperty("disable_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date disableDate;
    @NotNull
    @JsonProperty("backflush_flag")
    private Long backflushFlag;
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
    @JsonProperty("operation_type")
    private Long operationType;
    @JsonProperty("process_op_seq_id")
    private Long processOpSeqId;
    @JsonProperty("line_op_seq_id")
    private Long lineOpSeqId;
    @JsonProperty("yield")
    private Long yield;
    @JsonProperty("eco_for_production")
    private Long ecoForProduction;
    @JsonProperty("shutdown_type")
    private String shutdownType;
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
