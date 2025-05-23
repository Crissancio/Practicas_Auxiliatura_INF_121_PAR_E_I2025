public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int año, int cilindrada) {
        super(marca, modelo, año);
        this.cilindrada = cilindrada;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + " - Cilindrada: " + cilindrada + "cc";
    }
}
