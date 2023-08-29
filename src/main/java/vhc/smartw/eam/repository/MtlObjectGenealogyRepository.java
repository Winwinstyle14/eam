package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.MtlObjectGenealogy;

@Repository
public interface MtlObjectGenealogyRepository extends JpaRepository<MtlObjectGenealogy,Long> {
}
