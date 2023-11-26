package cibertec.edu.pe.appcinecibertec.Model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="registroasiento")
@Data

public class RegistroAsiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idrasiento;
    @Column(name ="idcartelera")
    private Integer idcartelera;
    @Column(name ="nroasiento")
    private Integer nroasiento;
}
