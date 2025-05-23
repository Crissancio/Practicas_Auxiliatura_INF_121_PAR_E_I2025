/*1.
Sean las siguientes clases:
Habitación<nombre, tamaño (en metros cuadrados)
Métodos: mostrar_info() (muestra el nombre y tamaño de la habitación)
Casa<dirección, habitaciones (lista de objetos de tipo Habitación) Métodos: agregar_habitacion(habitacion), mostrar_casa() (muestra la dirección y la información de todas las habitaciones)
a)
Implementa las clases con sus constructores, getters y setters.
b)
Crea una casa y agrega varias habitaciones.
c)
Muestra la información de la casa y sus habitaciones.*/
package C_1;

public class Main {

	public static void main(String[] args) {
		Habitacion hab1 = new Habitacion("Sala", 20);
        Habitacion hab2 = new Habitacion("Cocina", 12);
        Habitacion hab3 = new Habitacion("Dormitorio Principal", 18);

        Casa casa = new Casa("Av. Los Álamos #123");
        casa.agregarHabitacion(hab1);
        casa.agregarHabitacion(hab2);
        casa.agregarHabitacion(hab3);

        casa.mostrarCasa();
	}

}
