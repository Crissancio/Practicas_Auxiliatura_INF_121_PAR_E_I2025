class Defensa extends Jugador {
  public Defensa(String nombre, int numero) {
    super(nombre, numero, "Defensa");
  }
  public void defender() {
    System.out.println("El defensa está defendiendo.");
  }
}