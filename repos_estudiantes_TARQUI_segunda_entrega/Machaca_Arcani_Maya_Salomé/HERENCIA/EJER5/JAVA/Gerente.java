/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJER5;

/**
 *
 * @author LENOVO
 */
public class Gerente extends Empleado{
    private String departamento;
    private double bonoGerencial;

    public Gerente(String nombre, String apellido, double salarioBase, int añosAntiguedad,
                   String departamento, double bonoGerencial) {
        super(nombre, apellido, salarioBase, añosAntiguedad);
        this.departamento = departamento;
        this.bonoGerencial = bonoGerencial;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonoGerencial;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Departamento: " + departamento);
        System.out.println("Bono gerencial: " + bonoGerencial);
    }

    public double getBonoGerencial() { return bonoGerencial; }
}
