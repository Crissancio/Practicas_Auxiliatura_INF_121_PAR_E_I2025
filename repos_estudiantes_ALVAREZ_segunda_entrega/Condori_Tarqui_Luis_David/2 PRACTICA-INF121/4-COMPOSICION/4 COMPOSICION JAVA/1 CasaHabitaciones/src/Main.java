public class Main {
    public static void main(String[] args) {

        Habitacion h1 = new Habitacion("Sala", 20);
        Habitacion h2 = new Habitacion("Cocina", 12);
        Habitacion h3 = new Habitacion("Dormitorio", 15);

        // Crear casa y habitaciones
        Casa casa = new Casa("Av. civica 432");
        casa.agregarHabitacion(h1);
        casa.agregarHabitacion(h2);
        casa.agregarHabitacion(h3);

        // Mostrar la información de la casa
        casa.mostrarCasa();
    }
}
