package cibertec.edu.pe.appcinecibertec.Controller.administracion;

import cibertec.edu.pe.appcinecibertec.Model.bd.Sala;
import cibertec.edu.pe.appcinecibertec.Model.dto.SalaDto;
import cibertec.edu.pe.appcinecibertec.Model.response.ResultadoResponse;
import cibertec.edu.pe.appcinecibertec.Service.SalaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/administracion/sala")
public class SalaController {

    private SalaService salaService;

    @GetMapping("/frmsala")
    public String index(Model model){
        model.addAttribute("listadosalas", salaService.listarSalas());
        return "administracion/frmsala";
    }

    @PostMapping("/registrar")
    @ResponseBody
    public ResultadoResponse registrarSala(
            @RequestBody SalaDto objSala) {
        return salaService.registrarActualizarSala(objSala);
    }

    @GetMapping("/listar")
    @ResponseBody
    public List<Sala> listarSalas(){
        return salaService.listarSalas();
    }
}
