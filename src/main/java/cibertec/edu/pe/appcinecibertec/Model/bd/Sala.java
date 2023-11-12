package cibertec.edu.pe.appcinecibertec.Model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="sala")
@Data
public class Sala {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idsala;
    @Column(name ="descsala")
    private String descsala;
    @Column(name ="asientos")
    private Integer asientos;
    @Column(name ="idestado")
    private Integer idestado;
}
