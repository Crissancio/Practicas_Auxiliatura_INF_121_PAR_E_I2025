/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pejercicio3;

/**
 *
 * @author WINDOWS 11
 */

    
    public class Cocinero {

    private String nombre;
    private int sueldoMes;
    private int horasExtra;
    private float sueldoHora;

   
    public Cocinero(String nombre, int sueldoMes, int horasExtra, float sueldoHora) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
    }

    public float calcularSueldo() {
        return sueldoMes;
    }


    public float calcularSueldo(boolean incluirExtras) {
        if (incluirExtras) {
            return sueldoMes + (horasExtra * sueldoHora);
        } else {
            return sueldoMes;
        }
    }

   
    public void mostrarDatos() {
        System.out.println(" " + nombre);
        System.out.println("Horas extra: " + horasExtra);
        System.out.println("Sueldo por hora extra: " + sueldoHora);
        System.out.println("//////////");
    }


    public void mostrar(boolean mostrarSueldo) {
        mostrarDatos(); 
        if (mostrarSueldo) {
            System.out.println("Sueldo total: " + calcularSueldo(true));
            System.out.println("==============================");
        }
    }

}


