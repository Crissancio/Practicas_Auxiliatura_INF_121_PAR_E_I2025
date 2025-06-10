/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prac.com1;

/**
 *
 * @author WINDOWS 11
 */
public class PracCom1 {


    public static void main(String[] args) {
        Casa casa1 = new Casa("avenida siempreviva");

        Habitacion h1 = new Habitacion("cuarto", 25.0);
        Habitacion h2 = new Habitacion("Cocina", 15.0);
        Habitacion h3 = new Habitacion("sala", 20.0);
        Habitacion h4 = new Habitacion("ducha", 8.0);

        casa1.agregarHabitacion(h1);
        casa1.agregarHabitacion(h2);
        casa1.agregarHabitacion(h3);
        casa1.agregarHabitacion(h4);
        casa1.mostrarCasa();
    }
}
    


