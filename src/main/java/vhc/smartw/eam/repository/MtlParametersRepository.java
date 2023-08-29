package vhc.smartw.eam.repository;

import vhc.smartw.eam.entity.MtlParameters;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MtlParametersRepository extends JpaRepository<MtlParameters,Long> {
}
