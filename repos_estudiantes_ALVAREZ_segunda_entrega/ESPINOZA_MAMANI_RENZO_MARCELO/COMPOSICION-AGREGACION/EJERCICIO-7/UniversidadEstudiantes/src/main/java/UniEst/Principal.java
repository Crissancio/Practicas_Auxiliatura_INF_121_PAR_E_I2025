/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UniEst;

/**
 *
 * @author Renzo
 */
public class Principal {
     public static void main(String[] args) {
        // Crear estudiantes
        Estudiante e1 = new Estudiante("Renzo Espinoza", "Informática", 5);
        Estudiante e2 = new Estudiante("Lucía Martínez", "Matemáticas", 3);
        Estudiante e3 = new Estudiante("Carlos Ríos", "Física", 7);

        // Crear universidad
        Universidad uni = new Universidad("Universidad de San Marcos");

        // Agregar estudiantes
        uni.agregarEstudiante(e1);
        uni.agregarEstudiante(e2);
        uni.agregarEstudiante(e3);

        // Mostrar información
        uni.mostrarUniversidad();
    }
}
