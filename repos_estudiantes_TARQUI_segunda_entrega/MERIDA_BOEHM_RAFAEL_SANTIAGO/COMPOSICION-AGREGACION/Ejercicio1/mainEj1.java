package Ejercicio1;

public class mainEj1 {
    public static void main(String[] args) {
        Casa casa1 = new Casa("Av. Siempre Viva 123");

        Habitacion hab1 = new Habitacion("Sala", 20.5);
        Habitacion hab2 = new Habitacion("Cocina", 12.3);
        Habitacion hab3 = new Habitacion("Dormitorio", 15.0);

        casa1.agregarHabitacion(hab1);
        casa1.agregarHabitacion(hab2);
        casa1.agregarHabitacion(hab3);

        casa1.mostrarCasa();
    }
}
