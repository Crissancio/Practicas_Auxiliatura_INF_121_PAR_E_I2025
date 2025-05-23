package Ejercicio1java;

public class Moto extends Vehiculo {
    private int cilindrada;
    private String tipoMotor;

    // a) Constructor
    public Moto(String marca, String modelo, int anio, double precioBase, int cilindrada, String tipoMotor) {
        super(marca, modelo, anio, precioBase);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    // a) Método mostrar_info() sobrescrito
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.printf("Cilindrada: %dcc, Motor: %s\n", cilindrada, tipoMotor);
    }
}
