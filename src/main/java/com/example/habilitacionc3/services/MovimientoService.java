package com.example.habilitacionc3.services;

import com.example.habilitacionc3.entities.MovimientoDinero;
import com.example.habilitacionc3.repositories.MovimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovimientoService {

    @Autowired
    MovimientoRepository movimientoRepository;

    public void crearActualizarMovimientoDinero(MovimientoDinero movimientoDinero){
        movimientoRepository.save(movimientoDinero);
    }
    public List<MovimientoDinero> verMovimientoDinero(){
        List<MovimientoDinero> movimientoDineros = new ArrayList<MovimientoDinero>();
        movimientoDineros.addAll(movimientoRepository.findAll());
        return movimientoDineros;
    }
    public void eliminarMovimientoDinero(Long id){
        movimientoRepository.deleteById(id);
    }
}


