package com.example.habilitacionc3.entities;

import com.example.habilitacionc3.enums.Enum_Tipo;
import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nombreEmpleado;
    private String correoEmpleado;

    @OneToOne
    @JoinColumn(name = "empresaPertenece_id")
    private Empresa empresaPertenece;

    @Enumerated(EnumType.STRING)
    @Column(name = "rolEmpleado")
    private Enum_Tipo rolEmpleado;

}
