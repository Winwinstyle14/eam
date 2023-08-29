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
public class BomOperationSequencesId {
    @JsonProperty("operation_sequence_id")
    private Long operationSequenceId;
    @JsonProperty("routing_sequence_id")
    private Long routingSequenceId;
    @JsonProperty("operation_seq_num")
    private Long operationSeqNum;
}
