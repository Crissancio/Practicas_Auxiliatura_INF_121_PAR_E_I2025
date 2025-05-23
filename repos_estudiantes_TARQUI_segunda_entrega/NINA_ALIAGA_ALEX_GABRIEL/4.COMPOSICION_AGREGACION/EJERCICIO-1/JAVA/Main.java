class Main {
  public static void main(String[] args) {
    Casa casa = new Casa("Calle Principal 123");
    Habitacion cocina = new Habitacion("Cocina", 20);
    Habitacion salon = new Habitacion("Salón", 30);
    Habitacion dormitorio = new Habitacion("Dormitorio", 15);
    Habitacion bano = new Habitacion("Baño", 10);
    casa.agregarHabitacion(cocina);
    casa.agregarHabitacion(salon);
    casa.agregarHabitacion(dormitorio);
    casa.agregarHabitacion(bano);

    casa.mostrarCasa();
  }
}