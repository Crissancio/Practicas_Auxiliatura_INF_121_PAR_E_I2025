/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5herencia;

/**
 *
 * @author CINTHIA
 */
public class Empleado {
    private String nombre,apellido;
    private double salarioBase;
    private int anosAntiguedad;
    public Empleado(String nombre,String apellido,double salarioBase,int anosAntiguedad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.salarioBase=salarioBase;
        this.anosAntiguedad=anosAntiguedad;
        
    }
    public void calcular_salario() {
        double s=salarioBase+(salarioBase*0.05*anosAntiguedad);
        System.out.println("Empleado: " + nombre + " " + apellido);
        System.out.println("Salario: " + s);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getAnosAntiguedad() {
        return anosAntiguedad;
    }

    public void setAnosAntiguedad(int anosAntiguedad) {
        this.anosAntiguedad = anosAntiguedad;
    }
    
}
