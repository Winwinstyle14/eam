package vhc.smartw.eam.repository;

import vhc.smartw.eam.entity.MtlCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MtlCategoriesRepository extends JpaRepository<MtlCategories,Long> {
}
