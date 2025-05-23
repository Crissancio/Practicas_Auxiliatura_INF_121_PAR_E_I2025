class Gerente extends Empleado {
  private String departamento;
  private double bono_gerencial;

  public Gerente(String nombre, String apellido, int salario_base, int años_antiguedad, String departamento, double bono_gerencial) {
    super(nombre, apellido, salario_base, años_antiguedad);
    this.departamento = departamento;
    this.bono_gerencial = bono_gerencial;
  }

  @Override
  public double calcularSalario() {
    return super.calcularSalario() + bono_gerencial;
  }

  @Override
  public void mostrarInformacion() {
    super.mostrarInformacion();
    System.out.println("Departamento: " + departamento);
    System.out.println("Bono gerencial: " + bono_gerencial);
  }

  public double getBonoGerencial() {
    return bono_gerencial;
  }

  public boolean bonoMayorA1000() {
    return bono_gerencial > 1000;
  }
}