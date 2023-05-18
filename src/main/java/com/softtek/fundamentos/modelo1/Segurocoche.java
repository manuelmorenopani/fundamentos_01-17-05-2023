package com.softtek.fundamentos.modelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Segurocoche {
    @Autowired
    @Qualifier("Tallermecanica")
    private Taller t;
    private String aseguradora;
    public Segurocoche(Taller t, String aseguradora) {
        this.t = t;
        this.aseguradora = aseguradora;
    }

    public Taller getT() {
        return t;
    }

    public void setT(Taller t) {
        this.t = t;
    }

    public String getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(String aseguradora) {
        this.aseguradora = aseguradora;
    }

    public Segurocoche() {

    }



    public String reparar (Coche c) {
        return t.reparar(c);
    }
}
