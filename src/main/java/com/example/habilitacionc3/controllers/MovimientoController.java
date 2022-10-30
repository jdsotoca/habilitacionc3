package com.example.habilitacionc3.controllers;


import com.example.habilitacionc3.entities.MovimientoDinero;
import com.example.habilitacionc3.services.MovimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovimientoController {

    @Autowired
    MovimientoService movimientoService;
    @GetMapping("/movements")
    public List<MovimientoDinero> verMovimientoDinero(){
        return movimientoService.verMovimientoDinero();
    }
    @PostMapping("/movements")
    public void crearMovimientoDinero(@RequestBody MovimientoDinero movements){
        movimientoService.crearActualizarMovimientoDinero(movements);
    }
    @DeleteMapping("/movements/{id}")
    public void eliminarMovimientoDinero(@PathVariable("id")Long id){
        movimientoService.eliminarMovimientoDinero(id);
    }
    @PutMapping("/movements")
    public void editarMovimientoDinero(@RequestBody MovimientoDinero movements){
        movimientoService.crearActualizarMovimientoDinero(movements);
    }
}
