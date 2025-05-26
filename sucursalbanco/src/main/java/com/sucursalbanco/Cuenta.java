package com.sucursalbanco;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cuenta {
    private String numero;
    private float saldo;
    private String tipo;
    private List <Movimiento> mvtos = new ArrayList<>();

    public Cuenta(String numero, float saldo, String tipo) {
        this.numero = numero;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public void registrarIngreso(Ingreso ingreso) {
        mvtos.add(ingreso);
        saldo += ingreso.getMonto();
    }

     public void registrarPago(Pago pago) {
        mvtos.add(pago);
        saldo -= pago.getMonto();
    }

    public List<Movimiento> consultarMovimientos(Date fecha) {
    List<Movimiento> resultado = new ArrayList<>();
        for (Movimiento m : mvtos) {
            if (m.getFecha().equals(fecha)) {
                resultado.add(m);
            }
        }
        return resultado;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }

    public List<Movimiento> getMovimientos() {
        return mvtos;
    }
}
