
package Ejercicio01;

// Clase Coche que hereda de Vehiculo
public class Coche extends Vehiculo {
    private int numPuertas;
    private String tipoCombustible;

    public Coche(String marca, String modelo, int año, double precioBase, int numPuertas, String tipoCombustible) {
        super(marca, modelo, año, precioBase);
        this.numPuertas = numPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public void mostrar_info() {
        super.mostrar_info();
        System.out.println("Número de puertas: " + numPuertas);
        System.out.println("Tipo de combustible: " + tipoCombustible);
    }

    public int getNumPuertas() {
        return numPuertas;
    }
}

