public class Ejercicio1Composicion {
    public static void main(String[] args) {
        Casa casa = new Casa("Av. Siempre Viva 742");
        casa.mostrarCasa();
    }
}

class Habitacion {
    private String nombre;
    private float tamano;

    public Habitacion(String nombre, float tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
    }

    public void mostrarInfo() {
        System.out.println("Habitación: " + nombre + ", Tamaño: " + tamano + " m²");
    }
}

class Casa {
    private String direccion;
    private Habitacion[] habitaciones;

    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new Habitacion[3];
        crearHabitaciones();
    }

    private void crearHabitaciones() {
        habitaciones[0] = new Habitacion("Sala", 25.0f);
        habitaciones[1] = new Habitacion("Cocina", 15.0f);
        habitaciones[2] = new Habitacion("Dormitorio", 20.0f);
    }

    public void mostrarCasa() {
        System.out.println("Dirección: " + direccion);
        for (Habitacion h : habitaciones) {
            h.mostrarInfo();
        }
    }
}
