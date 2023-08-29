package vhc.smartw.eam.repository;

import vhc.smartw.eam.entity.HrAllOrganizationUnits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HrAllOrganizationUnitsRepository extends JpaRepository<HrAllOrganizationUnits,Long> {
}
