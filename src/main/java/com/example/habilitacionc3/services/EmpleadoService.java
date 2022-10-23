package com.example.habilitacionc3.services;

import com.example.habilitacionc3.entities.Empleado;
import com.example.habilitacionc3.repositories.EmpleadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {

    private EmpleadoRepository repository1;

    public EmpleadoService(EmpleadoRepository repository){
        this.repository1 = repository;
    }
    public List<Empleado> getEmpleado(){
        return this.repository1.findAll();
    }
    public Empleado createEmpleado(Empleado newEmpleado){
        return this.repository1.save(newEmpleado);
    }
}
