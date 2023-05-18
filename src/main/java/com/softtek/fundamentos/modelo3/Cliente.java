package com.softtek.Ejercicio4;

public class Cliente {

    String nombre;
    String CIF;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente(String nombre, String CIF) {
        this.nombre = nombre;
        this.CIF = CIF;
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }
}
