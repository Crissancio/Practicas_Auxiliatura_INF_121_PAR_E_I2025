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
public class Main {
    public static void main(String[] args) {
        Coche[] coches = new Coche[10];
        Moto[] motos = new Moto[10];
        int contC = 0;
        int contM = 0;
        // b) Crear instancias de Coche y Moto y mostrar su información
        coches[contC++] = new Coche("Toyota", "Corolla", 2020, 25000, 4, "Gasolina");
        coches[contC++] = new Coche("Ford", "Fiesta", 2021, 18000, 2, "Diésel");
        coches[contC++] = new Coche("Volkswagen", "Passat", 2022, 32000, 5, "Híbrido");
        motos[contM++] = new Moto("Honda", "CBR600", 2021, 12000, 600, "4 tiempos");
        motos[contM++] = new Moto("Yamaha", "MT-07", 2022, 8500, 700, "2 tiempos");
        
        for (int i = 0; i < contC; i++) {
            coches[i].mostrar_Info();
        }
        for (int i = 0; i < contM; i++) {
            motos[i].mostrar_Info();
        }
        System.out.println("__________________");
        // c) Mostrar coches con más de 4 puertas
        Coche.mostrarCochemas4puertas(coches, contC);
        System.out.println("__________________");
        // d) Mostrar vehículos actuales (2025)
        Coche.cocheactual2025(coches, contC);
        Moto.motoactual2025(motos, contM);
    }
}