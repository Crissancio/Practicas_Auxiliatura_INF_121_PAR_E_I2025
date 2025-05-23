/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package habitación;

/**
 *
 * @author davin
 */
public class App {
    public static void main(String[] args) {
        
        System.out.println("------------------------CASA-----------------");
        Casa c1=new Casa("Calle Falsa 123");
        
        Habitación h1=new Habitación("Sala", 20.5);        
        Habitación h2=new Habitación("Cocina", 12.0);
        Habitación h3=new Habitación("Dormitorio", 15.0);
        Habitación h4=new Habitación("Bano", 5.5);
        
        c1.agregarHabitacion(h1);        
        c1.agregarHabitacion(h2);
        c1.agregarHabitacion(h3);
        c1.agregarHabitacion(h4);
        
        c1.mostrarCasa();
    }
    
}
