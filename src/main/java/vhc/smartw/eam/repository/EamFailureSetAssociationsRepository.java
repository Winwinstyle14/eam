package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.EamFailureSetAssociations;

@Repository
public interface EamFailureSetAssociationsRepository extends JpaRepository<EamFailureSetAssociations,Long> {
}
