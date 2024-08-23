package org.hernanlopez.main;

import org.hernanlopez.operaciones.MenuOperaciones;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        MenuOperaciones calculadora = new MenuOperaciones();

        logger.info("Suma: ", calculadora.calcular(5,3, '+'));
        logger.info("Resta: ", calculadora.calcular(5,3, '-'));
        logger.info("Multiplicación: ", calculadora.calcular(5,3, '*'));
        logger.info("División: ", calculadora.calcular(10,5, '/'));
    }
}
