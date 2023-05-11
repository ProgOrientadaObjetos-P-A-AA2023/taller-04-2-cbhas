package paqueteuno;

import paquetedos.Fabricante;

public class Automotor {

    private String cedula;
    private Fabricante fabricante;
    private int anio;
    private double valorV;
    private double valorM;

    public Automotor() {
        cedula = "1105747016";
        anio = 2004;
        valorV = 25000;
    }

    public Automotor(String c, Fabricante f, int a, double vV) {
        cedula = c;
        fabricante = f;
        anio = a;
        valorV = vV;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establecerFabricante(Fabricante f) {
        fabricante = f;
    }

    public void establecerAnio(int a) {
        anio = a;
    }

    public void establecerVVehiculo(double vV) {
        valorV = vV;
    }

    public void calcularVMatricula() {
        valorM = 0.00002 * valorV * (2023 - anio);
    }

    public String obtenerCedula() {
        return cedula;
    }

    public Fabricante obtenerFabricante() {
        return fabricante;
    }

    public int obtenerAnio() {
        return anio;
    }

    public double obtenerVVehiculo() {
        return valorV;
    }

    public double obtenerVMatricula() {
        return valorM;
    }

    @Override
    public String toString() {
        String mensaje = String.format("""
                                       Cédula: %s
                                       Nombre de Fabricante: %s
                                       Ciudad de Origen: %s
                                       Año de Fabricación: %d
                                       Valor del Vehículo: %.2f
                                       Valor de la Matrícula: %.2f
                                       """,
                cedula,
                obtenerFabricante().obtenerNombre(),
                obtenerFabricante().obtenerCiudad(),
                anio,
                valorV,
                valorM);
        return mensaje;
    }
    
}

// @cbhas
