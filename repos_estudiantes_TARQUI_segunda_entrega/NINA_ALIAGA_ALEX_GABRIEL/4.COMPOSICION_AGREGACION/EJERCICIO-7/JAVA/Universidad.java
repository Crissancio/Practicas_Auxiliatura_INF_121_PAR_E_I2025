import java.util.ArrayList;

class Universidad {
  private String nombre;
  private ArrayList<Estudiante> estudiantes;

  public Universidad(String nombre) {
    this.nombre = nombre;
    this.estudiantes = new ArrayList<>();
  }

  public void agregarEstudiante(Estudiante estudiante) {
    estudiantes.add(estudiante);
  }

  public void mostrarEstudiantes() {
    for (Estudiante estudiante : estudiantes) {
      estudiante.mostrarInfo();
      System.out.println("---------------------");
    }
  }
}