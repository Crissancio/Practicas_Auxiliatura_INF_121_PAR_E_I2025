package ejem5;

public class Gerente extends Empleado {
    private String departamento;
    private double bonoGerencial;

    public Gerente(String nombre, String apellido, double salarioBase, int aniosAntiguedad, String departamento, double bonoGerencial) {
        super(nombre, apellido, salarioBase, aniosAntiguedad);
        this.departamento = departamento;
        this.bonoGerencial = bonoGerencial;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonoGerencial;
    }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    public double getBonoGerencial() { return bonoGerencial; }
    public void setBonoGerencial(double bonoGerencial) { this.bonoGerencial = bonoGerencial; }
}
