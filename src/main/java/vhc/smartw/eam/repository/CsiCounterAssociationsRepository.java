package vhc.smartw.eam.repository;

import vhc.smartw.eam.entity.CsiCounterAssociations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CsiCounterAssociationsRepository extends JpaRepository<CsiCounterAssociations,Long> {
}
