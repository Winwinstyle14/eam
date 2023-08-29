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
@Table(name = "FND_FLEX_VALUE_SETS")
public class FndFlexValueSets {
    @Id
    @Column(name = "FLEX_VALUE_SET_ID")
    private Long flexValueSetId;
    @Column(name = "FLEX_VALUE_SET_NAME")
    private String flexValueSetName;
    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "CREATION_DATE")
    private Date creationDate;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "LAST_UPDATE_LOGIN")
    private Long lastUpdateLogin;
    @Column(name = "VALIDATION_TYPE")
    private String validationType;
    @Column(name = "PROTECTED_FLAG")
    private String protectedFlag;
    @Column(name = "SECURITY_ENABLED_FLAG")
    private String securityEnabledFlag;
    @Column(name = "LONGLIST_FLAG")
    private String longlistFlag;
    @Column(name = "FORMAT_TYPE")
    private String formatType;
    @Column(name = "MAXIMUM_SIZE")
    private Long maximumSize;
    @Column(name = "ALPHANUMERIC_ALLOWED_FLAG")
    private String alphanumericAllowedFlag;
    @Column(name = "UPPERCASE_ONLY_FLAG")
    private String uppercaseOnlyFlag;
    @Column(name = "NUMERIC_MODE_ENABLED_FLAG")
    private String numericModeEnabledFlag;
    @Column(name = "DESCRIPTION")
    private String Description;
    @Column(name = "DEPENDANT_DEFAULT_VALUE")
    private String dependantDefaultValue;
    @Column(name = "DEPENDANT_DEFAULT_MEANING")
    private String dependantDefaultMeaning;
    @Column(name = "PARENT_FLEX_VALUE_SET_ID")
    private Long parentFlexValueSetId;
    @Column(name = "MINIMUM_VALUE")
    private String minimumValue;
    @Column(name = "MAXIMUM_VALUE")
    private String maximumValue;
    @Column(name = "NUMBER_PRECISION")
    private Long numberPrecision;
    @Column(name = "ZD_EDITION_NAME")
    private String zdEditionName;
    @Column(name = "ZD_SYNC")
    private String zdSync;
}
