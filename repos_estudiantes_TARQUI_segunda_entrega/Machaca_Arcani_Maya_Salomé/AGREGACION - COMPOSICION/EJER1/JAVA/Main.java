/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJER1;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Casa casa = new Casa("Calle 123, Zona Central");

        Habitacion h1 = new Habitacion("Sala", 20.5);
        Habitacion h2 = new Habitacion("Cocina", 12.0);
        Habitacion h3 = new Habitacion("Dormitorio", 15.3);

        casa.agregarHabitacion(h1);
        casa.agregarHabitacion(h2);
        casa.agregarHabitacion(h3);

        casa.mostrarCasa();
    
    }
    
}
