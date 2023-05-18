package com.softtek.fundamentos.modelo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Conductor {
    @Autowired
    Vehiculo v;

    public Vehiculo getV() {
        return v;
    }

    public void setV(Vehiculo v) {
        this.v = v;
    }

    public Conductor(Vehiculo v) {
        this.v = v;
    }
    public String conducir (){
        return v.moverse();
    };

    public Conductor(){

    }


}

