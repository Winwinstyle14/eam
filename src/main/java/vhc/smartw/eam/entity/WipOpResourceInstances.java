package vhc.smartw.eam.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
@Table(name = "WIP_OP_RESOURCE_INSTANCES")
public class WipOpResourceInstances {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "ORGANIZATION_ID")
    private Long organizationId;
    @Column(name = "OPERATION_SEQ_NUM",unique = true)
    private Long operationSeqNum;
    @Column(name = "WIP_ENTITY_ID",unique = true)
    private Long wipEntityId;
    @Column(name = "RESOURCE_SEQ_NUM", unique = true)
    private Long resourceSeqNum;
    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "CREATION_DATE")
    private Date creationDate;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "INSTANCE_ID", unique = true)
    private Long instanceId;
    @Column(name = "SERIAL_NUMBER", unique = true)
    private String serialNumber;
    @Column(name = "START_DATE")
    private Date startDate;
    @Column(name = "COMPLETION_DATE")
    private Date completionDate;
}
