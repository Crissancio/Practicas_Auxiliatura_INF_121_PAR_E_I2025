public class Coche extends Vehiculo {
    private int numPuertas;
    private String tipoCombustible;

    public Coche(String marca, String modelo, int anio, double precioBase, int numPuertas, String tipoCombustible) {
        super(marca, modelo, anio, precioBase);
        this.numPuertas = numPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    // Getters y Setters
    public int getNumPuertas() { return numPuertas; }
    public void setNumPuertas(int numPuertas) { this.numPuertas = numPuertas; }

    public String getTipoCombustible() { return tipoCombustible; }
    public void setTipoCombustible(String tipoCombustible) { this.tipoCombustible = tipoCombustible; }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + ", Puertas: " + numPuertas + ", Combustible: " + tipoCombustible;
    }
}
