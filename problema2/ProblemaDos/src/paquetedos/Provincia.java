package paquetedos;

public class Provincia {

    private String nombre;
    private int nHabitantes;

    public Provincia() {
        nombre = "Chimborazo";
        nHabitantes = 5000;
    }

    public Provincia(String n, int nH) {
        nombre = n;
        nHabitantes = nH;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerNHabitantes(int nH) {
        nHabitantes = nH;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerNHabitantes() {
        return nHabitantes;
    }

}

// @cbhas
