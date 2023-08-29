package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.MtlSerialNumbers;

@Repository
public interface MtlSerialNumbersRepository extends JpaRepository<MtlSerialNumbers,String> {
}
