package com.softtek.fundamentos.modelo1;

import org.springframework.stereotype.Component;

@Component("Tallerpintura")
public class Tallerpintura implements Taller{

    @Override
    public String reparar(Coche c) {

        return "El coche esta pintado";
    }
}
