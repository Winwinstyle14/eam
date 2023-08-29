package vhc.smartw.eam.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name = "HR_LOCATIONS_ALL")
public class HrLocationsAll {
    @Id
    @Column(name = "LOCATION_ID")
    private Long locationId;
    @Column(name = "LOCATION_CODE")
    private String locationCode;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "SHIP_TO_LOCATION_ID")
    private Long shipToLocationId;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "CREATION_DATE")
    private Date creationDate;

}
