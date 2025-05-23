/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prac2_5;

/**
 *
 * @author WINDOWS 11
 */
    public class Empleado {
    protected String nombre;
    protected String apellido;
    protected double salarioBase;
    protected int añosAntiguedad;

    public Empleado(String nombre, String apellido, double salarioBase, int añosAntiguedad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioBase = salarioBase;
        this.añosAntiguedad = añosAntiguedad;
    }

    public double calcularSalario() {
        return salarioBase + (salarioBase * 0.05 * añosAntiguedad);
    }

    public void mostrar() {
        System.out.println(nombre + " " + apellido + " - Salario: " + calcularSalario());
    }
}


