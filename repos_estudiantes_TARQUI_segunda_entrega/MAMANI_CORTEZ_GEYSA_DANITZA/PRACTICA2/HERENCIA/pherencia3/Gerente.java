/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pherencia3;

/**
 *
 * @author Administrador
 */
public class Gerente extends Empleado{
    private String departamento;
    private double bonoGerencial;

    public Gerente(String departamento, double bonoGerencial, String nombre, String apellido, double salarioBase, int aniosAntiguedad) {
        super(nombre, apellido, salarioBase, aniosAntiguedad);
        this.departamento = departamento;
        this.bonoGerencial = bonoGerencial;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getBonoGerencial() {
        return bonoGerencial;
    }

    public void setBonoGerencial(double bonoGerencial) {
        this.bonoGerencial = bonoGerencial;
    }
    
    public double calcularSalario() {
        return super.calcularSalario() + bonoGerencial;
    }
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Departamento: " + departamento);
        System.out.println("Bono Gerencial: $" + bonoGerencial);
    }
}
