package com.sofftek.capas.repositorio;

import com.sofftek.capas.modelo.Paciente;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class PacienteRepompl implements IPacienteRepo {
    public String obtenerUno(Paciente p1) {
        return "Nombre del paciente: " + p1.toString();
    }

}
