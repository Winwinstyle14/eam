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
public class MtlEamAssetActivitiesId {
    @JsonProperty("activity_association_id")
    private Long activityAssociationId;
    @JsonProperty("asset_activity_id")
    private Long assetActivityId;
    @JsonProperty("maintenance_object_type")
    private Long maintenanceObjectType;
    @JsonProperty("maintenance_object_id")
    private Long maintenanceObjectId;
}
