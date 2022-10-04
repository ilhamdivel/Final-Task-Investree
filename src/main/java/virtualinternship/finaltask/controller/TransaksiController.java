package virtualinternship.finaltask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import virtualinternship.finaltask.model.Transaksi;
import virtualinternship.finaltask.repository.TransaksiRepository;
import virtualinternship.finaltask.view.TransaksiService;

import java.util.Map;

@RestController
@RequestMapping("/v1/transaksi")
public class TransaksiController {
    @Autowired
    public TransaksiService transaksiService;

    @Autowired
    public TransaksiRepository transaksiRepository;

    @PostMapping
    public ResponseEntity<Map> save(@RequestBody Transaksi transaksi){
        Map save = transaksiService.save(transaksi);
        return new ResponseEntity<Map>(save, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Map> updateStatus(@RequestBody Transaksi transaksi){
        Map update = transaksiService.updateStatus(transaksi);
        return new ResponseEntity<Map>(update,HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<Page<Transaksi>> list(@RequestParam(value = "status", required = false) String status,
                                          @RequestParam(value = "page") Integer page,
                                          @RequestParam(value = "size")Integer size){

        Pageable pageable = PageRequest.of(page,size);
        if(status.equals("")){
            Page<Transaksi> transaksiPage = transaksiRepository.findAll(pageable);
            return new ResponseEntity<Page<Transaksi>>(transaksiPage,HttpStatus.OK);
        } else {
            Page<Transaksi> transaksiPage = transaksiRepository.findTransaksiByStatusIs(status,pageable);
            return new ResponseEntity<Page<Transaksi>>(transaksiPage,HttpStatus.OK);
        }

    }
}
