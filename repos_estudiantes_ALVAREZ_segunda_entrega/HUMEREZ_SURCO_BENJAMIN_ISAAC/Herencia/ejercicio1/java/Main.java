//1. Modelar diferentes tipos de vehículos. Las clases deben tener las siguientes
//características:
//Vehículo<marca, modelo, año, precio_base>
//Métodos: mostrar_info() muestra la información básica del vehículo
//Coche (hereda de Vehículo)< num_puertas, tipo_combustible>
//Métodos: mostrar_info() debe mostrar la información básica más los
//atributos adicionales
//Moto (hereda de Vehículo)< cilindrada, tipo_motor>
//Métodos: mostrar_info() debe mostrar la información básica más los
//atributos adicionales
//a) Implementa las clases con sus constructores, getters y setters.
//b) Crea instancias de Coche y Moto y muestra su información usando el
//método mostrar_info().
//c) Muestra todos los coches que tienen más de 4 puertas.
//d) Mostrar los coches y motos actuales (gestión 2025)

package Herencia.ejercicio1.java;

public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla", 2025, 15000, 4, "Gasolina");
        Coche coche2 = new Coche("BMW", "Serie 5", 2025, 45000, 5, "Diesel");
        Moto moto1 = new Moto("Honda", "CBR600", 2025, 12000, 600, "4 tiempos");

        coche1.mostrarInfo();
        coche2.mostrarInfo();
        moto1.mostrarInfo();

        System.out.println("\nCoches con más de 4 puertas:");
        if (coche2.getNumPuertas() > 4) coche2.mostrarInfo();

        System.out.println("\nVehículos actuales (gestión 2025):");
        if (coche1.año == 2025) coche1.mostrarInfo();
        if (coche2.año == 2025) coche2.mostrarInfo();
        if (moto1.año == 2025) moto1.mostrarInfo();
    }
}
