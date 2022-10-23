package com.example.habilitacionc3.services;

import com.example.habilitacionc3.entities.MovimientoDinero;
import com.example.habilitacionc3.repositories.MovimientoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimientoService {
    private final MovimientoRepository repository;

    public MovimientoService(MovimientoRepository repository){this.repository = repository;}

    public List<MovimientoDinero> getMovimiento(){
        return this.repository.findAll();
    }
    public MovimientoDinero createMovimiento(MovimientoDinero newMovimiento){return this.repository.save(newMovimiento);}
}
