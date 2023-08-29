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
public class FndDescrFlexColUsageVlId {
    @NotNull
    @JsonProperty("application_id")
    private Long applicationId;

    @NotNull
    @JsonProperty("descriptive_flex_context_code")
    private String descriptiveFlexContextCode;

    @NotNull
    @JsonProperty("application_column_name")
    private String applicationColumnName;

    @NotNull
    @JsonProperty("descriptive_flexfield_name")
    private String descriptiveFlexfieldName;
}
