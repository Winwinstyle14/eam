package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.EamFailureCombinations;
@Repository
public interface EamFailureCombinationsRepository extends JpaRepository<EamFailureCombinations,Long> {
}
