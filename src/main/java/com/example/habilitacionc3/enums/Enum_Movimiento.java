package com.example.habilitacionc3.enums;

import javax.persistence.Table;

@Table(name = "conceptoMovimiento")
public enum Enum_Movimiento {
    Prestamo,
    Abono,
    Cancelar
}
