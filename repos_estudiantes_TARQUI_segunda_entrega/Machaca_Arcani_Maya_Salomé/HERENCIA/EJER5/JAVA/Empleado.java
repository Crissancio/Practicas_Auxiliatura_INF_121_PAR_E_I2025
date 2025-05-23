/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJER5;

/**
 *
 * @author LENOVO
 */
public class Empleado {
    private String nombre;
    private String apellido;
    private double salarioBase;
    private int añosAntiguedad;

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
        System.out.println(nombre + " " + apellido);
        System.out.println("Salario base: " + salarioBase);
        System.out.println("Anios de antiguedad: " + añosAntiguedad);
    }

    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public double getSalarioBase() { return salarioBase; }
    public int getAñosAntiguedad() { return añosAntiguedad; }
}

