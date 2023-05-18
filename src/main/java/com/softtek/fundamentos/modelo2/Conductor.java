package com.softtek.Ejercicio2;

public class Conductor {
    Vehiculo v;
    public Conductor(Vehiculo v) {
        this.v = v;
    }
    public String conducir (){
        return v.moverse();
    };


}

