class Portero extends Jugador {
  public Portero(String nombre, int numero) {
    super(nombre, numero, "Portero");
  }
  public void atajar() {
    System.out.println("El portero está atajando el balón.");
  }
}