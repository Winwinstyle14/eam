package vhc.smartw.eam.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@Builder
@EqualsAndHashCode
public class BomResourcesId {

    @JsonProperty("resource_id")
    private Long resourceId;
    @JsonProperty("resource_code")
    private String resourceCode;
    @JsonProperty("organization_id")
    private Long organizationId;
    @JsonProperty("cost_code_type")
    private Long costCodeType;

}
