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
@Table(name = "FA_ADDITIONS_B")
public class FaAdditionsB {
    @Id
    @Column(name = "ASSET_ID")
    private Long assetId;
    @Column(name = "ASSET_NUMBER")
    private String assetNumber;
    @Column(name = "ASSET_CATEGORY_ID")
    private Long assetCategoryId;
    @Column(name = "ATTRIBUTE_CATEGORY_CODE")
    private String attributeCategoryCode;
    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "CREATION_DATE")
    private Date creationDate;
    @Column(name = "CREATED_BY")
    private String createdBy;
}
