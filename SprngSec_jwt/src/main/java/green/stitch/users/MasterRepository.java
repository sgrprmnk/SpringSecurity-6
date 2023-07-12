package green.stitch.users;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MasterRepository extends JpaRepository<Master, Integer> {
    Optional<Master> findByEmail(String email);
}
