/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Fabricio
 */
public class Persona {
     String ci, nombre, apellido, celular;
     int añoNacimiento;

    public Persona(String ci, String nombre, String apellido, String celular, int añoNacimiento) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.añoNacimiento = añoNacimiento;
    }

    public int calcularEdad(int añoActual) {
        return añoActual - añoNacimiento;
    }

    public void mostrar() {
        System.out.println(nombre + " " + apellido + " (CI: " + ci + ")");
    }
    
}
