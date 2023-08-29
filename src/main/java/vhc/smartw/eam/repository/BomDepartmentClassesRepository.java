package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.BomDepartmentClasses;
@Repository
public interface BomDepartmentClassesRepository extends JpaRepository<BomDepartmentClasses,Long> {
}
