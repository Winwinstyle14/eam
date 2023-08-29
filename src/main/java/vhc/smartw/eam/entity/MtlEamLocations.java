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
@Table(name = "MTL_EAM_LOCATIONS")
public class MtlEamLocations {
    @Id
    @Column(name = "LOCATION_ID")
    private Long locationId;
    @Column(name = "ORGANIZATION_ID")
    private Long organizationId;
    @Column(name = "LOCATION_CODES")
    private String locationCodes;
    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "CREATION_DATE")
    private Date creationDate;
    @Column(name = "DESCRIPTION")
    private String description;
}
