package org.hernanlopez.main.test;

import static org.junit.jupiter.api.Assertions.*;
import org.hernanlopez.operaciones.MenuOperaciones;
import org.junit.jupiter.api.*;

public class TestMultiplicacion {
    MenuOperaciones menuOperaciones = new MenuOperaciones();

    @Test
    @DisplayName("Prueba Multiplicación")

    public void testOperacionMultiplicacion () {
        double resultado = menuOperaciones.calcular(3,5, '*');
        assertEquals(15, resultado, 0);
    }
}
