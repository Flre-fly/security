package hello.security.repository;

import hello.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    //jpa query method
    Optional<User> findByUsername(String username);
}
