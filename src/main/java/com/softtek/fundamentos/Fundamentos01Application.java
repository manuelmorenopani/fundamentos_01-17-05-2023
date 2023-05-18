package com.softtek.fundamentos;

import com.softtek.fundamentos.modelo1.Coche;
import com.softtek.fundamentos.modelo1.Segurocoche;
import com.softtek.fundamentos.modelo1.Tallerpintura;
import com.softtek.fundamentos.modelo2.CocheConductor;
import com.softtek.fundamentos.modelo2.Conductor;
import com.softtek.fundamentos.modelo3.AcessoDesarrollo;
import com.softtek.fundamentos.modelo3.Cliente;
import com.softtek.fundamentos.modelo3.ClienteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class Fundamentos01Application  implements CommandLineRunner {
    @Autowired
    private Segurocoche s1;
    @Autowired
    private Conductor c1;
    @Autowired
    private ClienteDao cl1;

    public static void main(String[] args) {

        SpringApplication.run(Fundamentos01Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Coche c = new Coche("asdfasd", "deportivo");
        System.out.println(s1.reparar(c));

        ((CocheConductor) c1.getV()).setDeposito(10);
        System.out.println(c1.conducir());

        Cliente cliente = new Cliente("Manuel", "123456");
        System.out.println(cl1.insertar(cliente));


    }



}

