package cibertec.edu.pe.appcinecibertec.Model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="asientocliente")
@Data

public class AsientoCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idacliente;
    @Column(name ="idrasiento")
    private Integer idrasiento;
    @Column(name ="idcliente")
    private Integer idcliente;
}
