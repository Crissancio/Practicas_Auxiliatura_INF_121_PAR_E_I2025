
package Ejercicio01;

// Clase base Vehículo
public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int año;
    protected double precioBase;

    public Vehiculo(String marca, String modelo, int año, double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precioBase = precioBase;
    }

    public void mostrar_info() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Precio base: $" + precioBase);
    }

    // Getters y setters
    public int getAño() {
        return año;
    }
}
