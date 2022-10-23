package com.example.habilitacionc3.controllers;

import com.example.habilitacionc3.entities.Empresa;
import com.example.habilitacionc3.services.EmpresaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpresaController {

    EmpresaService service;
    public EmpresaController(EmpresaService service){
        this.service = service;
    }
    @GetMapping("/enterprise")
    public List<Empresa> getEmpresa(){

        return this.service.getEmpresa();
    }

    @PostMapping("/enterprise")
    public Empresa createEmpresa(@RequestBody Empresa empresa){
        return this.service.createEmpresa(empresa);

    }

}
