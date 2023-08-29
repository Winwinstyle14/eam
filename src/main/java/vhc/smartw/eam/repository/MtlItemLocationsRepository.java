package vhc.smartw.eam.repository;

import vhc.smartw.eam.entity.MtlItemLocations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MtlItemLocationsRepository extends JpaRepository<MtlItemLocations,Long> {
}
