/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pejercicio3;

/**
 *
 * @author WINDOWS 11
 */
public class Mesero {
    private String nombre;
    private int sueldoMes;
    private int propinas;

    // Constructor
    public Mesero(String nombre, int sueldoMes, int propinas) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.propinas = propinas;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo base: " + sueldoMes);
        System.out.println("Propinas: " + propinas);
    }

    public void mostrar(boolean conTotal) {
        if (conTotal) {
            System.out.println("Nombre: " + nombre);
            System.out.println("Sueldo total: " + calcularSueldo(true));
        } else {
            mostrar();
        }
    }

    public int calcularSueldo() {
        return sueldoMes + propinas;
    }

    public int calcularSueldo(boolean incluirPropinas) {
        if (incluirPropinas) {
            return sueldoMes + propinas;
        } else {
            return sueldoMes;
        }
    }
}
