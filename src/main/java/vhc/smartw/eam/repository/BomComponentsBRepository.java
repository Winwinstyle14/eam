package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.BomComponentsB;
@Repository
public interface BomComponentsBRepository extends JpaRepository<BomComponentsB,Long> {
}
