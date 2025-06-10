package Polimorfismo.Ej5;

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
        System.out.println("Aula -> Nombre: " + nombre + ", Capacidad: " + capacidad + ", Pupitres: " + nroPupitres);
    }

    public int cantidadMuebles() {
        return nroPupitres;
    }

    public int cantidadMuebles(int extras) {
        return nroPupitres + extras;
    }
}
