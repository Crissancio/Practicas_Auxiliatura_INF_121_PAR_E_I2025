/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio5;

/**
 *
 * @author WINDOWS 11
 */

     public class Estudiante {
    private String nombre;
    private  int nota1;
    private int nota2;

    public Estudiante(String nombre, int nota1, int nota2) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public int calcularPromedio() {
        return (nota1 + nota2) / 2;
    }

    public boolean aprobo() {
        return calcularPromedio() >= 6; 
     
    }

 public void mostrar() {
    System.out.println(nombre + " " + calcularPromedio() + " - ¿Aprobó?: " + (aprobo() ? "Sí" : "No"));
}

   }
    

