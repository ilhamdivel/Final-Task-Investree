package virtualinternship.finaltask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import virtualinternship.finaltask.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
