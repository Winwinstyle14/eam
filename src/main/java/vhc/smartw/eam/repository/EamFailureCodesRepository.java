package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.EamFailureCodes;
@Repository
public interface EamFailureCodesRepository extends JpaRepository<EamFailureCodes,String> {
}
