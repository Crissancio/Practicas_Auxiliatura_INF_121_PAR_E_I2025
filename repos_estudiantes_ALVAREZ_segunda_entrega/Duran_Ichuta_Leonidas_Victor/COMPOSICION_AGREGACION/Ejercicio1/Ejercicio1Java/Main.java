package main;
/*COMPOSICION
1. Sean las siguientes clases:
Habitación<nombre, tamaño (en metros cuadrados)
Métodos: mostrar_info() (muestra el nombre y tamaño de la habitación)
Casa<dirección, habitaciones (lista de objetos de tipo Habitación) 
Métodos: agregar_habitacion(habitacion), mostrar_casa() 
(muestra la dirección y la información de todas las habitaciones) */
public class Main {

    public static void main(String[] args) {
    //b)    
    // Crear casa
        Casa miCasa = new Casa("Calle Random 333");

        // Crear habitaciones
        Habitacion sala = new Habitacion("Sala", 30.5);
        Habitacion cocina = new Habitacion("Cocina", 64.0);
        Habitacion banio = new Habitacion("Banio principal", 3.8);

        // Agregar habitaciones
        miCasa.agregarHabitacion(sala);
        miCasa.agregarHabitacion(cocina);
        miCasa.agregarHabitacion(banio);
        //c)
        // Mostrar información completa
        miCasa.mostrarCasa();
    }
}


