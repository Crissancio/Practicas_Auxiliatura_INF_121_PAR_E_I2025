// Vehiculo.java
public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private double precio_base;

    public Vehiculo(String marca, String modelo, int año, double precio_base) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio_base = precio_base;
    }

    public void mostrar_info() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Precio base: $" + precio_base);
    }
}
