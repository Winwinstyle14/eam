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
@Table(name = "HR_ALL_ORGANIZATION_UNITS")
public class HrAllOrganizationUnits {
    @Id
    @Column(name = "ORGANIZATION_ID")
    private Long organizationId;

    @Column(name = "ORGANIZATION_NAME")
    private String organizationName;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;

    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "CREATION_DATE")
    private Date creationDate;
}
