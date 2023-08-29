package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.EamMeterReading;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EamMeterReadingRepository extends JpaRepository<EamMeterReading,Long> {
    @Query(value = "select * from EAM_METER_READING  " +
            "where EAM_PUSH = 0 " +
            "and (END_DATE between :startDate and :endDate)",
            nativeQuery = true)
    List<EamMeterReading> findAllByTime(LocalDate startDate, LocalDate endDate);
}
