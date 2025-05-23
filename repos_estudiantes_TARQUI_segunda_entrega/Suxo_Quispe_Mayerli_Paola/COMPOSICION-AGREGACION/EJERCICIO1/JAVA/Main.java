public class Main {
    public static void main(String[] args) {
        Casa miCasa = new Casa("Calle Siempre Viva #742");

        Habitacion h1 = new Habitacion("Dormitorio Principal", 25.5);
        Habitacion h2 = new Habitacion("Sala de Estar", 35.0);
        Habitacion h3 = new Habitacion("Cocina", 18.2);
        Habitacion h4 = new Habitacion("Baño", 8.0);

        miCasa.agregarHabitacion(h1);
        miCasa.agregarHabitacion(h2);
        miCasa.agregarHabitacion(h3);
        miCasa.agregarHabitacion(h4);

        // miCasa.agregarHabitacion(null); // Esto simula un error (descomenta para probar)

        System.out.println("\n--- Información de la Casa ---");
        miCasa.mostrarCasa();
    }
}
