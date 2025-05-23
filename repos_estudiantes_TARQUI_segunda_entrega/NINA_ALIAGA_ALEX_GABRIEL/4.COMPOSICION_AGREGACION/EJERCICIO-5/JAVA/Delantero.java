class Delantero extends Jugador {
  public Delantero(String nombre, int numero) {
    super(nombre, numero, "Delantero");
  }
  public void marcarGol() {
    System.out.println("El delantero está marcando gol.");
  }
}
