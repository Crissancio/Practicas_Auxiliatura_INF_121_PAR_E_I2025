
public class Gerente extends Empleado {
    private String departamento;
    private double bonoGerencial;

    public Gerente(String nombre, String apellido, double salarioBase, int añosAntiguedad, String departamento,
            double bonoGerencial) {
        super(nombre, apellido, salarioBase, añosAntiguedad);
        this.departamento = departamento;
        this.bonoGerencial = bonoGerencial;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getBonoGerencial() {
        return bonoGerencial;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setBonoGerencial(double bono) {
        this.bonoGerencial = bono;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonoGerencial;
    }
}
