package virtualinternship.finaltask.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "transaksi")
public class Transaksi {
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

    @ManyToOne
    @JoinColumn(name = "id_peminjam")
    private User peminjam;

    @ManyToOne
    @JoinColumn(name = "id_meminjam")
    private User meminjam;
}
