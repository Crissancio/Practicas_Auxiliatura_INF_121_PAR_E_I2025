/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJER5;

/**
 *
 * @author LENOVO
 */
public class Desarrollador extends Empleado{
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
        return super.calcularSalario() + (horasExtras * 50);
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Lenguaje: " + lenguajeProgramacion);
        System.out.println("Horas extras: " + horasExtras);
    }

    public int getHorasExtras() { return horasExtras; }
}   
