import java.util.ArrayList;
import java.util.List;

class Parte {
    private String nombre;
    private double peso;

    public Parte(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String mostrarInfo() {
        return "Parte: " + nombre + ", Peso: " + peso + " kg";
    }
}