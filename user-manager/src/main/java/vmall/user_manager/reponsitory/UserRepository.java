package vmall.user_manager.reponsitory;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import vmall.user_manager.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
