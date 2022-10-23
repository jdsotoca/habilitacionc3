package com.example.habilitacionc3.services;

import com.example.habilitacionc3.entities.Empresa;
import com.example.habilitacionc3.repositories.EmpresaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpresaService {

    private final EmpresaRepository repository2;

    public EmpresaService(EmpresaRepository repository){
        this.repository2 = repository;
    }

    public List<Empresa> getEmpresa(){
        return this.repository2.findAll();
    }
    public Empresa createEmpresa(Empresa newEmpresa){
        return this.repository2.save(newEmpresa);
    }
}
