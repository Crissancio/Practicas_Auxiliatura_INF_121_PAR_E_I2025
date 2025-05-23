class Estudiante extends Persona {
  private String RU;
  private String fecha_Ingreso;
  private int semestre;

  public Estudiante(String CI, String nombre, String apellido, int celular, int fecha_Nac, String RU, String fecha_Ingreso, int semestre){
    super(CI, nombre, apellido, celular, fecha_Nac);
    this.RU = RU;
    this.fecha_Ingreso = fecha_Ingreso;
    this.semestre = semestre;
  }

  public void mostrarDatos() {
    super.mostrarDatos();
    System.out.println("RU: " + RU);
    System.out.println("Fecha de Ingreso: " + fecha_Ingreso);
    System.out.println("Semestre: " + semestre);
  }
}

