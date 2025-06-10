package EJERCICIO8;

public class Aula {
    private String nombre;
    private int capacidad;
    private int nroPupitres;

    public Aula(String nombre, int capacidad, int nroPupitres) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroPupitres = nroPupitres;
    }

    public void mostrar() {
        System.out.println("Aula: " + nombre);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Número de pupitres: " + nroPupitres);
    }
    
    public int cantidadMuebles() {
        return nroPupitres;
    }
}
