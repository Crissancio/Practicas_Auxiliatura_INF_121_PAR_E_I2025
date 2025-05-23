
package ejercicio1;


public class Ejercicio1 {

    public static void main(String[] args) {
         Casa casa = new Casa("Av. Siempre Viva 742");
        casa.agregarHabitacion(new Habitacion("Sala", 20.5));
        casa.agregarHabitacion(new Habitacion("Cocina", 12.3));
        casa.agregarHabitacion(new Habitacion("Dormitorio", 15.7));

        casa.mostrarCasa();
    }
    
}
