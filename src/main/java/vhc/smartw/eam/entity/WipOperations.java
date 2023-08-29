package vhc.smartw.eam.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;

import lombok.Getter;

import lombok.NoArgsConstructor;

import lombok.Setter;


import java.util.Date;

import java.util.HashSet;

import java.util.List;

import java.util.Set;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "WIP_OPERATIONS")
public class WipOperations {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ORGANIZATION_ID", unique = true)
    private Long organizationId;

    @Column(name = "WIP_ENTITY_ID", unique = true)
    private Long wipEntityId;

    @Column(name = "OPERATION_SEQ_NUM", unique = true)
    private Long operationSeqNum;

    @Column(name = "REPETITIVE_SCHEDULE_ID", unique = true)
    private Long repetitiveScheduleId;

    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;

    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;

    @Column(name = "CREATION_DATE")
    private Date creationDate;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "OPERATION_SEQUENCE_ID")
    private Long operationSequenceId;

    @Column(name = "STANDARD_OPERATION_ID")
    private Long standardOperationId;

    @Column(name = "DEPARTMENT_ID")
    private Long departmentId;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "SCHEDULED_QUANTITY")
    private Long scheduledQuantity;

    @Column(name = "QUANTITY_IN_QUEUE")
    private Long quantityInQueue;

    @Column(name = "QUANTITY_RUNNING")
    private Long quantityRunning;

    @Column(name = "QUANTITY_WAITING_TO_MOVE")
    private Long quantityWaitingToMove;

    @Column(name = "QUANTITY_REJECTED")
    private Long quantityRejected;

    @Column(name = "QUANTITY_SCRAPPED")
    private Long quantityScrapped;

    @Column(name = "QUANTITY_COMPLETED")
    private Long quantityCompleted;

    @Column(name = "FIRST_UNIT_START_DATE")
    private Date firstUnitStartDate;

    @Column(name = "FIRST_UNIT_COMPLETION_DATE")
    private Date firstUnitCompletionDate;

    @Column(name = "LAST_UNIT_START_DATE")
    private Date lastUnitStartDate;

    @Column(name = "LAST_UNIT_COMPLETION_DATE")
    private Date lastUnitCompletionDate;

    @Column(name = "PREVIOUS_OPERATION_SEQ_NUM")
    private Long previousOperationSeqNum;

    @Column(name = "NEXT_OPERATION_SEQ_NUM")
    private Long nextOperationSeqNum;

    @Column(name = "COUNT_POINT_TYPE")
    private Long countPointType;

    @Column(name = "BACKFLUSH_FLAG")
    private Long backflushFlag;

    @Column(name = "MINIMUM_TRANSFER_QUANTITY")
    private Long minimumTransferQuantity;

    @Column(name = "DATE_LAST_MOVED")
    private Date dateLastMoved;

    @Column(name = "ATTRIBUTE_CATEGORY")
    private String attributeCategory;

    @Column(name = "ATTRIBUTE1")
    private String attribute1;

    @Column(name = "ATTRIBUTE2")
    private String attribute2;

    @Column(name = "ATTRIBUTE3")
    private String attribute3;

    @Column(name = "ATTRIBUTE4")
    private String attribute4;

    @Column(name = "ATTRIBUTE5")
    private String attribute5;

    @Column(name = "ATTRIBUTE6")
    private String attribute6;

    @Column(name = "ATTRIBUTE7")
    private String attribute7;

    @Column(name = "ATTRIBUTE8")
    private String attribute8;

    @Column(name = "ATTRIBUTE9")
    private String attribute9;

    @Column(name = "ATTRIBUTE10")
    private String attribute10;

    @Column(name = "ATTRIBUTE11")
    private String attribute11;

    @Column(name = "ATTRIBUTE12")
    private String attribute12;

    @Column(name = "ATTRIBUTE13")
    private String attribute13;

    @Column(name = "ATTRIBUTE14")
    private String attribute14;

    @Column(name = "ATTRIBUTE15")
    private String attribute15;

    @Column(name = "OPERATION_YIELD")
    private Long operationYield;

    @Column(name = "OPERATION_YIELD_ENABLED")
    private Long operationYieldEnabled;

    @Column(name = "PRE_SPLIT_QUANTITY")
    private Long preSplitQuantity;

    @Column(name = "OPERATION_COMPLETED")
    private String operationCompleted;

    @Column(name = "SHUTDOWN_TYPE")
    private String shutdownType;

    /*
    @ManyToOne
    @JoinColumn(name = "WIP_ENTITY_ID",updatable = false,insertable = false)
    private WipEntities wipEntities;
    */
}