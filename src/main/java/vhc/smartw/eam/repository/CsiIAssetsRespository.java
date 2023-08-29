package vhc.smartw.eam.repository;

import vhc.smartw.eam.entity.CsiIAssets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CsiIAssetsRespository extends JpaRepository<CsiIAssets,Long> {
}
