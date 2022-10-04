package virtualinternship.finaltask.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import virtualinternship.finaltask.model.Transaksi;

@Repository
public interface TransaksiRepository extends JpaRepository<Transaksi, Long> {

    Page<Transaksi> findTransaksiByStatusIs(String status, Pageable pageable);

}
