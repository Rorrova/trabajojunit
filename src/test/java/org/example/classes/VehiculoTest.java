package org.example.classes;

import org.example.classes.classes.Vehiculos;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehiculoTest {
    private Vehiculos vehiculo;


    @Before
    public void setup(){
        vehiculo= new Vehiculos(123,2,2);
    }
    @Test
    public void testGetPatente(){
        assertEquals(123,vehiculo.getPatente());
    }

    @Test
    public void testGetCantEspejos(){
        assertEquals(2,vehiculo.getCantespejos());
    }
    @Test
    public void testGetCantRuedas(){
        assertEquals(2,vehiculo.getCantruedas());
    }
}

