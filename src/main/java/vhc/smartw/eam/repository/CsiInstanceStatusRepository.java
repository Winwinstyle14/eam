package vhc.smartw.eam.repository;

import vhc.smartw.eam.entity.CsiInstanceStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CsiInstanceStatusRepository extends JpaRepository<CsiInstanceStatus,Long> {
}
