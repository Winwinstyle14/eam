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
@Table(name = "BOM_OPERATIONAL_ROUTINGS")
public class BomOperationalRoutings {
    @Id
    @Column(name = "ROUTING_SEQUENCE_ID")
    private Long routingSequenceId;
    @Column(name = "ASSEMBLY_ITEM_ID")
    private Long assemblyItemId;
    @Column(name = "ORGANIZATION_ID")
    private Long organizationId;
    @Column(name = "ROUTING_TYPE")
    private Long routingType;
    @Column(name = "ALTERNATE_ROUTING_DESIGNATOR")
    private String alternateRoutingDesignator;
    @Column(name = "COMMON_ROUTING_SEQUENCE_ID")
    private Long commonRoutingSequenceId;
    @Column(name = "COMMON_ASSEMBLY_ITEM_ID")
    private Long commonAssemblyItemId;
    @Column(name = "ROUTING_COMMENT")
    private String routingComment;
    @Column(name = "COMPLETION_SUBINVENTORY")
    private String completionSubinventory;
    @Column(name = "COMPLETION_LOCATOR_ID")
    private Long completionLocatorId;
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
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "CREATION_DATE")
    private Date creationDate;
}
