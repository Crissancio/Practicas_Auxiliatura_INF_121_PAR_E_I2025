package HERENCIA.EJER_1;
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
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + año);
        System.out.println("Precio Base: $" + precioBase);
    }
     public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }
    public double getPrecioBase() {
        return precioBase;
    }
}