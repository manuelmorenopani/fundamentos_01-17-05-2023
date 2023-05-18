package com.softtek.fundamentos.modelo2;

import org.springframework.stereotype.Component;

@Component
public class CocheConductor implements Vehiculo {

    int deposito;

    public CocheConductor(int deposito) {

        this.deposito = deposito;
    }
    public CocheConductor() {
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }

    public String moverse() {
        if (deposito > 0) {
            return "El coche se esta moviendo.";
        } else {
            return "El coche no se esta movimiento";
        }
    }
}
