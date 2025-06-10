
package ejercicio7;


import java.util.ArrayList;
import java.util.List;

public class Univercidad {
    private String nombre;
    private List<Estudiante> estudiantes;

    public Univercidad(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void mostrarUnivercidad() {
        System.out.println("Universidad: " + nombre);
        System.out.println("Estudiantes:");
        for (Estudiante e : estudiantes) {
            e.mostrarInfo();
        }
    }
}

