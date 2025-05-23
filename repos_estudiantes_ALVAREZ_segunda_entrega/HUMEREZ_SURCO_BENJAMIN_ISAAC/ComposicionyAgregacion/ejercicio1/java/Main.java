//1. Sean las siguientes clases:
//Habitación<nombre, tamaño (en metros cuadrados)
//Métodos: mostrar_info() (muestra el nombre y tamaño de la habitación)
//Casa<dirección, habitaciones (lista de objetos de tipo Habitación)
//Métodos: agregar_habitacion(habitacion), mostrar_casa() (muestra la
//dirección y la información de todas las habitaciones)
//a) Implementa las clases con sus constructores, getters y setters.
//b) Crea una casa y agrega varias habitaciones.
//c) Muestra la información de la casa y sus habitaciones.

package ComposicionyAgregacion.ejercicio1.java;


public class Main {
    public static void main(String[] args) {
        Habitacion habitacion1 = new Habitacion("Dormitorio Principal", 20.0);
        Habitacion habitacion2 = new Habitacion("Sala de Estar", 30.5);
        Habitacion habitacion3 = new Habitacion("Cocina", 15.0);

        Casa miCasa = new Casa("Avenida Siempre Viva 742");
        miCasa.agregarHabitacion(habitacion1);
        miCasa.agregarHabitacion(habitacion2);
        miCasa.agregarHabitacion(habitacion3);

        miCasa.mostrarCasa();
    }
}


