package paqueteuno;

import paquetedos.Universidad;

public class Ejecutor {

    public static void main(String[] args) {

        Universidad u1 = new Universidad();
        Estudiante e1 = new Estudiante();
        e1.establecerUniversidad(u1);
        e1.calcularPromedio();
        System.out.printf("%s\n", e1);

        Universidad u2 = new Universidad("USFQ", "Quito");
        Estudiante e2 = new Estudiante("BM", 10, 9, 10, u2);
        e2.calcularPromedio();
        System.out.printf("%s", e2);
    }

}

// @cbhas

