package ComposicionyAgregacion.Composicion.Ej1;

public class Main {
    public static void main(String[] args) {
        Casa miCasa = new Casa("Av. Siempre Viva 742");

        miCasa.agregarHabitacion(new Habitacion("Sala", 20.5));
        miCasa.agregarHabitacion(new Habitacion("Cocina", 12.3));
        miCasa.agregarHabitacion(new Habitacion("Dormitorio", 15.0));
        miCasa.agregarHabitacion(new Habitacion("Baño", 6.7));

        miCasa.mostrarCasa();
    }
}
