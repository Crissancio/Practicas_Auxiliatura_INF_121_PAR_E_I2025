package Herencia.Ej5;

public class Gerente extends Empleado {
    private String departamento;
    private double bonoGerencial;

    public Gerente(String nombre, String apellido, double salarioBase, int añosAntiguedad, String departamento, double bonoGerencial) {
        super(nombre, apellido, salarioBase, añosAntiguedad);
        this.departamento = departamento;
        this.bonoGerencial = bonoGerencial;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonoGerencial;
    }

    public double getBonoGerencial() {
        return bonoGerencial;
    }
}
