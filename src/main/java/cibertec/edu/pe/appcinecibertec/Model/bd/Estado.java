package cibertec.edu.pe.appcinecibertec.Model.bd;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="estado")
@Data

public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idestado;
    @Column(name ="descestado")
    private String descestado;
}
