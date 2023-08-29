package vhc.smartw.eam.repository;

import vhc.smartw.eam.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User>findByUsername(String userName);
    //check username
    Boolean existsByUsername(String userName);
    //check email
    Boolean existsByEmail(String email);
}
