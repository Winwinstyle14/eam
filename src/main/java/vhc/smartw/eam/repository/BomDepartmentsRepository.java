package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.BomDepartments;
@Repository
public interface BomDepartmentsRepository extends JpaRepository<BomDepartments,Long> {
}
