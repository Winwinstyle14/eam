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
@Table(name = "PER_ALL_PEOPLE_F")
public class PerAllPeopleF {
    @Id
    @Column(name = "PERSON_ID")
    private Long personId;
    @Column(name = "EMPLOYEE_NUMBER")
    private String employeeNumber;
    @Column(name = "FULL_NAME")
    private String fullName;
    @Column(name = "EFFECTIVE_START_DATE")
    private Date effectiveStartDate;
    @Column(name = "EFFECTIVE_END_DATE")
    private Date effectiveEndDate;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "CREATION_DATE")
    private Date creationDate;
}
