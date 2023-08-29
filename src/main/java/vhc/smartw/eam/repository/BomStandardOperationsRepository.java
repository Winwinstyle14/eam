package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.BomStandardOperations;
@Repository
public interface BomStandardOperationsRepository extends JpaRepository<BomStandardOperations,Long> {
}
