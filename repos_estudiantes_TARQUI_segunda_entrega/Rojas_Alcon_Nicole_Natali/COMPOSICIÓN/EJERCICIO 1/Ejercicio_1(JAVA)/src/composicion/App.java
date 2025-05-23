package composicion;

public class App {
	public static void main(String[] args) {
        Casa miCasa = new Casa("Av. Francisco Zalles #1141");

        Habitacion hab1 = new Habitacion("Sala", 23);
        Habitacion hab2 = new Habitacion("Cocina", 12);
        Habitacion hab3 = new Habitacion("Dormitorio", 16);
        Habitacion hab4 = new Habitacion("Baño", 8);

        miCasa.agregarHabitacion(hab1);
        miCasa.agregarHabitacion(hab2);
        miCasa.agregarHabitacion(hab3);
        miCasa.agregarHabitacion(hab4);

        miCasa.mostrarCasa();
    }
}

