package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.BomResourceEquipments;
@Repository
public interface BomResourceEquipmentsRepository extends JpaRepository<BomResourceEquipments,Long> {
}
