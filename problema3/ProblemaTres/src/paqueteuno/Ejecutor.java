package paqueteuno;

import paquetedos.Fabricante;

public class Ejecutor {

    public static void main(String[] args) {

        Fabricante f1 = new Fabricante();
        Automotor a1 = new Automotor();
        a1.establecerFabricante(f1);
        a1.calcularVMatricula();
        System.out.printf("%s\n", a1);

        Fabricante f2 = new Fabricante("Ford", "Belgica");
        Automotor a2 = new Automotor("110123123", f1, 2018, 34000);
        a2.establecerFabricante(f2);
        a2.calcularVMatricula();
        System.out.printf("%s\n", a2);

    }

}

// @cbhas
