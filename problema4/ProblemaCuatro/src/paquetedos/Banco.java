package paquetedos;

public class Banco {

    private String nombre;
    private int nSucursales;

    public Banco() {
        nombre = "Banco de Loja";
        nSucursales = 4;
    }

    public Banco(String n, int nS) {
        nombre = n;
        nSucursales = nS;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerNSucursales(int nS) {
        nSucursales = nS;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerNSucursales() {
        return nSucursales;
    }

}

// @cbhas
