/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicach3;
public class Desarrollador extends Empleado {
    private String lenguajeProgramacion;
    private int horasExtras;

    public Desarrollador(String nombre, String apellido, double salarioBase, int añosAntiguedad,
                         String lenguajeProgramacion, int horasExtras) {
        super(nombre, apellido, salarioBase, añosAntiguedad);
        this.lenguajeProgramacion = lenguajeProgramacion;
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        double pagoHorasExtras = horasExtras * 20;
        return super.calcularSalario() + pagoHorasExtras;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Lenguaje: " + lenguajeProgramacion + ", Horas Extras: " + horasExtras);
    }
}
