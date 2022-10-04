package virtualinternship.finaltask.view;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import virtualinternship.finaltask.model.Transaksi;

import java.util.Map;

public interface TransaksiService {
    public Map save(Transaksi transaksi);
    public Map updateStatus(Transaksi transaksi);

}
