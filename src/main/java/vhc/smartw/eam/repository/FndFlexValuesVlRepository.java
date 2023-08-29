package vhc.smartw.eam.repository;

import vhc.smartw.eam.entity.FndFlexValuesVl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FndFlexValuesVlRepository extends JpaRepository<FndFlexValuesVl,Long> {
}
