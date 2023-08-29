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
public class FndDescrFlexContextsVlId {
    @JsonProperty("application_id")
    private Long applicationId;

    @JsonProperty("descriptive_flex_context_code")
    private String descriptiveFlexContextCode;

    @JsonProperty("descriptive_flexfield_name")
    private String descriptiveFlexfieldName;
}
