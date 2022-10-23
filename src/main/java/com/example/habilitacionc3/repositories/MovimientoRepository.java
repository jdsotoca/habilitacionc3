package com.example.habilitacionc3.repositories;

import com.example.habilitacionc3.entities.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimientoRepository extends JpaRepository<MovimientoDinero, Long> {
}
