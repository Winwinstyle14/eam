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
@EqualsAndHashCode
@Builder
public class MtlEamAssetAttrGroupsVId {
    @JsonProperty("association_id")
    private Long associationId;
    @JsonProperty("application_id")
    private Long applicationId;
    @JsonProperty("descriptive_flex_context_code")
    private String descriptiveFlexContextCode;
    @JsonProperty("descriptive_flexfield_name")
    private String descriptiveFlexfieldName;
}
