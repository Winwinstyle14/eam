package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.MfgLookups;
@Repository
public interface MfgLookupsRepository extends JpaRepository<MfgLookups,Long> {
}
