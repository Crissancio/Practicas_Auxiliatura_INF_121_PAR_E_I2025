/*
 *TEMA: COMPOSICION

--------------EJERCICIO 1 ----------------

Sean las siguientes clases:

Habitación&lt;nombre, tamaño (en metros cuadrados)
Métodos: mostrar_info() (muestra el nombre y tamaño de la habitación)
Casa&lt;dirección, habitaciones (lista de objetos de tipo Habitación)
Métodos: agregar_habitacion(habitacion), mostrar_casa() (muestra la
dirección y la información de todas las habitaciones)
a) Implementa las clases con sus constructores, getters y setters.
b) Crea una casa y agrega varias habitaciones.
c) Muestra la información de la casa y sus habitaciones.
 * 
 */


public class Main {
    public static void main(String[] args) {
        //B)
        Casa casa = new Casa("Calle Principal 123");
        casa.agregar_habitacion(new Habitacion("Sala", 25.5f));
        casa.agregar_habitacion(new Habitacion("Cocina", 15.0f));
        casa.agregar_habitacion(new Habitacion("Dormitorio", 20.0f));

        //C)
        casa.mostrar_casa();
    }
}