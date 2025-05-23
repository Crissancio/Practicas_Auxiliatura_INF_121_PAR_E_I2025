package ComposicionAgregacion.Ejer1.codigo;

public class Main {
//COMPOSICION
//1. Sean las siguientes clases:
//Habitación<nombre, tamaño (en metros cuadrados)
//Métodos: mostrar_info() (muestra el nombre y tamaño de la habitación)
//Casa<dirección, habitaciones (lista de objetos de tipo Habitación)
//Métodos: agregar_habitacion(habitacion), mostrar_casa() (muestra la
//dirección y la información de todas las habitaciones)
//a) Implementa las clases con sus constructores, getters y setters.
//b) Crea una casa y agrega varias habitaciones.
//c) Muestra la información de la casa y sus habitaciones.

    public static void main(String[] args) {

        Habitacion habitacion1 = new Habitacion("Sala", 25.0);
        Habitacion habitacion2 = new Habitacion("Cocina", 15.0);
        Casa casa1 = new Casa(" Calle Linares ", habitacion1);
        Casa casa2 = new Casa(" Calle Brujas ", habitacion2);
        System.out.println(casa1);
        System.out.println(casa2);

    }

}
