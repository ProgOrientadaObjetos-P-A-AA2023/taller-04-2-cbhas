package paquetedos;

public class Cliente {

    private String nombres;
    private String apellidos;
    private String cedula;

    public Cliente() {
        nombres = "Sebastián Alejandro";
        apellidos = "Calderón Bonilla";
        cedula = "1105747016";
    }

    public Cliente(String n, String a, String c) {
        nombres = n;
        apellidos = a;
        cedula = c;
    }

    public void establecerNombres(String n) {
        nombres = n;
    }

    public void establecerApellidos(String a) {
        apellidos = a;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public String obtenerApellidos() {
        return apellidos;
    }

    public String obtenerCedula() {
        return cedula;
    }

}

// @cbhas
