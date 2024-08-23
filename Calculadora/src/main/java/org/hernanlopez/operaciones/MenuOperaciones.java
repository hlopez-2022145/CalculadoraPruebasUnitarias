package org.hernanlopez.operaciones;

import org.hernanlopez.interfaz.Operacion;

public class MenuOperaciones {

    public double calcular(double a, double b, char operador) {
        Operacion operacion = (operador == '+') ? new Suma() :
                (operador == '-') ? new Resta() :
                        (operador == '*') ? new Multiplicacion() :
                                (operador == '/') ? new Dividir() : null;
        if (operacion == null) {
            throw new IllegalArgumentException("Operador no válido");
        }

        return operacion.operar(a, b);
    }
}
