package com.sucursalbanco;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private int id;
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Cuenta> cuentas = new ArrayList<>();

    public Cliente(int id, String nombre, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    public void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    public List<Movimiento> obtenerMovimientos() {
        List<Movimiento> movimientos = new ArrayList<>();
        for (Cuenta c : cuentas) {
            movimientos.addAll(c.getMovimientos());
        }
        return movimientos;
    }

    public String getNombre() {
        return nombre;
    }
}
