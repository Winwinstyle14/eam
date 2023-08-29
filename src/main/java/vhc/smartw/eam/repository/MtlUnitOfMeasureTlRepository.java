package vhc.smartw.eam.repository;

import vhc.smartw.eam.entity.MtlUnitOfMeasureTl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MtlUnitOfMeasureTlRepository extends JpaRepository<MtlUnitOfMeasureTl,String> {
}
