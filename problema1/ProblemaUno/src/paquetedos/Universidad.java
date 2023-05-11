package paquetedos;

public class Universidad {

    private String nombreU;
    private String direccion; // Atributos

    public Universidad() {
        nombreU = "UTPL";
        direccion = "Loja";
    }

    public Universidad(String n, String d) {
        nombreU = n;
        direccion = d;
    } // Constructor

    public void establecerNombre(String n) {
        nombreU = n;
    } // Métodos

    public String obtenerNombre() {
        return nombreU;
    }

    public void establecerDireccion(String d) {
        direccion = d;
    }

    public String obtenerDireccion() {
        return direccion;
    }
    
}

// @cbhas
