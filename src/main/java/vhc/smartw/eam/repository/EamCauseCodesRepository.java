package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.EamCauseCodes;
@Repository
public interface EamCauseCodesRepository extends JpaRepository<EamCauseCodes,String> {
}
