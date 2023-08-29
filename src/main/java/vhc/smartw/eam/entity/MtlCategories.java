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
@Table(name = "MTL_CATEGORIES")
public class MtlCategories {
    @Id
    @Column(name = "CATEGORY_ID")
    private Long categoryId;
    @Column(name = "STRUCTURE_ID")
    private Long structureId;
    @Column(name = "SEGMENT1")
    private String segment1;
    @Column(name = "SEGMENT2")
    private String segment2;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "CREATION_DATE")
    private Date creationDate;
}
