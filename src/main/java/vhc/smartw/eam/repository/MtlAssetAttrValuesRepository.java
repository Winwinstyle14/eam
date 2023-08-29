package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.MtlEamAssetAttrValues;

@Repository
public interface MtlAssetAttrValuesRepository extends JpaRepository<MtlEamAssetAttrValues,Long> {
}
