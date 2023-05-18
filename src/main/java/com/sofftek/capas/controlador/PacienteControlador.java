package com.sofftek.capas.controlador;

import com.sofftek.capas.modelo.Paciente;
import com.sofftek.capas.servicio.IPacienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paciente")
public class PacienteControlador {
    @Autowired
    private IPacienteServicio servicio;

    @GetMapping
    public String obtenerUno() {
        // Creas un objeto Paciente o obtienes el objeto desde algún lugar
        Paciente paciente = new Paciente(1, "Gonzalo", 25);

        // Llamas y retornas al método obtenerUno del servicio pasando el objeto Paciente
        return servicio.obtenerUno(paciente);
    }
}
