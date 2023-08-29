package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.WipDiscreteJobs;
import vhc.smartw.eam.entity.WipEntities;

import java.util.Optional;

@Repository
public interface WipDiscreteJobsRepository extends JpaRepository<WipDiscreteJobs,Long> {
    Optional<WipDiscreteJobs> findByWipEntityIdAndOrganizationId(long wipEntityId, long organizationId);
}
