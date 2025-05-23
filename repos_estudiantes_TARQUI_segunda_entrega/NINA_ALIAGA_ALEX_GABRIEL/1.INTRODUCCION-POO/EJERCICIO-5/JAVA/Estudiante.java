class Estudiante {
  private String nombre;
  private int nota_1;  
  private int nota_2;
  

  public Estudiante(String nombre, int nota_1, int nota_2) {
    this.nombre = nombre;
    this.nota_1 = nota_1;
    this.nota_2 = nota_2;
  }

  public String getNombre() {
    return nombre;
  }

  public int promedio() {
    return (nota_1 + nota_2) / 2;
  }

  public String aprobo() {
    return promedio() >= 6 ? "aprobo" : "no aprobo";
  }

}