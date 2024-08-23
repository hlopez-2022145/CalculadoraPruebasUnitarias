package org.hernanlopez.main.test;

import static org.junit.jupiter.api.Assertions.*;
import org.hernanlopez.operaciones.MenuOperaciones;
import org.junit.jupiter.api.*;

public class TestSuma {

    MenuOperaciones menuOperaciones = new MenuOperaciones();

    @Test
    //añadimos un nombre a la prueba para la facilitar la identificación
    @DisplayName("Prueba Suma")
    public void testOperacionSuma () {
        double resultado = menuOperaciones.calcular(5, 20, '+');
        assertEquals(25, resultado, 0);
    }
}
