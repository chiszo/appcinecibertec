package cibertec.edu.pe.appcinecibertec.Repository;

import cibertec.edu.pe.appcinecibertec.Model.bd.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol,
        Integer> {

    Rol findByNomrol(String nomrol);

}