package vhc.smartw.eam.repository;

import vhc.smartw.eam.entity.CsiItemInstance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CsiItemInstanceRepository extends JpaRepository<CsiItemInstance,String> {
}
