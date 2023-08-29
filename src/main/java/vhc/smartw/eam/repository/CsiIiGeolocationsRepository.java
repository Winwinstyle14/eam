package vhc.smartw.eam.repository;

import vhc.smartw.eam.entity.CsiIiGeolocations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CsiIiGeolocationsRepository extends JpaRepository<CsiIiGeolocations,Long> {
}
