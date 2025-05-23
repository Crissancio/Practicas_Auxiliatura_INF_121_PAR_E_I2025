class Coche {
  private String marca;
  private String modelo;
  private float velocidad;

  public Coche(String marca, String modelo, float velocidad) {
    this.marca = marca;
    this.modelo = modelo;
    this.velocidad = velocidad;
  }

  public void acelerar() {
    this.velocidad += 10;
  }

  public void frenar() {
    this.velocidad -= 5;
  }

  @Override
  public String toString() {
    return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", velocidad=" + velocidad + '}';
  }
}
