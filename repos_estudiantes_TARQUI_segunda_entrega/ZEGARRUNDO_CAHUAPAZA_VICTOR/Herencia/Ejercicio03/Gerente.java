package Herencia3;

public class Gerente extends Empleado {
    private String departamento;
    private int bonoGerencial;

    public Gerente(String nombre, String apellido, int salarioBase, int aniosAntiguedad, String departamento, int bonoGerencial) {
        super(nombre, apellido, salarioBase, aniosAntiguedad);
        this.departamento = departamento;
        this.bonoGerencial = bonoGerencial;
    }

    public int calcularSalario() {
        return super.calcularSalario() + bonoGerencial;
    }

    public int getBonoGerencial() {
        return bonoGerencial;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Departamento: " + departamento + ", Bono Gerencial: " + bonoGerencial);
    }
}
