package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.WipEntities;

import java.util.Optional;

@Repository
public interface WipEntitiesRepository extends JpaRepository<WipEntities,Long> {
    Optional<WipEntities> findByWipEntityName(String wipEntityName);
    Optional<WipEntities> findByWipEntityId(Long wipEntityId);
}
