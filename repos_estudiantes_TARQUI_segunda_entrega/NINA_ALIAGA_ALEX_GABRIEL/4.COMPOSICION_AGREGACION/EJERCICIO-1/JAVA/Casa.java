import java.util.ArrayList;

class Casa {
  private String direccion;
  private ArrayList<Habitacion> habitaciones;

  public Casa(String direccion) {
    this.direccion = direccion;
    this.habitaciones = new ArrayList<>();
  }

  public void agregarHabitacion(Habitacion habitacion) {
    habitaciones.add(habitacion);
  }

  public void mostrarCasa() {
    System.out.println("Casa en dirección: " + direccion);
    System.out.println("Habitaciones:");
    for (Habitacion habitacion : habitaciones) {
      habitacion.mostrarInformacion();
    }
  }
}