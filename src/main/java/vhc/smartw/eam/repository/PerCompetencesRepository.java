package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.PerCompetences;

@Repository
public interface PerCompetencesRepository extends JpaRepository<PerCompetences,Long> {
}
