public class Moto extends Vehiculo{
    public int cilindrada;
    public String motor;

    public Moto(String marca, String modelo, int año, double precio, int cilindrada, String motor) {
        super(marca, modelo, año, precio);
        this.cilindrada = cilindrada;
        this.motor = motor;
    }

    public String mostrar() {
        return super.mostrar() + "cilindrada: " + cilindrada + "motor: " + motor;
    }
}
