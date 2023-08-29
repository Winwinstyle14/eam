package vhc.smartw.eam.repository;

import vhc.smartw.eam.entity.MtlItemCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MtlItemCategoriesRepository extends JpaRepository<MtlItemCategories,Long> {
}
