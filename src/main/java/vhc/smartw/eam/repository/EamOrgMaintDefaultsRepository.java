package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.EamOrgMaintDefaults;
@Repository
public interface EamOrgMaintDefaultsRepository extends JpaRepository<EamOrgMaintDefaults,Long> {
}
