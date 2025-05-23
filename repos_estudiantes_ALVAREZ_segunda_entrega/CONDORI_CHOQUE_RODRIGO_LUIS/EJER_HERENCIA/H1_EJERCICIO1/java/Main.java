/*1. Modelar diferentes tipos de vehículos. Las clases deben tener las siguientes
características:
Vehículo<marca, modelo, año, precio_base>
Métodos: mostrar_info() muestra la información básica del vehículo
Coche (hereda de Vehículo)< num_puertas, tipo_combustible>
Métodos: mostrar_info() debe mostrar la información básica más los
atributos adicionales
Moto (hereda de Vehículo)< cilindrada, tipo_motor>
Métodos: mostrar_info() debe mostrar la información básica más los
atributos adicionales
a) Implementa las clases con sus constructores, getters y setters.
b) Crea instancias de Coche y Moto y muestra su información usando el
método mostrar_info().
c) Muestra todos los coches que tienen más de 4 puertas.
d) Mostrar los coches y motos actuales (gestión 2025)*/
package H_1;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        Coche coche1 = new Coche("Toyota", "Corolla", 2025, 20000, 4, "Gasolina");
        Coche coche2 = new Coche("Chevrolet", "Trailblazer", 2023, 30000, 5, "Diesel");
        Moto moto1 = new Moto("Yamaha", "FZ", 2025, 15000, 250, "4 tiempos");

        vehiculos.add(coche1);
        vehiculos.add(coche2);
        vehiculos.add(moto1);

        System.out.println("\n=== Información de todos los vehículos ===");
        for (Vehiculo v : vehiculos) {
            v.mostrarInfo();
            System.out.println();
        }

        System.out.println("=== Coches con más de 4 puertas ===");
        for (Vehiculo v : vehiculos) {
            if (v instanceof Coche && ((Coche) v).getNumPuertas() > 4) {
                v.mostrarInfo();
                System.out.println();
            }
        }

        System.out.println("=== Vehículos del año 2025 ===");
        for (Vehiculo v : vehiculos) {
            if (v.getAño() == 2025) {
                v.mostrarInfo();
                System.out.println();
            }
        }

	}

}
