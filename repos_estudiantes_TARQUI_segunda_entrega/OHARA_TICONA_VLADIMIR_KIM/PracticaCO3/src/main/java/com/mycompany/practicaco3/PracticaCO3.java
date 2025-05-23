/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practicaco3;

/**
 *
 * @author Usuario
 */
class Estudiante {
    String nombre;
    double nota1;
    double nota2;

    public Estudiante(String nombre, double nota1, double nota2) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double promedio() {
        return (nota1 + nota2) / 2;
    }

    public boolean aprobo() {
        return promedio() >= 6;
    }
}
public class PracticaCO3{
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Carlos", 7, 8);
        Estudiante e2 = new Estudiante("Lucía", 5, 6);
        Estudiante e3 = new Estudiante("Pedro", 4, 3);

        Estudiante[] estudiantes = {e1, e2, e3};
        for (Estudiante e : estudiantes) {
            System.out.println(e.nombre + " - Promedio: " + e.promedio() + " - Aprobó: " + e.aprobo());
        }
    }
}
