/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcomposicion1;

/**
 *
 * @author Administrador
 */
public class PComposicion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Casa casa1 = new Casa("Av. Los Pinos 123");

        // Crear habitaciones
        Habitacion h1 = new Habitacion("Sala", 25.0);
        Habitacion h2 = new Habitacion("Cocina", 15.0);
        Habitacion h3 = new Habitacion("Dormitorio principal", 20.0);
        Habitacion h4 = new Habitacion("Baño", 8.0);

        // Agregar habitaciones a la casa
        casa1.agregarHabitacion(h1);
        casa1.agregarHabitacion(h2);
        casa1.agregarHabitacion(h3);
        casa1.agregarHabitacion(h4);

        // Mostrar la información de la casa y sus habitaciones
        casa1.mostrarCasa();
    }
}
    

