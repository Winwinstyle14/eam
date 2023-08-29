package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.PerRatingLevels;
@Repository
public interface PerRatingLevelsRepository extends JpaRepository<PerRatingLevels,Long> {
}
