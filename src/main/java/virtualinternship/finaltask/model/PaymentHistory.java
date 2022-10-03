package virtualinternship.finaltask.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "payment_history")
public class PaymentHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "pembayaran_ke")
    private Integer pembayaranKe;

    @Column(name = "jumlah")
    private Double jumlah;

    @Column(name = "bukti_pembayaran")
    private String bukti_pembayaran;

    @ManyToOne
    @JoinColumn(name = "id_transaksi")
    private Transaksi transaksi;

}
