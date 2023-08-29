package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.MtlEamNetworkAssets;
@Repository
public interface MtlNetworkAssetsRepository extends JpaRepository<MtlEamNetworkAssets,Long> {
}
