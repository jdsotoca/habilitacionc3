package com.example.habilitacionc3;

public class Empledo {

    private String nombreEmpleado;
    private String correoEmpleado;
    private String empresaPertenece;
    private String rolEmpleado;

    public Empledo(String nombreEmpleado, String correoEmpleado, String empresaPertenece, String rolEmpleado) {
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
