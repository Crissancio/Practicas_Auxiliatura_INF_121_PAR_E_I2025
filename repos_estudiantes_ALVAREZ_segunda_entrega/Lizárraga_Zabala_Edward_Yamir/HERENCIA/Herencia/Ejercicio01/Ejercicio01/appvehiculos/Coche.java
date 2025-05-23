
package appvehiculos;

public class Coche extends Vehiculo {
    private int numPuertas;
    private String tipoCombustible;

    public Coche(String marca, String modelo, int año, double precioBase, int numPuertas, String tipoCombustible) {
        super(marca, modelo, año, precioBase);
        this.numPuertas = numPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + ", Puertas: " + numPuertas + ", Combustible: " + tipoCombustible;
    }

    public int getNumPuertas() {
        return numPuertas;
    }
}

