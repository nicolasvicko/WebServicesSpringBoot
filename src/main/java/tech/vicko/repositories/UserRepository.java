package tech.vicko.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.vicko.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
