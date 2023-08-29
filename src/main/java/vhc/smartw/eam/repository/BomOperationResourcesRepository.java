package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.BomOperationResources;
@Repository
public interface BomOperationResourcesRepository extends JpaRepository<BomOperationResources,Long> {
}
