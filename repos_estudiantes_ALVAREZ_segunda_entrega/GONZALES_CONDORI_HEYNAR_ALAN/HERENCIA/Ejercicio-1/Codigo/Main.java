/*
1. Modelar diferentes tipos de vehículos. Las clases deben tener las siguientes
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
d) Mostrar los coches y motos actuales (gestión 2025)

*/
package Ejercicio01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla", 2025, 20000, 4, "Gasolina");
        Coche coche2 = new Coche("Ford", "Explorer", 2023, 35000, 5, "Diésel");
        Moto moto1 = new Moto("Yamaha", "YZF-R3", 2025, 5500, 321, "2 tiempos");

        // Mostrar información
        System.out.println("Información de los vehículos:");
        coche1.mostrar_info();
        System.out.println();
        coche2.mostrar_info();
        System.out.println();
        moto1.mostrar_info();

        // Lista para manejar todos los vehículos
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(coche1);
        vehiculos.add(coche2);
        vehiculos.add(moto1);

        // c) Mostrar coches con más de 4 puertas
        System.out.println("\nCoches con más de 4 puertas:");
        for (Vehiculo v : vehiculos) {
            if (v instanceof Coche) {
                Coche c = (Coche) v;
                if (c.getNumPuertas() > 4) {
                    c.mostrar_info();
                    System.out.println();
                }
            }
        }

        // d) Mostrar vehículos del año 2025
        System.out.println("\nVehículos de la gestión 2025:");
        for (Vehiculo v : vehiculos) {
            if (v.getAño() == 2025) {
                v.mostrar_info();
                System.out.println();
            }
        }
    }
}
