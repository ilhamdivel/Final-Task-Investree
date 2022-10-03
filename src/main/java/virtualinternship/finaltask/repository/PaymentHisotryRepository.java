package virtualinternship.finaltask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import virtualinternship.finaltask.model.PaymentHistory;

@Repository
public interface PaymentHisotryRepository extends JpaRepository<PaymentHistory, Long> {
}
