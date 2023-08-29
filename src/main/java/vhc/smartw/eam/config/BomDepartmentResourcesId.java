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
public class BomDepartmentResourcesId {

    @JsonProperty("department_id")
    private Long departmentId;
    @JsonProperty("resource_id")
    private Long resourceId;
}
