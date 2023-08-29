package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.EamResolutionCodes;
@Repository
public interface EamResolutionCodesRepository extends JpaRepository<EamResolutionCodes,String> {
}
