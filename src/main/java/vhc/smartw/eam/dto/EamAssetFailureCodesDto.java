package vhc.smartw.eam.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import vhc.smartw.eam.config.Constants;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EamAssetFailureCodesDto {
    @JsonProperty("FAILURE_ID")
    private Long failureId;

    @JsonProperty("FAILURE_ENTRY_ID")
    private Long failureEntryId;

    @JsonProperty("COMBINATION_ID")
    private Long combinationId;

    @JsonProperty("FAILURE_CODE")
    private String failureCode;

    @JsonProperty("CAUSE_CODE")
    private String causeCode;

    @JsonProperty("RESOLUTION_CODE")
    private String resolutionCode;

    @JsonProperty("COMMENTS")
    private String comments;

    @JsonProperty("CREATED_BY")
    private String createdBy;

    @JsonProperty("CREATION_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date creationDate;

    @JsonProperty("LAST_UPDATED_BY")
    private String lastUpdatedBy;

    @JsonProperty("LAST_UPDATE_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private Date lastUpdateDate;
}
