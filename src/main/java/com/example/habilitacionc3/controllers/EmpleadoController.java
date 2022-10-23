package com.example.habilitacionc3.controllers;

import com.example.habilitacionc3.entities.Empleado;
import com.example.habilitacionc3.services.EmpleadoService;
import com.example.habilitacionc3.services.EmpresaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpleadoController {
    EmpleadoService service;
    public EmpleadoController(EmpleadoService service){
        this.service = service;
    }
    @GetMapping("/user")
    public List<Empleado> getEmpleado(){
        return this.service.getEmpleado();
    }

    @PostMapping("/user")
    public Empleado createEmpleado(@RequestBody Empleado empleado){
        return this.service.createEmpleado(empleado);
    }
}
