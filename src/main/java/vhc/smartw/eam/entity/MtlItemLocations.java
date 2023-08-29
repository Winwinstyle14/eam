package vhc.smartw.eam.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vhc.smartw.eam.config.MtlItemCategoriesId;
import vhc.smartw.eam.config.MtlItemLocationsId;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "MTL_ITEM_LOCATIONS")
public class MtlItemLocations {
    @EmbeddedId
    private MtlItemLocationsId mtlItemLocationsId;
    @Column(name = "SEGMENT1")
    private String segment1;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "DISABLE_DATE")
    private Date disableDate;
    @Column(name = "SUBINVENTORY_CODE")
    private String subinventoryCode;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "CREATION_DATE")
    private Date creationDate;
}
