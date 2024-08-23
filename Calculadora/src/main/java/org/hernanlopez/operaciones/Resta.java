package org.hernanlopez.operaciones;

import org.hernanlopez.interfaz.Operacion;

public class Resta implements Operacion {
    @Override
    public double operar(double a, double b){
        return  a - b;
    }
}
