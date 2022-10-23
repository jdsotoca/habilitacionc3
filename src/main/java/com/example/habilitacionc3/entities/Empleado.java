package com.example.habilitacionc3.entities;

import javax.persistence.*;

@Entity
@Table(name = "Empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "nombre")
    private String nombreEmpleado;

    @Column(name = "correo")
    private String correoEmpleado;
    @Column(name = "empresa")
    private String empresaPertenece;
    @Column(name = "rol")
    private String rolEmpleado;

    public Empleado() {
    }

    public Empleado(String nombreEmpleado, String correoEmpleado, String empresaPertenece, String rolEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.empresaPertenece = empresaPertenece;
        this.rolEmpleado = rolEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public String getEmpresaPertenece() {
        return empresaPertenece;
    }

    public void setEmpresaPertenece(String empresaPertenece) {
        this.empresaPertenece = empresaPertenece;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Empledo{" +
                "nombreEmpleado='" + nombreEmpleado + '\'' +
                ", correoEmpleado='" + correoEmpleado + '\'' +
                ", empresaPertenece='" + empresaPertenece + '\'' +
                ", rolEmpleado='" + rolEmpleado + '\'' +
                '}';
    }
}
