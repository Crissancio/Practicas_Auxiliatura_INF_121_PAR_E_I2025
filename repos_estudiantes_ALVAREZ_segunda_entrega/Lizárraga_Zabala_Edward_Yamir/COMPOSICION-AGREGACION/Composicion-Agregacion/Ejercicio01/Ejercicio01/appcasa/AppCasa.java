
package appcasa;

public class AppCasa {
    public static void main(String[] args) {
        // (b) Crear casa y agregar habitaciones
        Casa casa = new Casa("Av. Bolivar #456");
        casa.agregarHabitacion(new Habitacion("Sala", 30.0));
        casa.agregarHabitacion(new Habitacion("Cocina", 18.5));
        casa.agregarHabitacion(new Habitacion("Dormitorio", 22.0));

        // (c) Mostrar información
        System.out.println("\n--- INFORMACION DE LA CASA ---");
        casa.mostrarCasa();
    }
}

