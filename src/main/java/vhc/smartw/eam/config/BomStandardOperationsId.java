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
public class BomStandardOperationsId {
    @JsonProperty("standard_operation_id")
    private Long standardOperationId;
    @JsonProperty("operation_code")
    private String operationCode;
    @JsonProperty("operation_description")
    private String operationDescription;
}
