package Herencia.Ej1;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private double precioBase;

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

    public int getAño() {
        return año;
    }
}
