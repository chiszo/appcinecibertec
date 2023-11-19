package cibertec.edu.pe.appcinecibertec.Repository;

import cibertec.edu.pe.appcinecibertec.Model.bd.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends
        JpaRepository<Usuario, Integer>
{
    Usuario findByNomusuario(String nomusuario);
}
