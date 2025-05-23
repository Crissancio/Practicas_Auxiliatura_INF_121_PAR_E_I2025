package vehiculosjava;

public class Moto extends Vehiculo {
    public int cilindrada;
    public String tipo_motor;

    public Moto(String marca, String modelo, int anio, double precio_base, int cilindrada, String tipo_motor) {
        super(marca, modelo, anio, precio_base);
        this.cilindrada = cilindrada;
        this.tipo_motor = tipo_motor;
    }

    public int getCilindrada() { return cilindrada; }
    public String getTipoMotor() { return tipo_motor; }

    @Override
    public void mostrar_info() {
        super.mostrar_info();
        System.out.println("Cilindrada: " + cilindrada + "cc");
        System.out.println("Tipo de motor: " + tipo_motor);
    }
}