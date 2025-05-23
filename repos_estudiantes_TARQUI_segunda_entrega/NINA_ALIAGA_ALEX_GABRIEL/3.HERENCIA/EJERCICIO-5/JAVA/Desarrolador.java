class Desarrollador extends Empleado {
  private String lenguaje_programacion;
  private double horas_extras;

  public Desarrollador(String nombre, String apellido, int salario_base, int años_antiguedad, String lenguaje_programacion, double horas_extras) {
    super(nombre, apellido, salario_base, años_antiguedad);
    this.lenguaje_programacion = lenguaje_programacion;
    this.horas_extras = horas_extras;
  }

  @Override
  public double calcularSalario() {
    return super.calcularSalario() + (horas_extras * 20);
  }

  @Override 
  public void mostrarInformacion() {
    super.mostrarInformacion();
    System.out.println("Lenguaje de programacion: " + lenguaje_programacion);
    System.out.println("Horas extras: " + horas_extras);
  }

  public boolean horasExtrasMayorA10() {
    return horas_extras > 10;
  }
}