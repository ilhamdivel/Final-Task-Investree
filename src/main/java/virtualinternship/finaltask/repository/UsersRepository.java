package virtualinternship.finaltask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import virtualinternship.finaltask.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
}
