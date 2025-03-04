package zci.trainning.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zci.trainning.userservice.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
