package com.sucursalbanco;
import org.junit.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;
import java.util.List;
public class ClienteTest {
     @Test
    public void testCrearClienteYAgregarCuenta() {
        Cliente cliente = new Cliente(1, "Ana García", "Calle Falsa 123", "600000000");
        Cuenta cuenta = new Cuenta("123ABC", 1000f, "Ahorro");

        cliente.agregarCuenta(cuenta);

        assertEquals("Ana García", cliente.getNombre());

        assertEquals(1, cliente.obtenerMovimientos().size()); 
        assertEquals(0, cuenta.getMovimientos().size());

   
    
    }
     @Test
    public void testObtenerMovimientosDeVariasCuentas() {
        Cliente cliente = new Cliente(2, "Carlos Ruiz", "Av. Central 45", "699999999");
        Cuenta cuenta1 = new Cuenta("111AAA", 500f, "Corriente");
        Cuenta cuenta2 = new Cuenta("222BBB", 800f, "Ahorro");

        Date fecha = new Date();
        Ingreso ingreso1 = new Ingreso(1, fecha, 100f, "Trabajo");
        Pago pago1 = new Pago(2, fecha, 50f, "Compra");

        cuenta1.registrarIngreso(ingreso1);
        cuenta2.registrarPago(pago1);

        cliente.agregarCuenta(cuenta1);
        cliente.agregarCuenta(cuenta2);

        List<Movimiento> movimientos = cliente.obtenerMovimientos();

        assertEquals(2, movimientos.size());
        assertTrue(movimientos.contains(ingreso1));
        assertTrue(movimientos.contains(pago1));
    }
}