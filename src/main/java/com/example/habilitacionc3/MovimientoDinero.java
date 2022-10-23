package com.example.habilitacionc3;

public class MovimientoDinero {

    private float movimiento;
    private float montoPosNega;
    private String conceptoMovimiento;
    private String usuario;

    public MovimientoDinero(float movimiento, float montoPosNega, String conceptoMovimiento, String usuario) {
        this.movimiento = movimiento;
        this.montoPosNega = montoPosNega;
        this.conceptoMovimiento = conceptoMovimiento;
        this.usuario = usuario;
    }

    public float getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(float movimiento) {
        this.movimiento = movimiento;
    }

    public float getMontoPosNega() {
        return montoPosNega;
    }

    public void setMontoPosNega(float montoPosNega) {
        this.montoPosNega = montoPosNega;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
