package vhc.smartw.eam.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "EAM_METER_READING")
public class EamMeterReading {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "SITE_NAME")
    private String siteName;

    @Column(name = "CSHT_CODE")
    private String cshtCode;

    @Column(name = "START_DATE")
    private Date startDate;

    @Column(name = "END_DATE")
    private Date endDate;

    @Column(name = "EAM_PUSH")
    private Long eamPush;

    @Column(name = "ERROR_CODE")
    private String errorCode;

    @Column(name = "ERROR_MESSAGE")
    private String errorMessage;

    @Column(name = "UK_ALARM_KEY")
    private String ukAlarmKey;
}
