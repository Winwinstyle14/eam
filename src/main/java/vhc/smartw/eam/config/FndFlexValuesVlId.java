package vhc.smartw.eam.config;

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
public class FndFlexValuesVlId {
    @Column(name = "FLEX_VALUE_ID")
    private Long flexValueId;

    @Column(name = "FLEX_VALUE_SET_ID")
    private Long flexValueSetId;

    @Column(name = "FLEX_VALUE")
    private String flexValue;
}
