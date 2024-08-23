package org.hernanlopez.main.test;

import static org.junit.jupiter.api.Assertions.*;
import org.hernanlopez.operaciones.MenuOperaciones;
import org.junit.jupiter.api.*;

public class TestDivision {
    MenuOperaciones menuOperaciones = new MenuOperaciones();

    @Test
    @DisplayName("Prueba División")

    public void testOperacionDivision () {
        double resultado = menuOperaciones.calcular(25,2,'/');
        assertEquals(12.5, resultado,0);
    }
}
