import java.util.ArrayList;
import java.util.List;

class Habitacion {
    private final String nombre;
    private final float tamaño;

    public Habitacion(String nombre, float tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    public void mostrar_info() {
        System.out.println("Habitación: " + nombre + ", Tamaño: " + tamaño + " m²");
    }
}

class Casa {
    private String dirección;
    private final List<Habitacion> habitaciones;

    public Casa(String dirección) {
        this.dirección = dirección;
        this.habitaciones = new ArrayList<>();
    }

    public Casa(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public void agregar_habitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public void mostrar_casa() {
        System.out.println("Casa en: " + dirección);
        System.out.println("Habitaciones:");
        for (Habitacion h : habitaciones) {
            h.mostrar_info();
        }
    }
}

public class MainCasa {
    public static void main(String[] args) {
        Casa miCasa = new Casa("Av. Siempre Viva 123");

        miCasa.agregar_habitacion(new Habitacion("Sala", 20.5f));
        miCasa.agregar_habitacion(new Habitacion("Cocina", 15.0f));
        miCasa.agregar_habitacion(new Habitacion("Dormitorio Principal", 25.0f));
        miCasa.agregar_habitacion(new Habitacion("Baño", 8.0f));

        miCasa.mostrar_casa();
    }
}