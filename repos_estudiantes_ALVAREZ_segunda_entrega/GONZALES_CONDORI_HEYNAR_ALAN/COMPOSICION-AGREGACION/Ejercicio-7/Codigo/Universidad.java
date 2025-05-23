
package Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Estudiante> estudiantes;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public void agregar_estudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void mostrar_universidad() {
        System.out.println("Universidad: " + nombre);
        System.out.println("Estudiantes:");
        for (Estudiante e : estudiantes) {
            e.mostrar_info();
            System.out.println();
        }
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public List<Estudiante> getEstudiantes() { return estudiantes; }

    public void setNombre(String nombre) { this.nombre = nombre; }
}

