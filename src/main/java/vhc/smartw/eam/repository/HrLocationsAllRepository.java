package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.HrLocationsAll;
@Repository
public interface HrLocationsAllRepository extends JpaRepository<HrLocationsAll,Long> {
}
