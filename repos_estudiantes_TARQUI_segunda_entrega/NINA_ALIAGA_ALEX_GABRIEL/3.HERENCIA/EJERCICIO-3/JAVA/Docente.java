class Docente extends Persona {
  private int NIT;
  private String profesion;
  private String especialidad;

  public Docente(String CI, String nombre, String apellido, int celular, int fecha_Nac, int NIT, String profesion, String especialidad) {
    super(CI, nombre, apellido, celular, fecha_Nac);
    this.NIT = NIT;
    this.profesion = profesion;
    this.especialidad = especialidad;
  }

  public void mostrarDatos() {
    super.mostrarDatos();
    System.out.println("NIT: " + NIT);
    System.out.println("Fecha de Ingreso: " + profesion);
    System.out.println("Semestre: " + especialidad);
  }

  public String getProfesion() {
    return profesion;
  }
}