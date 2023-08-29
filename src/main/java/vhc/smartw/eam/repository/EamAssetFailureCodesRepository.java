package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.EamAssetFailureCodes;

import java.util.Optional;

@Repository
public interface EamAssetFailureCodesRepository extends JpaRepository<EamAssetFailureCodes,Long> {

    @Query(value = "select * from EAM_ASSET_FAILURE_CODES  " +
            "where FAILURE_ID = :failureId " +
            "and FAILURE_ENTRY_ID = :failureEntryId " +
            "and FAILURE_CODE = :failureCode " +
            "and RESOLUTION_CODE = :resolutionCode " +
            "and CAUSE_CODE = :causeCode " , nativeQuery = true)
    Optional<EamAssetFailureCodes> findByCheckUnique(
            @Param("failureId") Long failureId,
            @Param("failureEntryId") Long failureEntryId,
            @Param("failureCode") String failureCode,
            @Param("causeCode") String causeCode,
            @Param("resolutionCode") String resolutionCode
    );
}
