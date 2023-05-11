package paqueteuno;

import paquetedos.Universidad;

public class Estudiante { // clase

    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;
    private Universidad universidad; // atributos

    public Estudiante() {
        nombre = "SC";
        nota1 = 10;
        nota2 = 9;
        nota3 = 8;
    }

    public Estudiante(String n, double n1, double n2, double n3, Universidad u) {
        nombre = n;
        nota1 = n1;
        nota2 = n2;
        nota3 = n3;
        universidad = u;
    } // constructor

    public void establecerNombre(String n) {
        nombre = n;
    } // metodo

    public void establecerN1(double n1) {
        nota1 = n1;
    }

    public void establecerN2(double n2) {
        nota2 = n2;
    }

    public void establecerN3(double n3) {
        nota3 = n3;
    }

    public void establecerUniversidad(Universidad u) {
        universidad = u;
    }

    public void calcularPromedio() {
        promedio = (nota1 + nota2 + nota3) / 3;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerN1() {
        return nota1;
    }

    public double obtenerN2() {
        return nota2;
    }

    public double obtenerN3() {
        return nota3;
    }

    public double obtenerPromedioN() {
        return promedio;
    }

    public Universidad obtenerUniversidad() {
        return universidad;
    }

    @Override
    public String toString() {
        String mensaje = String.format("""
                                       Nombre: %s
                                       Nota 1: %.2f
                                       Nota 2: %.2f
                                       Nota 3: %.2f
                                        Promedio: %.2f
                                       Universidad: %s
                                       Dirección: %s
                                       """,
                nombre,
                nota1,
                nota2,
                nota3,
                promedio,
                obtenerUniversidad().obtenerNombre(),
                obtenerUniversidad().obtenerDireccion());
        return mensaje;
    }

}

// @cbhas
