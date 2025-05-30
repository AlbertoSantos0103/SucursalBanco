package com.sucursalbanco;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;
public class MovimientoTest {
     @Test
    public void testGetFechaYGetMonto() {
        Date fecha = new Date();
        Pago pago = new Pago(1, fecha, 250.0f, "Supermercado");

        assertEquals(fecha, pago.getFecha());
        assertEquals(250.0f, pago.getMonto(), 0.001f);
    }
}
