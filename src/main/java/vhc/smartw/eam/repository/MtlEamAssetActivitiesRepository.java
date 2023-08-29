package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.MtlEamAssetActivities;
@Repository
public interface MtlEamAssetActivitiesRepository extends JpaRepository<MtlEamAssetActivities,Long> {
}
