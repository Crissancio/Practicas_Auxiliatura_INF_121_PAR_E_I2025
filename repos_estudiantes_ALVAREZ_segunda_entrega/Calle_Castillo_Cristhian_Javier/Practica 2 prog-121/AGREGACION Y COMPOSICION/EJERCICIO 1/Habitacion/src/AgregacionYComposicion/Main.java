package AgregacionYComposicion;

public class Main {
    public static void main(String[] args) {
        // Crear habitaciones
        Habitacion hab1 = new Habitacion("Sala", 20);
        Habitacion hab2 = new Habitacion("Cocina", 10);
        Habitacion hab3 = new Habitacion("Dormitorio", 15);
        Habitacion hab4 = new Habitacion("Baño", 5);

        // Crear la casa
        Casa miCasa = new Casa("Av. Siempre Viva 742");

        // Agregar habitaciones
        miCasa.agregarHabitacion(hab1);
        miCasa.agregarHabitacion(hab2);
        miCasa.agregarHabitacion(hab3);
        miCasa.agregarHabitacion(hab4);

        // Mostrar la información de la casa
        miCasa.mostrarCasa();
    }
}

