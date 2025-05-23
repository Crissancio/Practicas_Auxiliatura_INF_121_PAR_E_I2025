class Empleado {
  private String nombre;
  private String apellido;
  private double salario_base;
  private int años_antiguedad;

  public Empleado(String nombre, String apellido, int salario_base, int años_antiguedad) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.salario_base = salario_base;
    this.años_antiguedad = años_antiguedad;
  }

  public double calcularSalario() {
    double porcentaje = salario_base * 0.05;
    return salario_base + (porcentaje * años_antiguedad);
  }

  public void mostrarInformacion() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Apellido: " + apellido);
    System.out.println("Salario base: " + salario_base);
    System.out.println("Años de antiguedad: " + años_antiguedad);
  }
}