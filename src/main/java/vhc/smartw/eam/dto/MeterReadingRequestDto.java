package vhc.smartw.eam.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import vhc.smartw.eam.config.Constants;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MeterReadingRequestDto {
    @NotNull
    @JsonProperty("START_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private LocalDate startDate;

    @NotNull
    @JsonProperty("END_DATE")
    @JsonFormat(pattern = Constants.DATE_FORMAT)
    private LocalDate endDate;
}
