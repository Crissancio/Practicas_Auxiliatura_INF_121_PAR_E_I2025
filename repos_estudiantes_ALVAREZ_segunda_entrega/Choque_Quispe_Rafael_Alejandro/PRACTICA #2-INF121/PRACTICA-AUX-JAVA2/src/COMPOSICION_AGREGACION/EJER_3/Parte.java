package COMPOSICION_AGREGACION.EJER_3;
public class Parte {
    private String nombre;
    private double peso; // en kg
    public Parte(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }
    public void mostrarInfo() {
        System.out.println("Parte: " + nombre);
        System.out.println("Peso: " + peso + " kg");
    }
    public String getNombre() {
        return nombre;
    }
    public double getPeso() {
        return peso;
    }
}