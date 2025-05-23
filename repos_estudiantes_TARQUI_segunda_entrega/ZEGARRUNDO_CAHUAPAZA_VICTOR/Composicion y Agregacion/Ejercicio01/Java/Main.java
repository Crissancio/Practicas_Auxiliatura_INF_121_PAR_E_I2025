package Composicion;

public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa("Av. Siempre Viva 123");

        Habitacion h1 = new Habitacion("Sala", 20);
        Habitacion h2 = new Habitacion("Cocina", 12);
        Habitacion h3 = new Habitacion("Dormitorio", 15);

        casa.agregarHabitacion(h1);
        casa.agregarHabitacion(h2);
        casa.agregarHabitacion(h3);

        casa.mostrarCasa();
    }
}