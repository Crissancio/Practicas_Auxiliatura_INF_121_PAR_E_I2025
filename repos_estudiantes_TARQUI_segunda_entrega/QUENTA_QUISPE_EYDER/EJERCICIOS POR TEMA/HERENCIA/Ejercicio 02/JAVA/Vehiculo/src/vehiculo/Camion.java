public class Camion extends Vehiculo {
    private int capacidadCarga;

    public Camion(String marca, String modelo, int año, int capacidadCarga) {
        super(marca, modelo, año);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + " - Capacidad: " + capacidadCarga + " kg";
    }
}
