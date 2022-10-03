package virtualinternship.finaltask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import virtualinternship.finaltask.model.UserDetail;

@Repository
public interface UserDetailRepository extends JpaRepository<UserDetail, Long> {
}
