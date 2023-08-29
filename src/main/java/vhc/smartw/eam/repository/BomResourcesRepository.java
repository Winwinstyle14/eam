package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.BomResources;

@Repository
public interface BomResourcesRepository extends JpaRepository<BomResources,Long> {
}
