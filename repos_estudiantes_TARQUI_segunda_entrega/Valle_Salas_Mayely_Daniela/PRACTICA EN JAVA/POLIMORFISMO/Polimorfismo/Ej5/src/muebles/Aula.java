package muebles;

public class Aula {
    private String nombre;
    private int capacidad;
    private int nropupitres;

    public Aula(String nombre, int capacidad, int nropupitres) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nropupitres = nropupitres;
    }

    public void mostrar() {
        System.out.println("Aula: " + nombre);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Número de pupitres: " + nropupitres);
    }

    public int cantidadMuebles() {
        return nropupitres; 
    }
}