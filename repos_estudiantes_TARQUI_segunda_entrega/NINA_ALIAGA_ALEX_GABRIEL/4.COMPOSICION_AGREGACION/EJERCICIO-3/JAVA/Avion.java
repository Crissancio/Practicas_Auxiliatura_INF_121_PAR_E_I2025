import java.util.ArrayList;

class Avion {
  private String modelo;
  private String fabricante;
  private ArrayList<Parte> partes;

  public Avion(String modelo, String fabricante) {
    this.modelo = modelo;
    this.fabricante = fabricante;
    this.partes = new ArrayList<>();
  }

  public int getCantidadPartes() {
    return partes.size();
  }

  public void agregarParte(Parte parte) {
    partes.add(parte);
  }

  public void mostrarAvion() {
    System.out.println("Modelo del avion: " + modelo + ", Fabricante: " + fabricante);
    for (Parte parte : partes) {
      parte.mostrarInfo();
    }
  }

  
}