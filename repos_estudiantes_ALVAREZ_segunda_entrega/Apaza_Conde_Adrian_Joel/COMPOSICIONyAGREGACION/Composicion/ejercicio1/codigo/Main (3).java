/*
1. Sean las siguientes clases:
Habitación<nombre, tamaño (en metros cuadrados)
Métodos: mostrar_info() (muestra el nombre y tamaño de la habitación)
Casa<dirección, habitaciones (lista de objetos de tipo Habitación) 
Métodos: agregar_habitacion(habitacion), mostrar_casa() (muestra la 
dirección y la información de todas las habitaciones)
a) Implementa las clases con sus constructores, getters y setters.
b) Crea una casa y agrega varias habitaciones.
c) Muestra la información de la casa y sus habitaciones.
 */
public class Main {
    public static void main(String[] args) {
        // b) Creando  una casa 
        Casa c1 = new Casa("zona 1ro de mayo plan 50 mzno k nro 11");
        Habitación h1 = new Habitación("dormitorio niños", 20.5);
        Habitación h2 = new Habitación("sala", 12.0);
        Habitación h3 = new Habitación("cocina", 15.75);
        Habitación h4 = new Habitación("baño", 8.0);
        // b) Agregqndo habitaciones a la casa
        c1.agregar_habitacion(h1);
        c1.agregar_habitacion(h2);
        c1.agregar_habitacion(h3);
        c1.agregar_habitacion(h4);
        // c) Mostrando información de la casa y sus habitaciones
        c1.mostrar_casa();
    }
}