public class Auto extends Vehiculo {
    private int nroPuertas;

    public Auto(String marca, String modelo, int año, int nroPuertas) {
        super(marca, modelo, año);
        this.nroPuertas = nroPuertas;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + " - Puertas: " + nroPuertas;
    }
}
