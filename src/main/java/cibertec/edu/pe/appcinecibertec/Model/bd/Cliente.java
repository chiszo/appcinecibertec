package cibertec.edu.pe.appcinecibertec.Model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="cliente")
@Data

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcliente;

    @Column(name ="nomcliente")
    private String nomcliente;

    @Column(name ="apecliente")
    private String apecliente;

    @Column(name ="dnicliente")
    private String dnicliente;
}
