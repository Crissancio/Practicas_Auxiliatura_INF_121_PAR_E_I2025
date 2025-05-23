class MedioCampista extends Jugador {
  public MedioCampista(String nombre, int numero) {
    super(nombre, numero, "Medio Campista");
  }
  public void pasar() {
    System.out.println("El medio campista está pasando el balón.");
  }
  public void regatear() {
    System.out.println("El medio campista está regateando.");
  }
}