package cibertec.edu.pe.appcinecibertec.Repository;

import cibertec.edu.pe.appcinecibertec.Model.bd.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaRepository extends JpaRepository<Sala, Integer> {
}
