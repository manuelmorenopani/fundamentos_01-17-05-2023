package com.softtek.fundamentos.modelo3;

import org.springframework.stereotype.Component;

@Component("acessoDesarrollo")
public class AcessoProduccion implements IDAO{
@Override
    public String insertar(Cliente c){
        return "Acesso de produccion";
    }
}
