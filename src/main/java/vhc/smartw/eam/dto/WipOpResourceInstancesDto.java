package vhc.smartw.eam.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import lombok.*;
import vhc.smartw.eam.config.Constants;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WipOpResourceInstancesDto {
    @JsonProperty("ORGANIZATION_ID")
    private Long organizationId;
    @JsonProperty("OPERATION_SEQ_NUM")
    private Long operationSeqNum;
    @JsonProperty("WIP_ENTITY_ID")
    private Long wipEntityId;
    @JsonProperty("RESOURCE_SEQ_NUM")
    private Long resourceSeqNum;
    @JsonProperty("LAST_UPDATE_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date lastUpdateDate;
    @JsonProperty("LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @JsonProperty("CREATION_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date creationDate;
    @JsonProperty("CREATED_BY")
    private String createdBy;
    @JsonProperty("INSTANCE_ID")
    private Long instanceId;
    @JsonProperty("SERIAL_NUMBER")
    private String serialNumber;
    @JsonProperty("START_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date startDate;
    @JsonProperty("COMPLETION_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date completionDate;
}
