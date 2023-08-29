package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.HzLocations;

@Repository
public interface HzLocationsRepository extends JpaRepository<HzLocations,Long> {
}
