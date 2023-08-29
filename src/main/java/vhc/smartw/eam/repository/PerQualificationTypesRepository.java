package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.PerQualificationTypes;
@Repository
public interface PerQualificationTypesRepository extends JpaRepository<PerQualificationTypes,Long> {
}
