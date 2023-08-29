package vhc.smartw.eam.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@Builder
@EqualsAndHashCode
public class BomStructuresBId {
    @JsonProperty("bill_sequence_id")
    private Long billSequenceId;
    @JsonProperty("assembly_item_id")
    private Long assemblyItemId;
}
