package com.softtek.Ejercicio4;

public class ClienteDao {

    IDAO id;

    public IDAO getId() {
        return id;
    }

    public void setId(IDAO id) {
        this.id = id;
    }

    public ClienteDao(IDAO id) {
        this.id = id;
    }

    public String insertar(Cliente c){
        return id.insertar(c);
    }


}
