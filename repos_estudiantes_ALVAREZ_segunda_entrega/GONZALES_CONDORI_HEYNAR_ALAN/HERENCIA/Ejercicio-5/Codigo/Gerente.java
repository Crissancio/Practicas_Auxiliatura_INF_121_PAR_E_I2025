
package Ejercicio05;

public class Gerente extends Empleado {
    private String departamento;
    private double bonoGerencial;

    public Gerente(String nombre, String apellido, double salarioBase, int añosAntiguedad,
                   String departamento, double bonoGerencial) {
        super(nombre, apellido, salarioBase, añosAntiguedad);
        this.departamento = departamento;
        this.bonoGerencial = bonoGerencial;
    }

    @Override
    public double calcular_salario() {
        return super.calcular_salario() + bonoGerencial;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Departamento: " + departamento);
        System.out.println("Bono gerencial: $" + bonoGerencial);
        System.out.println("Salario total: $" + calcular_salario());
    }

    public double getBonoGerencial() {
        return bonoGerencial;
    }
}
