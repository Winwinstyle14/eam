package vhc.smartw.eam.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@Builder
@EqualsAndHashCode
public class BomOperationResourcesId {
    @JsonProperty("operation_sequence_id")
    private Long operationSequenceId;
    @JsonProperty("resource_seq_num")
    private Long resourceSeqNum;
    @JsonProperty("resource_id")
    private Long resourceId;
}
