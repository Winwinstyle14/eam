package vhc.smartw.eam.config;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@Builder
@EqualsAndHashCode
public class BomResourceEmployeesId {
    @JsonProperty("resource_id")
    private Long resourceId;
    @JsonProperty("organization_id")
    private Long organizationId;
    @JsonProperty("person_id")
    private Long personId;
    @JsonProperty("effective_start_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date effectiveStartDate;
    @JsonProperty("effective_end_date")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date effectiveEndDate;
    @JsonProperty("instance_id")
    private Long instanceId;
}
