package vhc.smartw.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vhc.smartw.eam.entity.MbfMtlRequestHeadersEam;
import vhc.smartw.eam.entity.MbfMtlRequestLinesEam;

import java.util.Optional;

@Repository
public interface MbfMtlRequestLinesEamRepository extends JpaRepository<MbfMtlRequestLinesEam, Long> {
    Optional<MbfMtlRequestLinesEam> findByHeaderIdAndLineNumber(Long headerId,Long lineNumber);


}
