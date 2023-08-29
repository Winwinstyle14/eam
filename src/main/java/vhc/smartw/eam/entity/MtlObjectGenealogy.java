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
@Table(name = "MTL_OBJECT_GENEALOGY")
public class MtlObjectGenealogy {
    @Id
    @Column(name = "OBJECT_ID")
    private Long objectId;
    @Column(name = "OBJECT_TYPE")
    private Long objectType;
    @Column(name = "PARENT_OBJECT_TYPE")
    private Long parentObjectType;
    @Column(name = "PARENT_OBJECT_ID")
    private Long parentObjectId;
    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "CREATION_DATE")
    private Date creationDate;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "START_DATE_ACTIVE")
    private Date startDateActive;
    @Column(name = "END_DATE_ACTIVE")
    private Date endDateActive;
    @Column(name = "GENEALOGY_ORIGIN")
    private Long genealogyOrigin;
    @Column(name = "ORIGIN_TXN_ID")
    private Long originTxnId;
    @Column(name = "GENEALOGY_TYPE")
    private Long genealogyType;
    @Column(name = "LAST_UPDATE_LOGIN")
    private Long lastUpdateLogin;
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
    @Column(name = "REQUEST_ID")
    private Long requestId;
    @Column(name = "PROGRAM_APPLICATION_ID")
    private Long programApplicationId;
    @Column(name = "PROGRAM_ID")
    private Long programId;
    @Column(name = "PROGRAM_UPDATE_DATE")
    private Date programUpdateDate;
    @Column(name = "UPDATE_TXN_ID")
    private Long updateTxnId;
    @Column(name = "OBJECT_TYPE2")
    private Long objectType2;
    @Column(name = "OBJECT_ID2")
    private Long objectId2;
    @Column(name = "PARENT_OBJECT_TYPE2")
    private Long parentObjectType2;
    @Column(name = "PARENT_OBJECT_ID2")
    private Long parentObjectId2;
}
