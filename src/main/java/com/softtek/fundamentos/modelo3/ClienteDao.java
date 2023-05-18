package com.softtek.fundamentos.modelo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ClienteDao {
    @Autowired
@Qualifier("acessoDesarrollo")

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
    public ClienteDao(){

    }

    public String insertar(Cliente c){
        return id.insertar(c);
    }


}
