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
public class Desarrollador extends Empleado{
    private String lenguajeProgramacion;
    private int horasExtras;

    public Desarrollador(String lenguajeProgramacion, int horasExtras, String nombre, String apellido, double salarioBase, int aniosAntiguedad) {
        super(nombre, apellido, salarioBase, aniosAntiguedad);
        this.lenguajeProgramacion = lenguajeProgramacion;
        this.horasExtras = horasExtras;
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
     public double calcularSalario() {
        return super.calcularSalario() + (horasExtras * 20); // $20 por hora extra
    }
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Lenguaje: " + lenguajeProgramacion);
        System.out.println("Horas Extras: " + horasExtras);
    }
}
