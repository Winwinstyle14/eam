package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.WipOperationResources;
import vhc.smartw.eam.entity.WipRequirementOperations;

import java.util.Optional;

@Repository
public interface WipOperationResourcesRepository extends JpaRepository<WipOperationResources,Long> {
    @Query(value = "select * from WIP_OPERATION_RESOURCES  " +
            "where resource_seq_num = :resourceSeqNum " +
            "and wip_entity_id = :wipEntityId " +
            "and operation_seq_num = :operationSeqNum " +
            "and organization_id = :organizationId " +
            "and ((:repetitiveScheduleId is null) or (:repetitiveScheduleId is not null and REPETITIVE_SCHEDULE_ID = :repetitiveScheduleId))"
            , nativeQuery = true)
    Optional<WipOperationResources> findByCheckUnique(
            @Param("resourceSeqNum")Long resourceSeqNum,
            @Param("wipEntityId")Long wipEntityId,
            @Param("repetitiveScheduleId")Long repetitiveScheduleId,
            @Param("operationSeqNum")Long operationSeqNum,
            @Param("organizationId")Long organizationId
    );

}
