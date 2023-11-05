package cibertec.edu.pe.appcinecibertec.Repository;

import cibertec.edu.pe.appcinecibertec.Model.bd.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
