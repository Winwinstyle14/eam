package vhc.smartw.eam.repository;

import vhc.smartw.eam.entity.MtlSystemItemB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MtlSystemItemBRepository extends JpaRepository<MtlSystemItemB,Long> {
}
