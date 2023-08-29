package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.MbfMtlRequestHeadersEam;
import vhc.smartw.eam.entity.WipRequirementOperations;

import java.util.Optional;

@Repository
public interface WipRequirementOperationsRepository extends JpaRepository<WipRequirementOperations,Long> {

    @Query(value = "select * from wip_requirement_operations  " +
            "where wip_entity_Id = :wipEntityId " +
            "and organization_id = :organizationId " +
            "and operation_seq_num = :operationSeqNum " +
            "and ((:repetitiveScheduleId is null) or (:repetitiveScheduleId is not null and REPETITIVE_SCHEDULE_ID = :repetitiveScheduleId))" +
            "and inventory_item_id = :inventoryItemId ", nativeQuery = true)
    Optional<WipRequirementOperations>findByCheckUnique(
            @Param("wipEntityId") Long wipEntityId,
            @Param("operationSeqNum") Long operationSeqNum,
            @Param("organizationId") Long organizationId,
            @Param("repetitiveScheduleId") Long repetitiveScheduleId,
            @Param("inventoryItemId") Long inventoryItemId
    );

}
