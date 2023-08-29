package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.FndDescriptiveFlexs;
@Repository
public interface FndDescriptiveFlexsRepository extends JpaRepository<FndDescriptiveFlexs,Long> {
}
