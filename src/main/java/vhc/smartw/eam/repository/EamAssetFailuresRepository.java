package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.EamAssetFailures;
import vhc.smartw.eam.entity.WipEntities;

import java.util.Optional;

@Repository
public interface EamAssetFailuresRepository extends JpaRepository<EamAssetFailures,Long> {
    Optional<EamAssetFailures> findBySourceIdAndFailureId(Long sourceId, Long failureId);
}