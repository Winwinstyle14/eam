package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.MbfMtlRequestHeadersEam;

import java.util.Optional;

@Repository
public interface MbfMtlRequestHeadersEamRepository extends JpaRepository<MbfMtlRequestHeadersEam, Long> {
    Optional<MbfMtlRequestHeadersEam> findByOrganizationIdAndRequestNumber(Long organizationId, String requestNumber);
}

