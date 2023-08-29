package vhc.smartw.eam.repository;

import vhc.smartw.eam.entity.MtlSecondaryInventories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MtlSecondaryInventoriesRepository extends JpaRepository<MtlSecondaryInventories,String> {
}
