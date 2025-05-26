package com.sucursalbanco;

import java.util.Date;

public class Pago extends Movimiento{
    private String destino;



    public Pago(int id, Date fecha, float monto, String destino) {
        super(id, fecha, monto);
        this.destino=destino;
    }

    public String getDestino() {
        return destino;
    }
}
