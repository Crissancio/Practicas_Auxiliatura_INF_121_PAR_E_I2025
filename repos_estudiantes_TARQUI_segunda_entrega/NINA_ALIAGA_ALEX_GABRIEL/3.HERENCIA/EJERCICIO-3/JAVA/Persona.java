class Persona {
  private String CI;
  private String nombre;
  private String apellido;
  private int celular;
  private int fecha_Nac;

  public Persona(String CI, String nombre, String apellido, int celular, int fecha_Nac) {
    this.CI = CI;
    this.nombre = nombre;
    this.apellido = apellido;
    this.celular = celular;
    this.fecha_Nac = fecha_Nac;
  }

  public void mostrarDatos() {
    System.out.println("CI: " + CI);
    System.out.println("Nombre: " + nombre);
    System.out.println("Apellido: " + apellido);
    System.out.println("Celular: " + celular);
    System.out.println("Fecha de Nacimiento: " + fecha_Nac);
  }

  public int getEdad() {
    int edad = 2025 - fecha_Nac;
    return edad;
  }

  public String getApellido() {
    return apellido;
  }
}
