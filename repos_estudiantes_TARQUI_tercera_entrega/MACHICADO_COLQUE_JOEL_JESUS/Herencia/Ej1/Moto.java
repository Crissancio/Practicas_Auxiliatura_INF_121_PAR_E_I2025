package Herencia.Ej1;

public class Moto extends Vehiculo {
    private int cilindrada;
    private String tipoMotor;

    public Moto(String marca, String modelo, int año, double precioBase, int cilindrada, String tipoMotor) {
        super(marca, modelo, año, precioBase);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    @Override
    public void mostrar_info() {
        super.mostrar_info();
        System.out.println("Cilindrada: " + cilindrada + "cc");
        System.out.println("Tipo de motor: " + tipoMotor);
    }
}
