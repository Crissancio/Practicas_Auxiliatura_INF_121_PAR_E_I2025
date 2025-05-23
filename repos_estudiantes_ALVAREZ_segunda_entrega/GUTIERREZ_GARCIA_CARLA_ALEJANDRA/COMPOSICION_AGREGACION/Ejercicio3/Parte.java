package Ejercicio3;

public class Parte {
    private String nombre;
    private double peso;

    public Parte(String n, double p) {
        this.nombre = n;
        this.peso = p;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double p) {
        this.peso = p;
    }

    public void mostrar_info() {
        System.out.println("Parte: " + this.nombre + " | Peso: " + this.peso + " kg");
    }
}
