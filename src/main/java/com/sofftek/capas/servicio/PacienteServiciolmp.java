package com.sofftek.capas.servicio;

import com.sofftek.capas.modelo.Paciente;
import com.sofftek.capas.repositorio.IPacienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class PacienteServiciolmp implements IPacienteServicio{
    @Autowired
    private IPacienteRepo repo;
    @Override
    public String obtenerUno(Paciente p1) {
        return repo.obtenerUno(p1);
    }


}
