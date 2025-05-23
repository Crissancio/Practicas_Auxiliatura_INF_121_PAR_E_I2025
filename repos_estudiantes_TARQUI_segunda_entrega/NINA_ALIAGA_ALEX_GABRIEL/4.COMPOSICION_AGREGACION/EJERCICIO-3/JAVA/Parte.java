class Parte {
  private String nombre;
  private int peso;

  public Parte(String nombre, int peso) {
    this.nombre = nombre;
    this.peso = peso;
  }
  public void mostrarInfo() {
    System.out.println("Nombre: " + nombre + ", Peso: " + peso);
  }
}