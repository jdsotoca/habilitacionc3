package com.example.habilitacionc3.controllers;

import com.example.habilitacionc3.entities.Empleado;
import com.example.habilitacionc3.services.EmpleadoService;
import com.example.habilitacionc3.services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;
    @GetMapping("/user")
    private List<Empleado> verEmpleado(){
        return empleadoService.verEmpleado();
    }
    @PostMapping("/user")
    private void crearEmpleado(@RequestBody Empleado user){
        empleadoService.crearActualizarEmpleado(user);

    }
    @DeleteMapping("/user/{id}")
    private void eliminarEmpleado(@PathVariable("id") long id){
        empleadoService.eliminarEmpleado(id);
    }
    @PutMapping("/user")
    private void editarEmpleado(@RequestBody Empleado user){
        empleadoService.crearActualizarEmpleado(user);
    }
}
