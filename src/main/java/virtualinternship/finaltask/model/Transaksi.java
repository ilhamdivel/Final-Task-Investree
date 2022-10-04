package virtualinternship.finaltask.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "transaksi")
public class Transaksi implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "tenor")
    private Integer tenor;

    @Column(name = "total_pinjaman")
    private Double totalPinjaman;

    @Column(name = "bunga_persen")
    private Double bungaPersen;

    @Column(name = "status")
    private String status;

    @Column(name = "id_peminjam")
    private Integer idPeminjam;

    @Column(name = "id_meminjam")
    private Integer idMeminjam;
}
