/*
Sean las siguientes clases:
Habitación<nombre, tamaño (en metros cuadrados)
Métodos: mostrar_info() (muestra el nombre y tamaño de la habitación)
Casa<dirección, habitaciones (lista de objetos de tipo Habitación)
Métodos: agregar_habitacion(habitacion), mostrar_casa() (muestra la
dirección y la información de todas las habitaciones)
a) Implementa las clases con sus constructores, getters y setters.
b) Crea una casa y agrega varias habitaciones.
c) Muestra la información de la casa y sus habitaciones.
*/
package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        // Crear una casa
        Casa casa = new Casa("Av. Siempre Viva 742");

        // Crear habitaciones
        Habitacion sala = new Habitacion("Sala", 25.0);
        Habitacion cocina = new Habitacion("Cocina", 15.5);
        Habitacion dormitorio = new Habitacion("Dormitorio", 20.0);
        Habitacion baño = new Habitacion("Baño", 6.5);

        // Agregar habitaciones a la casa
        casa.agregar_habitacion(sala);
        casa.agregar_habitacion(cocina);
        casa.agregar_habitacion(dormitorio);
        casa.agregar_habitacion(baño);

        // Mostrar información de la casa
        casa.mostrar_casa();
    }
}

