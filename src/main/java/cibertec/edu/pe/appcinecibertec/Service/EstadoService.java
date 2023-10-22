package cibertec.edu.pe.appcinecibertec.Service;

import cibertec.edu.pe.appcinecibertec.Model.Estado;
import cibertec.edu.pe.appcinecibertec.Repository.EstadoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class EstadoService {
    private EstadoRepository estadoRepository;
    public List<Estado>listarEstados(){
        return estadoRepository.findAll();
    }

    public boolean registrarEstado(Estado estado){
        return estadoRepository.save(estado) !=null;
    }

    public boolean eliminarEstado(Integer idestado){
        estadoRepository.deleteById(idestado);
    }
}
