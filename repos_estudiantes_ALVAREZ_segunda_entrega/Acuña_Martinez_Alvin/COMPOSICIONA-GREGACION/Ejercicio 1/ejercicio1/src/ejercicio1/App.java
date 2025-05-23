package ejercicio1;

public class App {
    public static void main(String[] args) {
        // b) Crear casa y agregar habitaciones
        Casa casa = new Casa("Av. Siempre Viva 742");

        Habitacion h1 = new Habitacion("Sala", 20.5);
        Habitacion h2 = new Habitacion("Dormitorio", 15.0);
        Habitacion h3 = new Habitacion("Cocina", 10.3);

        casa.agregarHabitacion(h1);
        casa.agregarHabitacion(h2);
        casa.agregarHabitacion(h3);

        // c) Mostrar información casa y habitaciones
        casa.mostrarCasa();
    }
}
