package COMPOSICION_AGREGACION.EJER_1;
public class Main {
    public static void main(String[] args) {
        // Crear casa
        Casa miCasa = new Casa("Av. Siempre Viva 123");
        // Crear habitaciones (solo existen dentro de la casa)
        Habitacion sala = new Habitacion("Sala", 20.5);
        Habitacion cocina = new Habitacion("Cocina", 12.0);
        Habitacion dormitorio = new Habitacion("Dormitorio Principal", 15.75);
        miCasa.agregarHabitacion(sala);
        miCasa.agregarHabitacion(cocina);
        miCasa.agregarHabitacion(dormitorio);
        miCasa.mostrarCasa();
  
    }
  
}
