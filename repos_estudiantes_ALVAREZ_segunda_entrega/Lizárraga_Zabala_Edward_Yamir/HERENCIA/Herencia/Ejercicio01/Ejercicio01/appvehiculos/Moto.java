
package appvehiculos;

public class Moto extends Vehiculo {
    private int cilindrada;
    private String tipoMotor;

    public Moto(String marca, String modelo, int año, double precioBase, int cilindrada, String tipoMotor) {
        super(marca, modelo, año, precioBase);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + ", Cilindrada: " + cilindrada + "cc, Motor: " + tipoMotor;
    }
}

