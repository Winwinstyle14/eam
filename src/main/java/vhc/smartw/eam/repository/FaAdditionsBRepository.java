package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.FaAdditionsB;
@Repository
public interface FaAdditionsBRepository extends JpaRepository<FaAdditionsB,Long> {
}
