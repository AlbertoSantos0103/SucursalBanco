package com.sucursalbanco;

import java.util.Date;

public abstract class Movimiento {
    protected int id;
    protected Date fecha;
    protected float monto;

    public Movimiento(int id, Date fecha, float monto) {
        this.id = id;
        this.fecha = fecha;
        this.monto = monto;
    }

       public Date getFecha() {
        return fecha;
    }

    public float getMonto() {
        return monto;
    }
}
