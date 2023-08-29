package vhc.smartw.eam.repository;

import vhc.smartw.eam.entity.FndFlexValueSets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FndFlexValueSetsRepository extends JpaRepository<FndFlexValueSets,Long> {
}
