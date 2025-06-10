public class Moto extends Vehiculo {
    private String cilindrada;
    private String tipoMotor;

    public Moto(String marca, String modelo, int anio, double precioBase, String cilindrada, String tipoMotor) {
        super(marca, modelo, anio, precioBase);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    // Getters y Setters
    public String getCilindrada() { return cilindrada; }
    public void setCilindrada(String cilindrada) { this.cilindrada = cilindrada; }

    public String getTipoMotor() { return tipoMotor; }
    public void setTipoMotor(String tipoMotor) { this.tipoMotor = tipoMotor; }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + ", Cilindrada: " + cilindrada + ", Tipo Motor: " + tipoMotor;
    }
}
