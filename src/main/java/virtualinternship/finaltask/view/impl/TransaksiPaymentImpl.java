package virtualinternship.finaltask.view.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import virtualinternship.finaltask.model.Transaksi;
import virtualinternship.finaltask.repository.TransaksiRepository;
import virtualinternship.finaltask.view.TransaksiService;

import java.util.HashMap;
import java.util.Map;

@Service
@Transactional
public class TransaksiPaymentImpl implements TransaksiService {
    @Autowired
    public TransaksiRepository transaksiRepository;

    @Override
    public Map save(Transaksi transaksi) {
        Map map = new HashMap<>();
        try {
            Transaksi save = transaksiRepository.save(transaksi);
            map.put("data", save);
            map.put("code", "200");
            map.put("status", "success");
            return map;
        } catch (Exception e){
            map.put("code", "500");
            map.put("status", "failed");
            return map;
        }
    }

    @Override
    public Map updateStatus(Transaksi transaksi) {
        Map map = new HashMap<>();
        var statusCheck = "lunas";
        try {
            Transaksi update = transaksiRepository.getReferenceById(transaksi.getId());
            if (!statusCheck.equals(update.getStatus())){
                update.setStatus(statusCheck);
            }
            Transaksi doSave = transaksiRepository.save(update);
            map.put("data",doSave );
            map.put("code", "200");
            map.put("status", "success");
            return map;
        } catch (Exception e){
            map.put("code", "500");
            map.put("status", "failed");
            return map;
        }
    }
}
