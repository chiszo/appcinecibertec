package cibertec.edu.pe.appcinecibertec.Controller.administracion;

import cibertec.edu.pe.appcinecibertec.Model.Estado;
import cibertec.edu.pe.appcinecibertec.Model.response.ResultadoResponse;
import cibertec.edu.pe.appcinecibertec.Service.EstadoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@Controller
@RequestMapping("/administracion/estado")
public class EstadoController {

    private EstadoService estadoService;

    @GetMapping ("/frmestado")
    public String index(Model model){
        model.addAttribute("listadoestados", estadoService.listarEstados());
        return "administracion/frmestado";
    }


    @PostMapping("/registrar")
    @ResponseBody //para q sepa q no vamos a devolver un String sino un objecto
    public ResultadoResponse registrarEstado(@RequestBody Estado objEstado)
    {
        return estadoService.registrarEstado(objEstado);
    }
}
