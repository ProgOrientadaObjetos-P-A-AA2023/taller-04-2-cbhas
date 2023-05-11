package paquetedos;

public class Fabricante {

    private String nombre;
    private String ciudad;

    public Fabricante() {
        nombre = "Audi";
        ciudad = "Alemania";
    }

    public Fabricante(String n, String c) {
        nombre = n;
        ciudad = c;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerCiudad(String c) {
        ciudad = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

}

// @cbhas
