package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.EamFailureSets;
@Repository
public interface EamFailureSetsRepository extends JpaRepository<EamFailureSets,Long> {
}
