package org.hernanlopez.main.test;

import static org.junit.jupiter.api.Assertions.*;
import org.hernanlopez.operaciones.MenuOperaciones;
import org.junit.jupiter.api.*;

public class TestResta {

    MenuOperaciones menuOperaciones = new MenuOperaciones();

    @Test
    @DisplayName("Prueba Resta")

    public  void testOperacionResta () {
        double resultado = menuOperaciones.calcular(10,5, '-');
        assertEquals(5, resultado, 0);
    }
}
