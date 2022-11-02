package com.example.habilitacionc3.controllers;

import com.example.habilitacionc3.entities.Empleado;
import com.example.habilitacionc3.services.EmpleadoService;
import com.example.habilitacionc3.services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;
    @GetMapping("/user")
    private String verEmpleado(Model model){
        model.addAttribute("users", empleadoService.verEmpleado());
        return "user";
    }
    @GetMapping("/agregar-usuario")
    private String verFormularioUsuario (Empleado user){
        return "agregar-usuario";
    }
    @PostMapping("/user")
    private String crearEmpleado(Empleado user){
        empleadoService.crearActualizarEmpleado(user);
        return "redirect:/user";

    }
    @GetMapping("/user/borrar/{id}")
    private String eliminarEmpleado(@PathVariable("id") long id){
        empleadoService.eliminarEmpleado(id);
        return "redirect:/user";
    }
    @GetMapping("/user/editar/{id}")
    private String verEmpleado(@PathVariable("id") long id, Model model){
        Empleado empleado = empleadoService.verEmpleadoPorId(id);
        model.addAttribute("user", empleado);
        return "actualizar-user";
    }
    @PostMapping("/user/actualizar/{id}")
    private String editarEmpleado(@PathVariable("id") Long id, Empleado user){
        empleadoService.crearActualizarEmpleado(user);
        return "redirect:/user";
    }
}
