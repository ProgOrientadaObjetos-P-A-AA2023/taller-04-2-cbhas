package paqueteuno;

import paquetedos.Provincia;

public class Profesor {

    private String nombre;
    private String apellido;
    private String cedula;
    private double sueldoB;
    private double sueldoT;
    private Provincia provincia;

    public Profesor() {
        nombre = "S";
        apellido = "C";
        cedula = "1105747016";
        sueldoB = 120.4;
    }

    public Profesor(String n, String a, double sB, String c, Provincia p) {
        nombre = n;
        apellido = a;
        cedula = c;
        sueldoB = sB;
        provincia = p;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String a) {
        apellido = a;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establcerSueldoB(double sB) {
        sueldoB = sB;
    }

    public void calcaularSueldoT() {
        sueldoT = sueldoB * 1.2;
    }

    public void establecerProvincia(Provincia p) {
        provincia = p;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public double obtenerSueldoB() {
        return sueldoB;
    }

    public double obtenerSueldoT() {
        return sueldoT;
    }

    public Provincia obtenerProvincia() {
        return provincia;
    }

    @Override
    public String toString() {
        String mensaje = String.format("""
                                       Nombre: %s
                                       Apellido: %s
                                       Sueldo Básico: %.2f
                                       Sueldo Total: %.2f
                                       Cédula: %s
                                       Provincia: %s
                                       Número de Habitantes: %d
                                       """,
                nombre,
                apellido,
                sueldoB,
                sueldoT,
                cedula,
                obtenerProvincia().obtenerNombre(),
                obtenerProvincia().obtenerNHabitantes());
        return mensaje;
    }
    
} // Metodo

// @cbhas
