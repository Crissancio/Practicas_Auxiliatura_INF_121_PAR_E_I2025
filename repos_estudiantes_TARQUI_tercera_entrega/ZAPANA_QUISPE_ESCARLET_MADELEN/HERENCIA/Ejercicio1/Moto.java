public class Moto extends Vehiculo {
    private String cilindrada;
    private String tipo_motor;

    public Moto(String marca, String modelo, int año, float precio_base,
                String cilindrada, String tipo_motor) {
        super(marca, modelo, año, precio_base);
        this.cilindrada = cilindrada;
        this.tipo_motor = tipo_motor;
    }

    @Override
    public void mostrar_info() {
        super.mostrar_info();
        System.out.printf("Cilindrada: %s, Tipo de motor: %s%n", cilindrada, tipo_motor);
    }
}