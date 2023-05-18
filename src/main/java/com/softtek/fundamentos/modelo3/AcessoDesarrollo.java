package com.softtek.fundamentos.modelo3;

import org.springframework.stereotype.Component;

@Component("AcessoDesarrollo")
public class AcessoDesarrollo implements IDAO{
@Override
    public String insertar(Cliente c){
        return "Acesso de desarrollo";
    }
}
