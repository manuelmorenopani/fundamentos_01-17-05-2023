package com.softtek.fundamentos.modelo1;


public class Coche {

    public String getMatricula() {
        return matricula;
    }

    public Coche(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String matricula;
    String modelo;
}
