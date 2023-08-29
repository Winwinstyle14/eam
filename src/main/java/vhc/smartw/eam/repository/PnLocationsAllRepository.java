package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.PnLocationsAll;
@Repository
public interface PnLocationsAllRepository extends JpaRepository<PnLocationsAll,Long> {
}
