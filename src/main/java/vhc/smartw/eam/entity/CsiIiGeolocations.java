package vhc.smartw.eam.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CSI_II_GEOLOCATIONS")
public class CsiIiGeolocations {
    @Id
    @Column(name = "INSTANCE_ID")
    private Long instanceId;
    @Column(name = "INST_LATITUDE")
    private Long instLatitude;
    @Column(name = "INST_LONGITUDE")
    private Long instLongitude;
    @Column(name = "VALID_FLAG")
    private String validFlag;
    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "CREATION_DATE")
    private Date creationDate;
    @Column(name = "CREATED_BY")
    private String createdBy;
}
