package com.softtek.fundamentos.modelo1;

import org.springframework.stereotype.Component;

@Component("Tallermecanica")
public class Tallermecanica implements Taller{

    @Override
    public String reparar(Coche c) {

        return "El coche esta reparado";
    }
}
