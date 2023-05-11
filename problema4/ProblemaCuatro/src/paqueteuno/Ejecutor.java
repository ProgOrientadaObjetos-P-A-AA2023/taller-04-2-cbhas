package paqueteuno;

import paquetedos.*;

public class Ejecutor {

    public static void main(String[] args) {

        Cliente c1 = new Cliente();
        Banco b1 = new Banco();
        EntidadFinanciera eF1 = new EntidadFinanciera();
        eF1.establecerCliente(c1);
        eF1.establecerBanco(b1);
        eF1.calcularComision();
        System.out.printf("%s\n", eF1);

        Cliente c2 = new Cliente("Alex Israel", "Ramirez Jimenez", 
                "11057470131");
        Banco b2 = new Banco("Banco Pichincha", 3);
        EntidadFinanciera eF2 = new EntidadFinanciera(c2, b2, 10000);
        eF2.establecerCliente(c2);
        eF2.establecerBanco(b2);
        eF2.calcularComision();
        System.out.printf("%s", eF2);
    }

}

// @cbhas
