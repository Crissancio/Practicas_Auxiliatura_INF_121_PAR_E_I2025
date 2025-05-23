package vehiculosjava;

public class Vehiculo {
    public String marca;
    public String modelo;
    public int anio;
    public double precio_base;

    public Vehiculo(String marca, String modelo, int anio, double precio_base) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio_base = precio_base;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAnio() { return anio; }
    public double getPrecioBase() { return precio_base; }

    public void mostrar_info() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Precio base: $" + precio_base);
    }
}