package Ejercicio7;

import java.util.ArrayList;

public class Universidad {
    private String nombre;
    private ArrayList<Estudiante> estudiantes;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public void agregar_estudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void mostrar_universidad() {
        System.out.println("Universidad: " + this.nombre);
        System.out.println("Estudiantes:");
        for (Estudiante e : estudiantes) {
            e.mostrar_info();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
