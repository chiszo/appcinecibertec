package cibertec.edu.pe.appcinecibertec.Repository;

import cibertec.edu.pe.appcinecibertec.Model.bd.RegistroAsiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface RegistroAsientoRepository extends JpaRepository<RegistroAsiento, Integer> {
    /*
    @Transactional
    @Modifying
    @Query(value="{call spRegistrarAsiento(:idregistro, :idasiento)}",
            nativeQuery = true)
    void registrarAsiento(Integer idregistro, Integer idasiento);
*/
}
