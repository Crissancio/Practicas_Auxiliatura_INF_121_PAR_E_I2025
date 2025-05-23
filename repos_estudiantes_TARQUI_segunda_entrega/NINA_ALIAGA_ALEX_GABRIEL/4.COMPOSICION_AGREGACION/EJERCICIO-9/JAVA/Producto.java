class Producto {
  private String nombre;
  private double precio;

  public Producto(String nombre, double precio) {
    this.nombre = nombre;
    this.precio = precio;
  }

  public String getName() {
    return nombre;
  }

  public void mostrarInfo() {
    System.out.println("Nombre: " + nombre + ", Precio: $" + precio);
  }
}