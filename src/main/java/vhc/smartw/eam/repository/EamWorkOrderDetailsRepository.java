package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.EamWorkOrderDetails;

import java.util.Optional;

@Repository
public interface EamWorkOrderDetailsRepository extends JpaRepository<EamWorkOrderDetails,Long> {
    Optional<EamWorkOrderDetails> findByWipEntityIdAndOrganizationId(long wipEntityId, long organizationId);
}

