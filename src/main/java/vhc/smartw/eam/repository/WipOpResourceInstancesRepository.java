package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.WipOpResourceInstances;
import vhc.smartw.eam.entity.WipRequirementOperations;

import java.util.Optional;

@Repository
public interface WipOpResourceInstancesRepository extends JpaRepository<WipOpResourceInstances,Long> {
    @Query(value = "select * from WIP_OP_RESOURCE_INSTANCES  " +
            "where operation_seq_num = :operationSeqNum " +
            "and wip_entity_id = :wipEntityId " +
            "and resource_seq_num = :resourceSeqNum " +
            "and instance_id = :instanceId " +
            "and ((:serialNumber is null) or (:serialNumber is not null and serial_number = :serialNumber))"
            , nativeQuery = true)
    Optional<WipOpResourceInstances> findByCheckUnique(
            @Param("operationSeqNum") Long operationSeqNum,
            @Param("wipEntityId") Long wipEntityId,
            @Param("resourceSeqNum") Long resourceSeqNum,
            @Param("instanceId") Long instanceId,
            @Param("serialNumber") String serialNumber
    );

}
