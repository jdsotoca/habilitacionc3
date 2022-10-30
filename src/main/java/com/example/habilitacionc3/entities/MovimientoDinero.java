package com.example.habilitacionc3.entities;

import com.example.habilitacionc3.enums.Enum_Movimiento;
import com.example.habilitacionc3.enums.Enum_Tipo;
import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class MovimientoDinero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private float montoMovimiento;

    @Enumerated(EnumType.STRING)
    @Column(name = "conceptoMovimiento")
    private Enum_Movimiento conceptoMovimiento;

    @OneToOne
    private Empleado empleado;


}
