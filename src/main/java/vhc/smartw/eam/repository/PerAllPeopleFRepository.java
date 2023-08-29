package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.PerAllPeopleF;
@Repository
public interface PerAllPeopleFRepository extends JpaRepository<PerAllPeopleF,Long> {
}
