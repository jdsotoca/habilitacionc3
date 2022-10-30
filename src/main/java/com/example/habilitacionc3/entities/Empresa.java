package com.example.habilitacionc3.entities;

import lombok.*;
import org.apache.catalina.LifecycleState;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nombreEmpresa;
    private String direccionEmpresa;
    private int telefonoEmpresa;
    private int nit;

    @OneToOne(mappedBy = "empresaPertenece")
    private Empleado empleado;

}
