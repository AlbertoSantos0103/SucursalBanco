package com.sucursalbanco;

import java.util.Date;


public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "Laura", "Av. Andalucía", "678912345");

        Cuenta cuenta = new Cuenta("987654321", 1000.0f, "Ahorro");
        cliente.agregarCuenta(cuenta);

        Ingreso ingreso = new Ingreso(1, new Date(), 300.0f, "Beca");
        cuenta.registrarIngreso(ingreso);

        Pago pago = new Pago(2, new Date(), 120.0f, "Amazon");
        cuenta.registrarPago(pago);

        System.out.println("Saldo actual: " + cuenta.getSaldo());

        System.out.println("Movimientos del cliente " + cliente.getNombre() + ":");
        for (Movimiento m : cliente.obtenerMovimientos()) {
            String tipo = (m instanceof Ingreso) ? "Ingreso" : "Pago";
            System.out.println("- " + tipo + ": " + m.getMonto() + "€");
        }
    }
}

