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
public class BomDepartmentClassesId {
    @JsonProperty("department_class_code")
    private String departmentClassCode;
    @JsonProperty("organization_id")
    private Long organizationId;
}
