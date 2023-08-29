package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.BomStructuresB;
@Repository
public interface BomStructuresBRepository extends JpaRepository<BomStructuresB,Long> {
}
