/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author Usuario
 */
import java.util.*;

class Estudiante {
    private String nombre;
    private String carrera;
    private int semestre;

    public Estudiante(String nombre, String carrera, int semestre) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public void mostrar_info() {
        System.out.println("Nombre: " + nombre + ", Carrera: " + carrera + ", Semestre: " + semestre);
    }
}

class Universidad {
    private String nombre;
    private List<Estudiante> estudiantes;

    public Universidad(String nombre) {
        this.nombre = nombre;
        estudiantes = new ArrayList<>();
    }

    public void agregar_estudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public void mostrar_universidad() {
        System.out.println("Universidad: " + nombre);
        for (Estudiante e : estudiantes) {
            e.mostrar_info();
        }
    }
}
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Universidad umsa = new Universidad("UMSA");
        Estudiante e1 = new Estudiante("Lucía", "Informática", 6);
        Estudiante e2 = new Estudiante("Mario", "Matemáticas", 3);
        umsa.agregar_estudiante(e1);
        umsa.agregar_estudiante(e2);
        umsa.mostrar_universidad();
    }
    
}
