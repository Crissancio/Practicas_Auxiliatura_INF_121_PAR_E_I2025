public class Moto extends Vehiculo{
    private int cilindrada;
    private String tipo_motor;

    public Moto(String marca, String modelo, int año, double precio_base, int cilindrada, String tipo_motor) {
        super(marca, modelo, año, precio_base);
        this.cilindrada = cilindrada;
        this.tipo_motor = tipo_motor;
    }
    
    @Override
    public void mostrar_info() {
        super.mostrar_info();
        System.out.println("Cilindrada: " + cilindrada + "cc");
        System.out.println("Tipo de motor: " + tipo_motor);
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoMotor() {
        return tipo_motor;
    }

    public void setTipoMotor(String tipo_motor) {
        this.tipo_motor = tipo_motor;
    }
}
