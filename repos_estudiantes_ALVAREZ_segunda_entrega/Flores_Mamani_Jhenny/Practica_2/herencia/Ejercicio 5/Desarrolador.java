/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prac2_5;

/**
 *
 * @author WINDOWS 11
 */
public class Desarrolador extends Empleado {
    private String lenguajeProgramacion;
    private int horasExtras;
    private final double pagoPorHoraExtra = 20.0;

    public Desarrolador(String nombre, String apellido, double salarioBase, int añosAntiguedad,
                         String lenguajeProgramacion, int horasExtras) {
        super(nombre, apellido, salarioBase, añosAntiguedad);
        this.lenguajeProgramacion = lenguajeProgramacion;
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (horasExtras * pagoPorHoraExtra);
    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    
    @Override
    public void mostrar() {
        System.out.println("Desarrollador: " + nombre + " " + apellido +
                "  Lenguaje: " + lenguajeProgramacion + " - Salario: " + calcularSalario());
    }
}

