/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prac2_5;

/**
 *
 * @author WINDOWS 11
 */
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
    public double calcularSalario() {
        return super.calcularSalario() + bonoGerencial;
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

    
    @Override
    public void mostrar() {
        
        System.out.println("Gerente: " + nombre + " " + apellido +
                " - Departamento: " + departamento + " - Salario: " + calcularSalario());
    }
}

