// 1. Modelar diferentes tipos de vehículos. Las clases deben tener las siguientes características:
// Vehículo<marca, modelo, año, precio_base>
// Métodos: mostrar_info() muestra la información básica del vehículo
// Coche (hereda de Vehículo)<num_puertas, tipo_combustible>
// Métodos: mostrar_info() debe mostrar la información básica más los atributos adicionales
// Moto (hereda de Vehículo)<cilindrada, tipo_motor>
// Métodos: mostrar_info() debe mostrar la información básica más los atributos adicionales

package Ejercicio1java;

public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anio;
    protected double precioBase;
    //
    // a) Constructor
    public Vehiculo(String marca, String modelo, int anio, double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precioBase = precioBase;
    }

    // a) Método mostrar_info()
    public void mostrarInfo() {
        System.out.printf("Marca: %s, Modelo: %s, Año: %d, Precio Base: %.2f\n",
                marca, modelo, anio, precioBase);
    }

    public int getAnio() {
        return anio;
    }
}
