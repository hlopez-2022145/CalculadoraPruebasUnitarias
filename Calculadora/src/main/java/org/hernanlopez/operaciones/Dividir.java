package org.hernanlopez.operaciones;

import org.hernanlopez.interfaz.Operacion;

public class Dividir implements Operacion {
    @Override
    public double operar(double a, double b) {
        if( b == 0){
           throw new IllegalArgumentException("La división por cero no está permitido");
        }
        return a / b;
    }
}
