package com.example.habilitacionc3.services;

import com.example.habilitacionc3.entities.Empleado;
import com.example.habilitacionc3.repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpleadoService {

    @Autowired
    EmpleadoRepository empleadoRepository;

    public void  crearActualizarEmpleado(Empleado empleado){
        empleadoRepository.save(empleado);
    }
    public List<Empleado> verEmpleado(){
        List<Empleado> empleados = new ArrayList<Empleado>();
        empleados.addAll(empleadoRepository.findAll());
        return empleados;
    }
    public void  eliminarEmpleado(Long id){
        empleadoRepository.deleteById(id);
    }
    public Empleado verEmpleadoPorId(Long id) {
        return empleadoRepository.findById(id).get();
    }

}
