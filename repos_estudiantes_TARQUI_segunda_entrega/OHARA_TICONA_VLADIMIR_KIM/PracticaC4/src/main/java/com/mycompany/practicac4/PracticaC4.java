/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practicac4;

/**
 *
 * @author Usuario
 */
public class PracticaC4 {

    public static void main(String[] args) {
        Universidad universidad = new Universidad("Universidad Nacional");
        Estudiante e1 = new Estudiante("Ana", "Ingeniería", 3);
        Estudiante e2 = new Estudiante("Luis", "Derecho", 5);
        Estudiante e3 = new Estudiante("Sofía", "Medicina", 2);

        universidad.agregarEstudiante(e1);
        universidad.agregarEstudiante(e2);
        universidad.agregarEstudiante(e3);

        universidad.mostrarU();
    }
}
