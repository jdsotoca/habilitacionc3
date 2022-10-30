package com.example.habilitacionc3.controllers;

import com.example.habilitacionc3.entities.Empresa;
import com.example.habilitacionc3.services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpresaController {

    @Autowired
    EmpresaService empresaService;

    @GetMapping("/enterprises")
    private List<Empresa> verEmpresa(){
        return empresaService.verEmpresa();
    }

    @PostMapping("/enterprises")
    private void crearEmpresa(@RequestBody Empresa enterprises){
        empresaService.crearActualizarEmpresa(enterprises);
    }

    @DeleteMapping("/enterprises/{id}")
    private void eliminarEmpresa(@PathVariable("id") Long id){
        empresaService.eliminarEmpresa(id);
    }
    @PutMapping("/enterprises")
    public void editarEmpresa(@RequestBody Empresa enterprises){
        empresaService.crearActualizarEmpresa(enterprises);
    }

}
