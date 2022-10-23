package com.example.habilitacionc3.controllers;


import com.example.habilitacionc3.entities.MovimientoDinero;
import com.example.habilitacionc3.services.MovimientoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovimientoController {

    MovimientoService service;
    public MovimientoController(MovimientoService service){
        this.service = service;
    }
    @GetMapping("/movements")
    public List<MovimientoDinero> getMovimiento(){return this.service.getMovimiento();}

    @PostMapping("/movements")
    public MovimientoDinero createMovimiento(@RequestBody MovimientoDinero movimientoDinero){return this.service.createMovimiento(movimientoDinero);}

}
