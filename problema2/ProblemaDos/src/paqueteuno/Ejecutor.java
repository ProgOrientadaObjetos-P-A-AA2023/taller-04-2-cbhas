package paqueteuno;

import paquetedos.Provincia;

public class Ejecutor {

    public static void main(String[] args) {

        Provincia provincia1 = new Provincia();
        Profesor profesor1 = new Profesor();
        profesor1.establecerProvincia(provincia1);
        profesor1.calcaularSueldoT();
        System.out.printf("%s\n", profesor1);

        Provincia provincia2 = new Provincia("Azuay", 45000);
        Profesor profesor2 = new Profesor("A", "R", 45000, 
                "1103412423", provincia2);
        profesor2.calcaularSueldoT();
        System.out.printf("%s", profesor2);

    }

}

// @cbhas
