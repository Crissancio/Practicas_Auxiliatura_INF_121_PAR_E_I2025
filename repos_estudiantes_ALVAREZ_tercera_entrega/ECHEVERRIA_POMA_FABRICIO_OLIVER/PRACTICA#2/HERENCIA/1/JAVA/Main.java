/*
-------------------EJERCICIO 1-------------------

Modelar diferentes tipos de vehículos. Las clases deben tener las siguientes
características:
Vehículo&lt;marca, modelo, año, precio_base&gt;
Métodos: mostrar_info() muestra la información básica del vehículo
Coche (hereda de Vehículo)&lt; num_puertas, tipo_combustible&gt;
Métodos: mostrar_info() debe mostrar la información básica más los
atributos adicionales
Moto (hereda de Vehículo)&lt; cilindrada, tipo_motor&gt;
Métodos: mostrar_info() debe mostrar la información básica más los
atributos adicionales
a) Implementa las clases con sus constructores, getters y setters.
b) Crea instancias de Coche y Moto y muestra su información usando el
método mostrar_info().
c) Muestra todos los coches que tienen más de 4 puertas.
d) Mostrar los coches y motos actuales (gestión 2025)
 */


public class Main {
    public static void main(String[] args) {
        //B
        Coche coche1 = new Coche("Tesla", "Model S", 2022, 1999, 4, "Electrico");
        Coche coche2 = new Coche("Ford", "Mustang", 2021, 1000, 2, "Gasolina");
        Moto moto1 = new Moto("Yamaha", "YZF-R3", 2020, 4999, 3, "Deportivo");
        Moto moto2 = new Moto("Claro", "750", 2019, 7233, 3, "Clasico");

        System.out.println("Informacion de los vehiculos:");
        coche1.mostrarInfo();
        System.out.println();
        coche2.mostrarInfo();
        System.out.println();
        moto1.mostrarInfo();
        System.out.println();
        moto2.mostrarInfo();
        System.out.println();
        //C
        System.out.println("Coches con mas de 4 puertas:");
        Vehiculo[] vehiculos = {coche1, coche2, moto1, moto2};
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo instanceof Coche) {
                Coche coche = (Coche) vehiculo;
                if (coche.getNumPuertas() > 4) {
                    coche.mostrarInfo();
                    System.out.println();
                }
            }
        }
        //D
        System.out.println("Vehículos actuales 2025:");
        for (Vehiculo vehiculo : vehiculos) {
            if ((vehiculo instanceof Coche || vehiculo instanceof Moto) && vehiculo.getAño() >= 2021) {
                vehiculo.mostrarInfo();
                System.out.println();
            }
        }
    }
}