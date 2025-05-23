class Habitacion {
  private String nombre;
  private int tamano;

  public Habitacion(String nombre, int tamano) {
    this.nombre = nombre;
    this.tamano = tamano;
  }

  public void mostrarInformacion() {
    System.out.println("Habitacion: " + nombre + ", Tamaño: " + tamano + " m2");
  }
}
