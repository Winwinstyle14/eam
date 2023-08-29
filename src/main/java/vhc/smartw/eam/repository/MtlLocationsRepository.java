package vhc.smartw.eam.repository;

import vhc.smartw.eam.entity.MtlEamLocations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MtlLocationsRepository extends JpaRepository<MtlEamLocations,Long> {
}
