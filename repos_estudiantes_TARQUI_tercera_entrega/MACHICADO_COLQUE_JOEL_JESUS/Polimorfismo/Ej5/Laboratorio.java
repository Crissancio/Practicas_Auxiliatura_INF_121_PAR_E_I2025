package Polimorfismo.Ej5;

public class Laboratorio {
    private String nombre;
    private int capacidad;
    private int nroMesas;
    private int nroSillas;

    public Laboratorio(String nombre, int capacidad, int nroMesas, int nroSillas) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroMesas = nroMesas;
        this.nroSillas = nroSillas;
    }

    public void mostrar() {
        System.out.println("Laboratorio -> Nombre: " + nombre + ", Capacidad: " + capacidad + ", Mesas: " + nroMesas + ", Sillas: " + nroSillas);
    }

    public int cantidadMuebles() {
        return nroMesas + nroSillas;
    }

    public int cantidadMuebles(int extras) {
        return cantidadMuebles() + extras;
    }
}
