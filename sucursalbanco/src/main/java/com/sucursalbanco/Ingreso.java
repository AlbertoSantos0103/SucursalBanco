package com.sucursalbanco;

import java.util.Date;

public class Ingreso extends Movimiento{
    private String fuente;

    public Ingreso(int id, Date fecha, float monto, String fuente) {
        super(id, fecha, monto);
        this.fuente=fuente;
    }
    public String getFuente() {
        return fuente;
    }
}
