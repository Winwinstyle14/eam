package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.WipOperations;

import java.util.Optional;

@Repository
public interface WipOperationsRepository extends JpaRepository<WipOperations,Long> {
    @Query(value = "select * from WIP_OPERATIONS  " +
            "where WIP_ENTITY_ID = :wipEntityId " +
            "and OPERATION_SEQ_NUM = :operationSeqNum " +
            "and ORGANIZATION_ID = :organizationId " +
            "and ((:repetitiveScheduleId is null) or (:repetitiveScheduleId is not null and REPETITIVE_SCHEDULE_ID = :repetitiveScheduleId))"
            , nativeQuery = true)
    Optional<WipOperations> findByCheckUnique(
            @Param("wipEntityId") Long wipEntityId,
            @Param("operationSeqNum") Long operationSeqNum,
            @Param("organizationId") Long organizationId,
            @Param("repetitiveScheduleId") Long repetitiveScheduleId
    );
}