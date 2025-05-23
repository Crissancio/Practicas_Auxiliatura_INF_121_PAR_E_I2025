class Jugador {
  private String nombre;
  private int numero;
  private String posicion;

  public Jugador(String nombre, int numero, String posicion) {
    this.nombre = nombre;
    this.numero = numero;
    this.posicion = posicion;
  }

  public void mostrarInfo() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Número: " + numero);
    System.out.println("Posición: " + posicion);
  }
}