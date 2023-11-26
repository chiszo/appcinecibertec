package cibertec.edu.pe.appcinecibertec.Service;

import cibertec.edu.pe.appcinecibertec.Model.bd.AsientoCliente;
import cibertec.edu.pe.appcinecibertec.Model.bd.RegistroAsiento;
import cibertec.edu.pe.appcinecibertec.Model.response.ResultadoResponse;
import cibertec.edu.pe.appcinecibertec.Repository.AsientoClienteRepository;
import cibertec.edu.pe.appcinecibertec.Repository.RegistroAsientoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AsientoClienteService {
    private AsientoClienteRepository asientoClienteRepository;
    private RegistroAsientoRepository registroAsientoRepository;

    /*Por defecto es REQUIRED
    * Propagation:
    *   REQUIRED -usar una transaccion existente, si no existe crea una nueva transa
    *   REQUIRES_NEW - Crea una nueva transaccion si ya existe
    * Isolation (Nivel):
    *   READ_UNCOMMITTED - LEE LOS DATOS NO COMITEADOS - QUIERE DECIR 1, pierde memoria
    *   READ_COMMITTED - LEE DATOS QUE YA EXISTEN
    * */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
    public ResultadoResponse guardarAsientoCliente(RegistroAsiento registroAsiento,
                                                   List<AsientoCliente> asientoClienteList){
        RegistroAsiento nuevoRegistroAsiento= registroAsientoRepository.save(registroAsiento);
        for (AsientoCliente asiento : asientoClienteList){
            asiento.setIdrasiento(nuevoRegistroAsiento.getIdrasiento());
            asientoClienteRepository.save(asiento);
        }
        return null;
    }
}
